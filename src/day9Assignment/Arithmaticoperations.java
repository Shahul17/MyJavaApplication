package day9Assignment;
import java.util.Scanner;


public class Arithmaticoperations {
Scanner scanner;
Arithmaticoperations(){
	scanner= new Scanner(System.in);
	
}
int number1,number2,add,sub,mul;
float div;


void Getinput() {
	
	
		System.out.println("please enter the Number1");
		
		number1=scanner.nextInt();
		System.out.println("please enter the Number2");
		number2=scanner.nextInt();

	}
	void SwitchArithmatic() {
		while(true) {
		System.out.println("Choose the Arithmatic operation");
		System.out.println("Choose 1 for Addition");
		System.out.println("Choose 2 for Subtraction");
		System.out.println("Choose 3 for Multiplication");
		System.out.println("Choose 4 for Division");
		System.out.println("Choose 5 for Exit");
		int number=scanner.nextInt();
		switch(number)
		{
		case 1:
			add=number1+number2;
			System.out.println("The Result is:"+add);
			break;
		case 2:
			sub=number2-number2;
			System.out.println("The Result is:"+sub);
			break;
		case 3:
			mul=number1*number2;
			System.out.println("The Result is:"+mul);
			break;
		case 4:
			div=(float)number1/number2;
			System.out.println("The Result is:"+div);
			break;
		case 5:
			System.exit(0);
			
		}
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmaticoperations arithmatic = new Arithmaticoperations();
		arithmatic.Getinput();
		arithmatic.SwitchArithmatic();
	}

}
