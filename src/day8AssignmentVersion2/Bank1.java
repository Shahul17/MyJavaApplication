package day8AssignmentVersion2;

import java.util.Scanner;

public class Bank1 {
	Account1[] accounts1;
	public void createAccount(int n) {
	    accounts1=new Account1[n];
	}
	
	Bank1(){}
	Bank1(int n){
			accounts1=new Account1[n];
		}
	
	
	
	
	
	void addAccount() {
		for (int i = 0; i < accounts1.length; i++) {
			accounts1[i]=new Account1();
			accounts1[i].GetAccountDetails();	
		}
	}
	void listAllAccounts() {
		for(int i=0;i<accounts1.length;i++) {
		accounts1[i].PrintAccountDetils();	
		}
}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Enter the no of acccount: ");
        int n = sc.nextInt();
        Bank1 bank=new Bank1(n);
        bank.createAccount(n);
        bank.addAccount();
        bank.listAllAccounts();
}
}