package entity;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private String location;

    public Account() {

    }

    public Account(int accountNumber, String accountHolderName, int balance, String location) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.location = location;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Account Details: [Account Holder Name: " + accountHolderName +
                ", Account Number: " + accountNumber +
                ", Location: " + location +
                ", Balance: " + balance +
                "]";
    }

}
