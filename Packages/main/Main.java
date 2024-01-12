package Packages.main;

import Packages.bank.BankAccount;


public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.accountHolder = "Alex";
    account.accountNumber = 123456789;
    account.balance = 1000000.40;
    
  }
}
