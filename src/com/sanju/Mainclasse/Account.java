package com.sanju.Mainclasse;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private double balance;
	private  int accountNo;
    private List<Transaction> transactionHistory;
      
    public Account(int accountNo, double balance ) {
               this.accountNo = accountNo;
               this.balance = balance;
               this.transactionHistory = new ArrayList<Transaction>();
    }
               public Account() {
                  super();
               }          
    
	   public Account(double initialBalance) {
		this.balance = initialBalance;
        this.transactionHistory = new ArrayList<Transaction>();

	 }
	   public int getaccountNO() {
		   return accountNo;
	   }
	
	public void deposit(double amount) {
		balance += amount;
		recordTransaction("deposit",amount);
	}
	
	public void withdraw(double amount) {
			if(amount <= balance) {
				balance-=amount;
				recordTransaction("Withdrawl", amount);
				}
				else {
				System.out.println("Insufficient Balance...");
		   }
	}
	
	public void transfer(Account targetAccountNo, double amount) {
		if(amount <= balance) {
			balance -= amount;
			targetAccountNo.deposit(amount);
			recordTransaction("Transfer", amount, targetAccountNo.accountNo);
		}else {
			System.out.println("Insufficient Amount for Transfer.");
		}
	}
	
	 public void displayTransactionHistory() {
		 System.out.println("Transaction History:");
		  for (Transaction transaction : transactionHistory) {
			System.out.println(transaction.toString());
		}
		 System.out.println("Current Balance:" + balance);
	 }
	
	
	private void recordTransaction(String type, double amount,int targetaccountNo ) {
		transactionHistory.add(new Transaction(type, amount,targetaccountNo));
	}
	 
	private void recordTransaction(String type,double amount) {
	      transactionHistory.add(new Transaction(type, amount));
	       }
}
