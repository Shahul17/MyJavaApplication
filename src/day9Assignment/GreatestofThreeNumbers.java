package day9Assignment;
import java.util.Scanner;

public class GreatestofThreeNumbers {
Scanner scanner;
int number1,number2,number3;
void GetinputFromUser() {
	scanner = new Scanner(System.in);
	System.out.println("Enter the number 1");
	number1=scanner.nextInt();
	System.out.println("Enter the number 2");
	number2=scanner.nextInt();
	System.out.println("Enter the number 3");
	number3=scanner.nextInt();
}
void CheckGreatestnumber() {
	if(number1>number2&&number1>number3) {
		System.out.println("Greatest number is :"+number1);
	}
	else if(number2>number1&&number2>number3){
		System.out.println("Greatest Number is :"+number2);
	}
	else if(number3>number1&&number3>number2){
		System.out.println("Greatest number is :"+number3);
	}
	else {
		System.out.println("No one greatest number is Not here");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestofThreeNumbers greatest = new GreatestofThreeNumbers();
		greatest.GetinputFromUser();
		greatest.CheckGreatestnumber();

	}

}
