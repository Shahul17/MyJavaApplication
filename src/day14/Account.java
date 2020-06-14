package day14;




import java.util.Scanner;



public  class Account {
int age;
String name,number,phone,acctype;
float balance;
double withdraw,deposit;
Scanner scanner;


public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
public double getWithdraw() {
	return withdraw;
}
public void setWithdraw(double withdraw) {
	this.withdraw = withdraw;
}
public double getDeposit() {
	return deposit;
}
public void setDeposit(double deposit) {
	this.deposit = deposit;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
Account(){
	scanner = new Scanner(System.in);
}
Account(String acctype,String name,String number,float balance,String phone,int age){
	scanner = new Scanner(System.in);
	this.acctype=acctype;
	this.number = number;
	this.name = name;
	this.phone=phone;
	this.age=age;
	this.balance = balance;
}
void GetAccountDetails() {
	System.out.println("please enter the Account type");
	number = scanner.nextLine();
	
	System.out.println("please enter the Account number");

	number = scanner.nextLine();
	
	System.out.println("please enter the Account name");
	number = scanner.nextLine();
	System.out.println("please enter the Accounter phone");
	phone = scanner.nextLine();
	System.out.println("please enter the Accounter Age");
	age = scanner.nextInt();
	System.out.println("please enter the balance");
	balance=scanner.nextFloat();

}
void PrintAccountDetils() {
	System.out.println("Account type is :"+acctype);
	System.out.println("Account number is :"+number);
	System.out.println("Account name is :"+name);
	System.out.println("Account phone number is :"+phone);
	System.out.println("Accounter Age is :"+age);
	System.out.println("Account balance is :"+balance);
}
@Override
public String toString()
{
	return "Account type is :"+acctype+"Account number is :"+number+"\n Account name is :"+name+"\nAccount phone number is :"+phone+"\n Accounter Age is : "+age+"\nAccount balance is :"+balance;
}

@Override
public boolean equals(Object obj) {
	Account m2=(Account)obj;
			Account m1=this;
			if(m1.getName().equals(m2.getName()) && m1.getNumber()==m2.getNumber())
				return true;
			else
				return false;
	
}
void Transact(double withdraw,float balance) {
	System.out.println("withdraw status");
	System.out.println("enter the amount to withdraw");
	withdraw=scanner.nextDouble();
	if(withdraw<balance)
	System.out.println("Please collect your money");
	else
		System.out.println("you does not have sufficient balance");
	
	System.out.println("                                   ");
	
	
}
}


