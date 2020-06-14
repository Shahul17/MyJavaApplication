package day14;






import java.util.*;
public class AccountManager extends Account {
	ArrayList<Account> accounts;
	Scanner scanner;
	
	AccountManager(){
		scanner = new Scanner(System.in);
		accounts = new ArrayList<Account>();
	}
	public void addAccount() {
		Account account  = new Account();
		account.GetAccountDetails();
		accounts.add(account);
	}
	public void addAccounts() {
		
	
		String choice = "No";
		do {
			addAccount();
			
			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
			
		} while (!choice.toLowerCase().equals("no"));
			}
	
public static 	boolean equals(Set<?>addAccount,Set<?>addAccounts) {
		if(addAccount==null||addAccounts==null) {
			System.out.println("this Account already exist");
			return false;
		}
		if(addAccount.size()!=addAccounts.size()) {
			System.out.println("this Account already exist");
			return false;
			
		}
		return addAccount.containsAll(addAccounts);}
	
	

	
	Account findcustomerrIndex(String number1)
	{
		for(Account customer : accounts) {
			if(customer != null)
			{
				if(customer.getNumber()==number1)
				{
					return customer;
				}
			}
		}
		return null;
	}
	
	public void printaccount() {
		for (Account customer : accounts) {
			System.out.println(customer);
			System.out.println("--------------------");
		}
	}
	void deposite(double deposit,double balance) {
		System.out.println("enter amount to be deposite");
		deposit =scanner.nextDouble();
		
		 balance = balance + deposit;
		 System.out.println("deposit status");
		System.out.println("Your Money has been successfully depsited");
		System.out.println("Deposited amount  is"+balance);
	}
	
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new customer");
			System.out.println("2. exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
			
				addAccounts();				
				break;
			
			case 2:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=2);
		
	}
	void ChooseAction() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1.transaction");
			System.out.println("2. show balance");
			System.out.println("3. printaccount");
			System.out.println("4. exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
				transac();
							
				break;
			case 2:

				printaccount();	
								
				break;
			
			case 3:
				printaccount();		
				break;
			
			case 4:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=4);
		
	}
	void transac() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
		
			System.out.println("3. exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
			
				Transact(userChoice, userChoice);				
				break;
			case 2:
				deposite(userChoice, userChoice);
								
				break;
			
			
			
			case 3:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=3);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AccountManager accountManager = new AccountManager();
		accountManager.addAccounts();
		
		accountManager.printMenu();
		accountManager.ChooseAction();
		
	}

}