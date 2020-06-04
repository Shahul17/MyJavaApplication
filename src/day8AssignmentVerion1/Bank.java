package day8AssignmentVerion1;



public class Bank {
	Account[] accounts;
	Bank(){
		accounts=new Account[5];
	}
	void addcustomer() {
		
		
		for(int i=0;i<accounts.length;i++) {
accounts[i]= new Account();
accounts[i].GetAccountDetails();
		}

	}
	void listallDetails() {
		for(int i=0;i<accounts.length;i++) {
			accounts[i].PrintAccountDetils();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.addcustomer();
		bank.listallDetails() ;

	}

}
