package com.sanju.Mainclasse;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
                private static List<Account> accounts = new ArrayList<>();
                //static block  executed only once when the class is loaded. 
                static {
                	// Transfer accounts...
                	  	accounts.add(new Account(1040501, 5000.55));
                	    accounts.add(new Account(1040502, 7000.5));
                	    accounts.add(new Account(1040503, 10000.50));
                }
                /**
				 * @return the accounts
				 */
				public static List<Account> getAccounts() {
					return accounts;
				}

				public static Account  getAccountByAccountNo(int targetAccountNo){
                	 for (Account accountsNo : accounts) {
						    if(accountsNo.getaccountNO() == targetAccountNo)
						    	return accountsNo;
					}
                	 return null;
                 }
}
