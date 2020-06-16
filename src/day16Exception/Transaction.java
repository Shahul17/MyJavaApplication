package day16Exception;



import java.util.Scanner;
import day16Exception.Transaction;

public class Transaction {
	 Scanner scanner;
	 Transaction(){
	 scanner = new Scanner(System.in);}
		static void transaction() {
			
			System.out.println("Add with no parameters");
		}
		void transaction(double withdraw,double balance)  {
			
				System.out.println("withdraw status");
			System.out.println("enter the amount to be withdraw");
			withdraw=scanner.nextDouble();
			if(withdraw<balance)
		
			System.out.println("Please collect your money");
			
		else {
			System.out.println("balance is not enough");
		}}
			
		
		static void transaction1(double deposit,double balance) {
			 balance = balance + deposit;
			 System.out.println("deposit status");
			System.out.println("Your Money has been successfully depsited");
		}
		
		
			

		void checkBalanceEligibility() throws BalanceException {
			int age = 12;
			int balance=5;
				//try {
				 if(balance<18)
					throw new BalanceException();
				System.out.println("You can proceed...");
				/*} catch (MyAgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
		
		}

	
	
	
	
	void PrintAll() {
		SavingsAccount savings = new SavingsAccount();
		savings.getAccountDataFromUser();
		savings.checkAccount();
		/*savings.Transaction2();*/
		
		/*savings.Transaction1();*/
		
		/*CurrentAccount current = new CurrentAccount();
		current.getAccountDataFromUser();
		current.AccountType();
		current.Transaction2();*/
		
	}
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	/*private void add(double withdraw, double balance) {
		// TODO Auto-generated method
	}*/
		Transaction ee = new Transaction();
		/*ee.addDataToMap();
		ee.printMap();
		ee.fileRead();*/
		try {
			ee.checkBalanceEligibility();
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}}}
