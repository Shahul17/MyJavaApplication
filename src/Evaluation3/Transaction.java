package Evaluation3;

import java.util.Scanner;

public class Transaction {
private int transaction_number;
double balance;
String fromAccount;
String toAccount;
double amount;
String type;
String status;
Scanner scanner;

Transaction(){
scanner=new Scanner(System.in);
}
int withdraw() {
System.out.println("Your Balance=" + balance);
System.out.print("Enter amount to withdraw:");
amount = scanner.nextInt();
if (balance < amount) {
System.out.println("Not sufficient balance.");
return 1;
}
if (amount < 0) {
System.out.println("Invalid Amount");
return 1;
}
balance = balance - amount;
System.out.println("withdraw status");
System.out.println("Your Money has been successfully withdrawn");
return 0;
}

int deposit() {
	System.out.println("TRANSACTION PAGE");
	System.out.println("Enter Tansaction Number: ");
	int num = scanner.nextInt();

	System.out.println("Enter Account Type: ");
	String type = scanner.next();
	System.out.println("Enter Initial Balance: ");
	int bal = scanner.nextInt();
System.out.print("Enter amount to transfer:");
amount = scanner.nextFloat();
scanner.nextLine();
System.out.println("Enter the  Fromaccountnumber to transfer :");
fromAccount=scanner.toString();
fromAccount=scanner.nextLine();
System.out.println("Enter the Toaccountnumber to tranfer :");
toAccount=scanner.toString();
toAccount=scanner.nextLine();
if (amount < 0) {
System.out.println("Invalid Amount");
return 1;
}
balance = balance + amount;
System.out.println("deposit status");
System.out.println("Your Money has been successfully depsited");
return 0;
}

void displayDetails() {

System.out.println("Transaction Number:" + transaction_number);
System.out.println("Account Type:" + type);
System.out.println("Balance:" + balance);
}
@Override
public String toString() {
return "TransactionNumber "+transaction_number+"\n Amount "+amount+"\nType "+type+
"\nStatus "+status;
}

void transactionMethod() {


int menu;
System.out.println("Menu For the user");
System.out.println("----------------------");
System.out.println("1.transfer/transaction");
System.out.println("2.Cash_Withdraw");
System.out.println("3.Status");
System.out.println("4.Exit");
boolean quit = false;
do {
System.out.print("Enter your choice: ");

menu = scanner.nextInt();
switch (menu) {
case 1:
deposit();
break;

case 2:
withdraw();
break;

case 3:
displayDetails();
break;

case 4:
quit = true;
System.out.println("exited");
break;
}
} while (!quit);


}
public static void main(String[] args) {
Transaction transaction=new Transaction();
transaction.transactionMethod();

}
}