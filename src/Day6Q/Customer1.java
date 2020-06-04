package Day6Q;
import java.util.Scanner;
public class Customer1 {
private int id,age;
private String name,phone;
private Scanner scanner;
Customer1(){
 scanner = new Scanner(System.in);
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}



public void printCustomerData() {
	System.out.println("customer id"+id);
	System.out.println("customer name"+name);
	System.out.println("customer age"+age);
	System.out.println("customer phone"+phone);
}
public void getCustomerDataFromuser() {
	System.out.println("enter the id");
	id=scanner.nextInt();
	scanner.nextLine();
	System.out.println("enter the name");
	name=scanner.nextLine();
	System.out.println("enter the phone");
	phone=scanner.nextLine();
	System.out.println("enter the age");
	age=scanner.nextInt();
	
}
}