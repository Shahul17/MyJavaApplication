package day10;


import  java.util.Scanner;
public class Accounts2 {
 String name,number,type;
 Float balance;
 Accounts2(){
		number = "513315104039";
		name = "Raja";
		type = "saving";
		balance = (float) 2500.0;
	}
 Accounts2(String number,String name,String type,float balance){
		this.number = number;
		this.name = name;
		this.type = type;
		this.balance =balance;
 }

@Override
public String toString() {
	String data = "Number is : "+number+
			"\nName is : "+name+
			"\nType is : "+type+
			"\nbalance is "+balance;
	return data;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts2 account2 = new Accounts2();
		System.out.println(account2);
	}

	
}
