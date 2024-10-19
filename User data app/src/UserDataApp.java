
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class UserDataApp {

    User allUsers[] = new User[5];
    int indexCount = 0;
    UserService userService = new UserService();
    EmailService emailService = new EmailService();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public User[] getAllUser() {
        return this.allUsers;
    }

    public boolean addUser(String username, String password, String email) throws IOException {

        String[] name = username.split(" ");
        String firstName = name[0];
        String lastName = name[1];

        boolean insertStatus = false;
        boolean isValid = userService.doEmailDomainVerification(email);
        if (isValid) {
            Random random = new Random();
            int userId = random.nextInt(100);
            // create user Object through constructor , pass all three arguments
            User user = new User(email, firstName, lastName, userId);
            // insert user object in allUsers[]
            allUsers[indexCount] = user;
            indexCount++;

            // change insert status to true
            insertStatus = true;
            System.out.println(user);
        }
        return insertStatus;

    }

    public User getUserBasedOnId(int userId) throws IOException {
        // Write code to search user from allUsers based on given UserId

        System.out.println("Enter User ID: ");
        userId = Integer.parseInt(br.readLine());

        for (User user : allUsers) {
            if (user.getUserId() == userId) {
                return user;
            }
        }

        return null;
    }

    public User getUserByEmail(String email) throws IOException {

        for (User user : allUsers) {
            if (user.getEmail().equals(email))
                return user;
        }
        return null;
    }

    public boolean verifyEmailAndUserDetails(int userId) throws IOException {
        User user = getUserBasedOnId(userId);
        if (user != null) {
            // write code to verify that user email contains their firstName & lastName ,
            // through using
            // UserService isWordContains() method
            /*
             * Sample output
             * for example
             * User Name is : Rahul Kumar
             * Email : rahul@gmail.com : it should return false
             * Email : rKumar@gmail.com : it should return false
             * Email : abc@gmail.com : it should return false
             *
             * Email : rahul.kumar@gmail.com : it should return true
             * Email : rahul.kumar.1@gmail.com : it should return true
             * Email : abc.rahul.kumar@gmail.com : it should return true
             *
             */

            boolean firstName = userService.isWordContains(user.getFirstName(), user.getEmail());
            boolean lastName = userService.isWordContains(user.getLastName(), user.getEmail());

            if (firstName && lastName) {
                return true;
            }

        }
        return false;
    }

    public int countEmailsBasedOnDomain(String domainName) {

        // count the number of emails related to that domainName , write code inside
        // emialService
        int count = 0;
        for (User user : allUsers) {
            if (user != null) {
                if (user.getEmail().contains(domainName)) {
                    count++;
                }
            }

        }

        // send back the count number
        return count;
    }

    public static void main(String[] args) throws IOException {

        UserDataApp app = new UserDataApp();

        boolean isInserted = app.addUser("rahul kumar", "abc", "rahulkumar@gmail.com");
        if (isInserted) {
            System.out.println("User Added");// should print false;
        } else
            System.out.println("Failed");
        // also write case to print true;

        // ---------------------------------------------------

         int count = app.countEmailsBasedOnDomain("yahoo.com");
         System.out.println("Domain Name : Yahoo.com \t Available emails : " + count);

        // ---------------------------------------

        boolean isConsist = app.verifyEmailAndUserDetails(1);
        System.out.println("Is Consist " + isConsist);

        // --------------------------------------------

        System.out.println(app.getUserByEmail("rahulkumar@yahoo.com"));

    }

}