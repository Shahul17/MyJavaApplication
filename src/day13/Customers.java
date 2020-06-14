package day13;


import java.util.*;

public class Customers {
	int id,age;
	String name,phone;
	
	Scanner scanner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	Customers(){
		scanner = new Scanner(System.in);
	}
	Customers(String name,String phone,int age){
		scanner = new Scanner(System.in);
		this.name = name;
		this.phone = phone;
		this.age=age;
	}
	Customers(int id,String name,String phone,int age){
		scanner = new Scanner(System.in);
		this.id=id;
		this.name = name;
		this.phone = phone;
		this.age=age;
	}	
	void GetCustomerDetails() {
		System.out.println("please enter the customer ID");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("please enter the customer NAME");
		name = scanner.nextLine();
		
		System.out.println("please enter the customer PHONE");
		
		phone=scanner.nextLine();
		
		System.out.println("please enter the customer AGE");
		age = scanner.nextInt();
	}
	

	@Override
	public String toString()
	{
		return "Cutomer id:"+id+"\n Customer name:"+name+"\n Customer phone:"+phone.replaceAll("\\d(?=\\d{2})", "X")+"\n Customer age: "+age;
	}
	@Override
	public boolean equals(Object obj) {
		Customers m2=(Customers)obj;
		Customers m1=this;
				if(m1.getName().equals(m2.getName()) && m1.getPhone()==m2.getPhone())
					return true;
				else
					return false;
		
	}
}

