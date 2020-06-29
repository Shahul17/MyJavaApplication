package Evaluation3;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class RoughBankSimulator {
	Scanner scanner;
	
	
	  void sam() {
		 
		 // accountList.add(acct1);
		
	  }
	
    public static void main(String[] args) {
    	ArrayList<RoughAccount> accountList = new ArrayList<RoughAccount>();
  	  RoughAccount acct1 = new RoughAccount("tester1", 100.0);
  	  RoughAccount acct2 = new RoughAccount("tester2", 100.0);
  	 accountList.add(acct1);
	  accountList.add(acct2);
System.out.println("welcome to the transaction");
            System.out.println("Please enter a name to create an account ");
            Scanner scanner = new Scanner(System.in);
            RoughAccount a1 = new RoughAccount();
            a1.setName(scanner.next());
           
            System.out.println("Please enter a Account number to create an account ");
            a1.setNumber(scanner.next());
            System.out.println("Account name: " + a1.getName());
            System.out.println("Account number: " + a1.getNumber());

        int count = 0;
        while(count == 0) {

                System.out.println("MENU FOR USER"  + "\n" +
              // " 1 : Change account name: "  + "\n" +
                " 2 :  Print account Details:"  + "\n" +
                " 3 : Check balance:"  + "\n" + 
                " 4 : Add money to balance: "  + "\n" +
                " 5 : Withdraw money from balance:" + "\n" +
                " 6 : To transfer funds between accounts: " + "\n" +
                " 7 : Exit program:");

                int toDo = scanner.nextInt();

            if(toDo == 1) {
            	// accountList.add(acct1);
                   /* System.out.println("Enter new account name: ");
                    a1.setName(scanner.next());
                    System.out.println("Account name: " + a1.getName());*/
            }
            else if(toDo == 2) {
                System.out.println("Account name: " + a1.getName());
                System.out.println("Account number: " + a1.getNumber());
            }
            else if(toDo == 3) {
                System.out.println("Current balance: $" + a1.getBalance());
            }
            else if(toDo == 4) {
                System.out.println("Desired amount to add: $");
                a1.addFunds(scanner.nextDouble());
                System.out.println("Money successfully added to balance."); 
            }
            else if(toDo == 5) {
                System.out.println("Desired amount to withdraw: $");
                a1.withdraw(scanner.nextDouble());
                System.out.println("Money successfully withdrawn from balance.");
            }
            else if(toDo == 6) {
                System.out.println("Enter the transfer money fromaccount:");
                String fromAccount = scanner.next();
                System.out.println("Enter the  transfer money toaccount:");
                String toAccount = scanner.next();
                System.out.println("Enter the amount of money you would like to transfer: $");
                double moneyToTransfer = scanner.nextDouble();}
        //this is what i need help with, I don't know what to do with these three things, and since the first two arent accounts, i cant run the transfer method on them
                else if (toDo == 6) {
      			  if (accountList.size() > 2) {
      				  scanner = new Scanner(System.in);
      			    System.out.println("Enter the account you would like to transfer money from:");
      			    String fromAccount = scanner.next();
      			    System.out.println("Enter the account you would like to transfer money to:");
      			    String toAccount = scanner.next();
      			    System.out.println("Enter the amount of money you would like to transfer: $");
      			    double moneyToTransfer = scanner.nextDouble();

      			    for (RoughAccount account : accountList) {
      			      if (account.getName().equals(fromAccount)) {
      			        account.withdraw(moneyToTransfer);
      			      }
      			      if (account.getName().equals(toAccount)) {
      			        account.addFunds(moneyToTransfer);
      			      }
      			    }
      			  } else 
      			    System.out.println("Cannot transfer.");
      			  }

            
            else if(toDo == 7) {
                System.out.println("Thank you for using our banking system. Until next time.");
                count = 1;

            }
        }
    
}}