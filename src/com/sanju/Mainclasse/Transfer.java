package com.sanju.Mainclasse;

import java.util.Scanner;

public class Transfer {
	public static void execute( Account sourceAccount ,Scanner scanner) {
		 System.out.println("Enter Account Number to Transfer:");
	        int targetAccountNo = scanner.nextInt();
	       Account targetAccount = Accounts.getAccountByAccountNo(targetAccountNo);
	        if (targetAccount != null) {
	            System.out.println("Enter amount to Transfer:");
	            double transferAmount = scanner.nextDouble();
	            sourceAccount.transfer(targetAccount, transferAmount);
	            System.out.println("Transferred Successfully to: "+targetAccountNo);
	        } else {
	            System.out.println("Tarnsfer Account Number not Found...");
	        }
	}

}
