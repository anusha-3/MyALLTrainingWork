package operation;


import java.util.*;

import customexception.*;
import entity.Account;

public class AccountOperation {
    List<Account> allAccount = new ArrayList<>();

    public Account addAccount(String name, String location, int balance) {
        Random rand = new Random();
        int accountNumber = rand.nextInt(100000000);

        Account ac = new Account(accountNumber, name, balance, location);
        allAccount.add(ac);

        return ac;
    }

    public Account searchAccountByID(int accountNumber) throws AccountException {
        for (Account ac : allAccount) {
            if (ac.getAccountNumber() == accountNumber) {
                return ac;
            }

        }
        throw new AccountException(accountNumber);
    }

    public List<Account> displayAccountByLocation(String location) {
        List<Account> temp = new ArrayList<>();
        for (Account ac : allAccount) {
            if (ac.getLocation().equals(location)) {
                temp.add(ac);
            }
        }

        return temp;

    }

    public List<Account> accountWithinRange(int startAmount, int endAmount) {
        List<Account> temp = new ArrayList<>();
        for (Account ac : allAccount) {
            if (ac.getBalance() >= startAmount && ac.getBalance() <= endAmount) {
                temp.add(ac);
            }
        }
        return temp;
    }

    public int depositAmount(int accountNumber, int amount) throws AccountException {
        Account account = searchAccountByID(accountNumber);
        int accountIndex = allAccount.indexOf(account);
        allAccount.get(accountIndex).setBalance(allAccount.get(accountIndex).getBalance() + amount);
        return allAccount.get(accountIndex).getBalance();

    }

    public int withdrwalAmount(int accountNumber, int amount) throws Exception {
        Account account = searchAccountByID(accountNumber);

        if ((account.getBalance() - amount) >= 5000) {
            int accountIndex = allAccount.indexOf(account);
            allAccount.get(accountIndex).setBalance(allAccount.get(accountIndex).getBalance() - amount);
            return allAccount.get(accountIndex).getBalance();
        } else {
            throw new LowBalanceException(accountNumber);
        }

    }

    public boolean fundTransfer(int senderAccountNumber, int receiverAccountNumber, int amount) throws Exception {
        Account senderAccount = searchAccountByID(senderAccountNumber);
        Account receiverAccount = searchAccountByID(receiverAccountNumber);

        if ((senderAccount.getBalance() - amount) >= 5000) {
            int senderAccountIndex = allAccount.indexOf(senderAccount);
            allAccount.get(senderAccountIndex).setBalance(allAccount.get(senderAccountIndex).getBalance() - amount);

            int receiverAccountIndex = allAccount.indexOf(receiverAccount);
            allAccount.get(receiverAccountIndex).setBalance(allAccount.get(receiverAccountIndex).getBalance() + amount);

            return true;

        } else {
            throw new LowBalanceException(senderAccountNumber);
        }

    }
}
