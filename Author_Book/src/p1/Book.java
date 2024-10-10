package p1;

public class Book {
    private String bookTitle;
    private int cost;
    private String language;

    public Book() {
    }

    public Book(String bookTitle, int cost, String language) {
        this.bookTitle = bookTitle;
        this.cost = cost;
        this.language = language;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    @Override
    public String toString(){
        return "Book{" +
                "Book Title: " +
                ", Cost: " + cost +
                ", Language: " + language +
                '}';
    }
}
