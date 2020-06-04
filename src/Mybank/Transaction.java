package Mybank;

public class Transaction {
	 
		void transaction() {
			System.out.println("Add with no parameters");
		}
		void transaction(double withdraw,double balance) {
			System.out.println("withdraw status");
			if(withdraw<balance)
		
			System.out.println("Please collect your money");
			else
				System.out.println("you does not have sufficient balance");
			System.out.println("                                   ");
			System.out.println("                                   ");
			
		}
		void transaction1(double deposit,double balance) {
			 balance = balance + deposit;
			 System.out.println("deposit status");
			System.out.println("Your Money has been successfully depsited");
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Transaction().PrintAll();
		new Transaction().transaction(5000,3000);
		new Transaction().transaction1(5000,6000);
		
	}
	/*private void add(double withdraw, double balance) {
		// TODO Auto-generated method
	}*/

}
