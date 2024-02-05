package com.sanju.Mainclasse;

import java.util.Scanner;

import com.sanju.CustomerDetails;

public class ATM {
			 private  static Account account =  new Account(10000);
		     private static int accountno;
		     private static int pin;
		     private static int count =3;
		     private  static CustomerDetails customer =   new CustomerDetails();
		     private static Scanner scanner = new Scanner(System.in);
		     static String  choice;
	          public static void main(String[] args) {
						            System.out.println("Welcome to ATM....Plz Enter your Account-No and Pin to Continue...");
						            for(int attempts=1; attempts<=count ;attempts++) {
						        	try {
							            System.out.println("AccountNo:");
							             accountno = scanner.nextInt();
							            System.out.println("Enter Pin:");
							            pin = scanner.nextInt();
						        	 } 
						        	catch (Exception e) {
						        		e.printStackTrace();
						        	}
				            		if(accountno ==customer.getAccountNo() && pin == customer.getPin()){
			                       System.out.println("Login Successfully... ");
			                       displayOptionsMenu();
			                       int userChoice;
			                       do {
		                    	   System.out.println("Enter Your choice(1-5)");
			                         userChoice = scanner.nextInt();
			                         switch (userChoice) {
							  case 1: 
									//Deposit..
								        Deposit.execute(account, scanner);
								     break;
								case 2:
									//withdraw
									 Withdraw.execute(account, scanner);
									break;
								case 3:
										//Transfer
									    Transfer.execute(account, scanner);
										break;
								case 4:
										//Display Transaction History
										account.displayTransactionHistory();
										break;
								case 5 :
										//Exit
										Quit.execute();
										break;
										default:
			                            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
										throw new IllegalArgumentException("Unexpected value: " + userChoice);
								 }
                        }
                       while(userChoice!=5);
                       break;
	     			} else{
	    				int remainingattempts = count - attempts;
	    	             if(remainingattempts >0) {
	    	            	 System.out.println("Wrong Pin or AccountNo... plzz check u have "+remainingattempts+" attempts reamining");
	    	             } else {
	    	            	 System.out.println("Sorry, you've exceeded the maximum number of attempts. Your account is now blocked.");
	    	    	   }
	    	        }
	          }  
	      }
		 
		   private static void displayOptionsMenu() {
		        System.out.println("\nOptions Menu:");
		        System.out.println("1. Deposit");
		        System.out.println("2. Withdraw");
		        System.out.println("3. Transfer");
		        System.out.println("4. Display Transaction History");
		        System.out.println("5. Exit");
		    }
   }
