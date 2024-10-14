import java.io.*;
import java.util.*;

import customexception.*;
import entity.Account;
import operation.AccountOperation;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    AccountOperation ops = new AccountOperation();

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        while (true) {

            System.out.println("1. Add Account");
            System.out.println("2. Search Account Based on Account number ");
            System.out.println("3. Display Accounts by Location");
            System.out.println("4. Deposit");
            System.out.println("5. Withdrwal");
            System.out.println("6. Fund Transfer");
            System.out.println("7. Display Accounts within Range");
            System.out.println("0. EXIT");

            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    app.addAccount();
                    break;
                case 2:
                    app.searchAccountByID();
                    break;
                case 3:
                    app.displayAccountByLocation();
                    break;

                case 4:
                    app.depositAmount();
                    break;
                case 5:
                    app.withdrwalAmount();
                    break;

                case 6:
                    app.fundTransfer();
                    break;

                case 7:
                    app.accountWithinRange();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Wrong Option");
                    break;
            }
        }

    }

    public void addAccount() throws IOException {
        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = br.readLine();
        System.out.println("Location: ");
        String location = br.readLine();
        System.out.println("Enter Openning Balance (Greater than 5000): ");
        int balance = Integer.parseInt(br.readLine());

        if (balance < 5000) {
            System.out.println("Openning Balance should be greater than 5000");
            return;
        }

        Account ac = ops.addAccount(accountHolderName, location, balance);
        if (ac != null) {
            System.out.println("Account Added Successfully");
            System.out.println(ac);
        } else
            System.out.println("Account Addition Failed");

    }

    public void searchAccountByID() throws IOException {
        System.out.println("Enter Account Number: ");
        int accountNumber = Integer.parseInt(br.readLine());
        try {
            Account ac = ops.searchAccountByID(accountNumber);
            System.out.println(ac);
        } catch (AccountException e) {
            System.out.println(e);
        }

    }

    public void displayAccountByLocation() throws IOException {
        System.out.println("Enter Location: ");
        String location = br.readLine();
        List<Account> ac = ops.displayAccountByLocation(location);
        if (!ac.isEmpty()) {
            System.out.println(ac);
        } else
            System.out.println("No Account found for this location.");

    }

    public void accountWithinRange() throws IOException {
        System.out.println("Enter Start Amount: ");
        int startAmount = Integer.parseInt(br.readLine());
        System.out.println("Enter End Amount: ");
        int endAmount = Integer.parseInt(br.readLine());

        List<Account> ac = ops.accountWithinRange(startAmount, endAmount);
        if (!ac.isEmpty()) {
            System.out.println(ac);
        } else
            System.out.println("No Account found in this range.");

    }

    public void depositAmount() throws IOException {
        System.out.println("Enter Account Number: ");
        int accountNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter The Amount You Want to Deposit: ");
        int amount = Integer.parseInt(br.readLine());

        try {
            int currentBalance = ops.depositAmount(accountNumber, amount);
            System.out.println("Current Balance: " + currentBalance);
        } catch (AccountException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    private void withdrwalAmount() throws IOException {
        System.out.println("Enter Account Number: ");
        int accountNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter The Amount You Want to Withdraw: ");
        int amount = Integer.parseInt(br.readLine());

        try {
            int currentBalance = ops.withdrwalAmount(accountNumber, amount);
            System.out.println("Current Balance: " + currentBalance);
        } catch (AccountException | LowBalanceException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    private void fundTransfer() throws IOException {
        System.out.println("Enter Sender's Account Number: ");
        int senderAccountNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter Receiver's Account Number: ");
        int receiverAccountNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter The Amount You Want to transfar: ");
        int amount = Integer.parseInt(br.readLine());

        try {
            boolean status = ops.fundTransfer(senderAccountNumber, receiverAccountNumber, amount);
            if (status) {
                System.out.println("Transfer Successfull");
            } else {
                System.out.println("Transaction Failed");
            }
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        } catch (LowBalanceException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}