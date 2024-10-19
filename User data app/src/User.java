public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;

    public User(String email, String firstName, String lastName, int userId) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[User Email ID: " + email +
                ", Fisrt Name: " + firstName +
                ", Last Name: " + lastName +
                ", User ID: " + userId +
                "]";
    }

}