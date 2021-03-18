package bank;

import java.util.HashMap;
import java.util.Map;

public class AccountDatabase {
    private Map<Integer, Account> accounts;

    public AccountDatabase(){
        accounts = new HashMap<>();
    }

    public void addAccount(int accountNumber, Account account){
        if(this.accounts.get(accountNumber) != null){
            throw new IllegalArgumentException("Account to add already exists!");
        }

        this.accounts.put(accountNumber, account);
        System.out.println("Account added!");
    }

    public void updateAccount(int accountNumber, Account account){
        if(this.accounts.get(accountNumber) == null){
            throw new IllegalArgumentException("Account to update doesn't exist!");
        }

        this.accounts.put(accountNumber, account);
        System.out.println("Account updated!");
    }

    public void removeAccount(int accountNumber){
        if(this.accounts.get(accountNumber) == null){
            throw new IllegalArgumentException("Account to remove doesn't exist!");
        }

        this.accounts.remove(accountNumber);
        System.out.println("Account removed!");
    }

    public Account findAccount(int accountNumber){
        if(this.accounts.get(accountNumber) == null){
            throw new IllegalArgumentException("Account to find doesn't exist!");
        }

        return this.accounts.get(accountNumber);
    }

    public Map<Integer,Account> findAll(){

        return this.accounts;
    }

    public void withdraw(int accountNumber, double withdrawAmount){
        Account account = this.accounts.get(accountNumber);

        if(account == null){
            throw new IllegalArgumentException("Account to find doesn't exist!");
        }
        if(withdrawAmount > account.getBalance()){
            throw new IllegalArgumentException("Not enough balance: " + account.getBalance());
        }

        account.setBalance(account.getBalance() - withdrawAmount);

        System.out.println("Withdrawn successfully! Balance : " + account.getBalance());
    }

    public void deposit(int accountNumber, double depositAmount){
        Account account = this.accounts.get(accountNumber);

        if(account == null){
            throw new IllegalArgumentException("Account to find doesn't exist!");
        }

        account.setBalance(account.getBalance() + depositAmount);

        System.out.println("Deposited successfully! Balance : " + account.getBalance());
    }
}
