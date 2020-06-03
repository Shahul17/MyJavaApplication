import java.util.Scanner;
public class Account {
	long Account_number;
	String name;
	float balance;
	Scanner sc;
	
	Account(){
		Account_number = 202020;
		name = "kiran";
		/*balance =25000*/
		sc = new Scanner(System.in);
	}
	void printAccountData() {
		System.out.println("Account_number : "+Account_number);
		System.out.println("Account_Name : "+name);
		/*System.out.println("Account_balance : "+balance);*/
		System.out.println("------------------------------");
		
	}
	void takeBalanceInput() {
		System.out.println("Please Enter the Account Balance");
		balance = sc.nextFloat();
	}
	boolean BalanceCheck() {
		System.out.println("WITHDRAW STATUS");
		System.out.println("------------------------------");
		boolean result = false;
		if(balance>=25000)
		{
			System.out.println("You are ALLOWED To Withdraw Money");
			result = true;
		}
		else
			System.out.println("You are NOT ALLOWED to withraw Money");
		System.out.println("------------------------------");
		return result;
	}
	void Newbalance() {
		System.out.println("Your New balance is :"+balance);
		System.out.println("-----Thank You------");
	}
	boolean BalanceCheck1() {
		
		boolean result = false;
		if(balance>=25000)
		{
			System.out.println("You Have suffience Balance or Enough Balance");
			result = true;
		}
		else
			System.out.println("You Doesn't Have Sufficient balance or Enough Balance");
		System.out.println("------------------------------");

		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.printAccountData();
		a1.takeBalanceInput();
		if( a1.BalanceCheck() == true);
		
		if( a1.BalanceCheck1() == true);
		a1.Newbalance();

	}

}
