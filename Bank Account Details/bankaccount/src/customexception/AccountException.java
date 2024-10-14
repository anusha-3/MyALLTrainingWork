package customexception;
public class AccountException extends Exception {

    int accountNumber;

    public AccountException(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "[AccountException] Account Number: " + accountNumber + " not found";
    }

}
