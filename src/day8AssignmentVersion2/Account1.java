package day8AssignmentVersion2;
import java.util.Scanner;

public class Account1 {

String name,number;
float balance;
Scanner scanner;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
Account1(){
	scanner = new Scanner(System.in);
}
Account1(String name,String number,float balance){
	scanner = new Scanner(System.in);
	this.name = name;
	this.number = number;
	this.balance = balance;
}
void GetAccountDetails() {
	System.out.println("please enter the Accounter name");
	name = scanner.nextLine();
	System.out.println("please enter the Account number");
	number = scanner.nextLine();
	System.out.println("please enter the balance");
	balance=scanner.nextFloat();

}
void PrintAccountDetils() {
	System.out.println("Account name is :"+name);
	System.out.println("Account number is :"+number);
	System.out.println("Account balance is :"+balance);
}
}
