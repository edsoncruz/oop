package bank;

import bank.Account;

import java.util.*;

public class Bank {
    public static void main(String[] args) {

        AccountDatabase accountDatabase = new AccountDatabase();

        Account c1 = new Account();
        c1.setName("John Smith");
        c1.setBalance(1300.00);

        Account c2 = new Account();
        c2.setName("Kim Murphy");
        c2.setBalance(5800.00);

        Account c3 = new Account();
        c3.setName("Joe Scott");
        c3.setBalance(12100.00);

        accountDatabase.addAccount(5540,c1);
        accountDatabase.addAccount(6842,c2);
        accountDatabase.addAccount(9967,c3);




        System.out.println("\n<<<<<<<<<<< Database Dump >>>>>>>>>>>");
        for (Map.Entry<Integer,Account> account: accountDatabase.findAll().entrySet()) {
            System.out.println(account);
        }
    }
}
