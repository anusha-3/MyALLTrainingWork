package p1;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MainClass {
    Scanner sc = new Scanner(System.in);
//    Author a = new Author();
    Author allAuthors[] = new Author[100];
    int position = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main (String[] args) throws IOException{
        MainClass app = new MainClass();
        while(true) {
            System.out.println("---- MENU -----");
            System.out.println("1. Add Author");
            System.out.println("2. Add Book");
            System.out.println("3. Show all Authors");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");

            int choice = new Scanner(System.in).nextInt();
            switch (choice) {

                case 0: System.exit(0);

                case 1: app.addAuthor();
                    break;
                case 2: app.addBook();
                    break;
                case 3: app.showAllAuthor();
                    break;
                case 4: app.showAllNonNativeAuthor();
                    break;
                default:
                    System.out.println("Wrong option!!!");

            }
        }
    }


    public void addAuthor() throws IOException {

        System.out.println("Enter Author Name: ");
        String name = br.readLine();

        System.out.println("Enter Native Language: ");
        String nativeLanguage = br.readLine();

        System.out.println("Enter Second Language: ");
        String secondLanguage = br.readLine();

        allAuthors[position++]=new Author(name, nativeLanguage, secondLanguage, null);
        System.out.println("Employee Added Successfully");
    }
    public void addBook() throws IOException{

            System.out.println("Enter Author Name: ");
            String name = br.readLine();

            System.out.println("Enter Book Name: ");
            String bookName = br.readLine();

            System.out.println("Enter Cost: ");
            int cost = sc.nextInt();

            System.out.println("Enter Language: ");
            String language = br.readLine();
//            String language = "Bengali";

            Book book = new Book(bookName, cost, language);
            Author a = writtenBook(name, book);

            System.out.println("Successfully added");
    }
    public Author writtenBook(String searchName, Book bookName){
        if(getAuthorByName(searchName) != null){
            Author a = getAuthorByName(searchName);
            if(bookName !=null)
            {
                a.setBook(bookName);
                return a;
            }
            else return null;

        }
        else return null;
    }
    public Author getAuthorByName(String searchName) {

        for(int i = 0, y = position-1;true;i++,y--)
        {
            Author a = allAuthors[i];
            if(a.getAuthorName().equals(searchName))
            {
                return allAuthors[i];
            }
            if(allAuthors[y].getAuthorName().equals(searchName))
            {
                return allAuthors[y];
            }
        }

    }

    public void showAllAuthor() {

        for (int i = 0; i < position ; i++) {
            System.out.println(allAuthors[i]);
        }
    }

    public void showAllNonNativeAuthor(){

        for(int i = 0; i < position; i++){

            Book book = allAuthors[i].getBook();
            String nativeLanguage = allAuthors[i].getNativeLanguage();
            if(!book.getLanguage().equals(nativeLanguage)){
                System.out.println(allAuthors[i].toString());
            }
            else
                System.out.println("No Author");

        }
    }

}
