package day9Assignment;

import java.util.ArrayList; 
import java.util.Scanner;

public class EmployeeDetails {
	EmployeeDetails(){
	Scanner sc = new Scanner(System.in);
	}
	void EmployeeDetail(){
		Scanner sc = new Scanner(System.in);
    ArrayList<Employee> empList = new ArrayList<>();
    int choose = 0;
    while(choose != 2){
    System.out.println("1.Add Employee Details");
    System.out.println("2.Stop to Entry Employee Details");
    choose = sc.nextInt();
    switch (choose) {
     case 1:
       int id, age;
       String name, phnumber;
        System.out.println("Enter the Employee id");
        id = sc.nextInt();
        System.out.println("Enter the Employee name");
        name = sc.next();
        System.out.println("Enter the Employee phnumber");
        phnumber = sc.next();
        System.out.println("Enter the Employee age");
        age = sc.nextInt();
        empList.add(new Employee(id, name, phnumber, age));
        break;
        case 2:
        break;
        default:
        System.out.println("Enter Correct Input");
        }
    }
    System.out.println("Enter the Emp id to display: ");
   choose = sc.nextInt();
    for(Employee emp : empList){
        if(emp.id == choose){
        emp.displayDetails();
        break;
        }
    }
   
}
    public static void main(String[] args) {
    	EmployeeDetails Details = new EmployeeDetails();
    	Details.EmployeeDetail();
    }
}
