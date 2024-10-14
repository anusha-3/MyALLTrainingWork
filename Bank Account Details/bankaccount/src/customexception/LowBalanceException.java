package customexception;

public class LowBalanceException extends Exception {
    int accountNumber;

    public LowBalanceException(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "[LowBalanceException] Account Number: " + accountNumber + " does not have sufficient balance";
    }

}
