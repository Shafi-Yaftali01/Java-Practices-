package main;

import bank.BankAccount;


public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.accountHolder = "Alex";
    account.accountNumber = 123456789;
    account.balance = 1000000.40;

    System.out.println("Account Holder Name: " + account.accountHolder);
    System.out.println("Account Number: " + account.accountNumber);
    System.err.println("Account Balance: " + account.balance);
  }
}
