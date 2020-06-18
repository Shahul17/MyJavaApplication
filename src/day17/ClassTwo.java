package day17;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import day13.Customers;
import day14.Account;
import day13.Accounts;

public class ClassTwo extends ApplicationMain {
	  ArrayList<ApplicationMain> accDetails;
      Scanner scanner;
    
      ClassTwo(){
             scanner = new Scanner(System.in);
             accDetails = new ArrayList<ApplicationMain>();
      }
      public void addAccount() {
    		ApplicationMain account  = new ApplicationMain();
    		account.GetDetailsFromUser();
    		accDetails.add(account);
    	}
    	public void addAccounts() {
    		

    		String choice = "No";
    		do {
    			addAccount();
    			
    			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
    			choice = scanner.nextLine();
    			
    		} while (!choice.toLowerCase().equals("no"));
    	}
    	public void printaccount() {
    		for (ApplicationMain customer : accDetails) {
    			System.out.println(customer);
    			System.out.println("--------------------");
    		}
    	}
    	
    	/*int ageCalculation (String dob) {
    	    int age = 0;
    	           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	           LocalDate localDate = LocalDate.parse(dob, formatter);
    	      LocalDate now = LocalDate.now();
    	      Period diff = Period.between(localDate, now); 
    	      age = diff.getYears();
    	    return age;}*/
    	
    	ApplicationMain findcustomerIndex(int age)
    	{
    		for(ApplicationMain users : accDetails) {
    			if(users != null)
    			{
    				if(users.getAge()==age) {
    					return users;
    				}
    			}
    		}
    		return  null;
    	}
    	
    	void edit() {
    		int age1=0;
    		System.out.println("Please enter the age to be Edit");
    		age1 = scanner.nextInt();
    		ApplicationMain m1 = findcustomerIndex(age1);
    		System.out.println("The details for Edition");
    		if(m1==null)
    		{
    			System.out.println("No such details");
    		}
    		else
    		{
    			System.out.println(m1);
    			System.out.println("--------------------");
    			
    			System.out.println("Please enter the name for Edit");
    			String name = scanner.nextLine();
    			scanner.nextLine();
    			System.out.println("Please enter the hobbies for Add");
    			String hobbies = scanner.nextLine();
    			System.out.println("Please enter the eamil for Edit");
    			String email= scanner.nextLine();

    			//System.out.println("Please enter the customer age for updation");
    			//int age = scanner.nextInt();
    	    	m1.setName(name);
    			m1.setHobbies(hobbies);
    			m1.setEmail(email);
    			System.out.println("");
    			System.out.println("");
    			System.out.println("Edited success");
    			
    			//System.out.println("The updated  details");
    		//	System.out.println(m1);
    			System.out.println("--------------------");
    			
    		}
    	}
    	
    	public void deleteDetails() {
    		int age1=0;
    		System.out.println("Please enter the Age to be deleted");
    		age1 = scanner.nextInt();
    		ApplicationMain m1 = findcustomerIndex(age1);
    		if(m1 == null)
    		{
    			System.out.println("No such details");
    			System.out.println("No details deleted");
    		}
    		else	
    		{
    			System.out.println("The details to be deleted is ");
    			System.out.println(m1);
    		accDetails.remove(m1);
    			System.out.println(" Details deleted");
    			System.out.println("--------------------");
    		}
    			
    	}
    	
    	void ChooseActionForUser() {
    		int userChoice = 0;
    		do {
    			System.out.println("--------------------");
    			System.out.println("1.Edit your details");
    			System.out.println("2. View your details");
    			System.out.println("3. Back");
    			System.out.println("--------------------");
    			userChoice  = scanner.nextInt();
    			switch (userChoice ) {
    			case 1:
    				edit();
    							
    				break;
    			case 2:

    				printaccount();
    								
    				break;
    			
    			
    			
    			case 3:
    				System.out.println("exiting.....");
    				break;
    			default:
    				System.out.println("Invalid option.. Try again");
    				break;
    			}
    			
    		} while (userChoice!=3);
    		
    	}
    	
    	void loginforAdmin() {
    		 
    		scanner = new Scanner(System.in);
    		System.out.println("----------------------------");
    		System.out.println("Login page for Admin");
    		System.out.println("----------------------------");
    		System.out.println("Enter the username for login");
    		username = scanner.nextLine();
    		System.out.println("Enter the password for login");
    		password=scanner.nextLine();
    		if(username.equals("Admin")&&(password.equals("Admin"))) {
    			System.out.println("Admin login successfully");
    		
    			
    		}
    		else {
    			System.out.println("invalid username or password");
    			loginNew();
    		}
    }
    	
    	void ChooseActionForAdmin() {
    		int userChoice = 0;
    		do {
    			System.out.println("--------------------");
    			System.out.println("1.List all user data");
    			System.out.println("2.Edit user data");
    			System.out.println("3.Delete user data");
    			System.out.println("4.Add user");
    			System.out.println("4.back");
    			System.out.println("--------------------");
    			userChoice  = scanner.nextInt();
    			switch (userChoice ) {
    			case 1:
    				printaccount();			
    				break;
    			case 2:
    				edit();				
    				break;
    			case 3:
    				deleteDetails();			
    				break;
    			case 4:
    				addAccounts();
    				break;
    			case 5:
    				System.out.println("exiting.....");
    				break;
    			default:
    				System.out.println("Invalid option.. Try again");
    				break;
    			}
    			
    		} while (userChoice!=5);
    		
    	}
    	
    	void SortByName() {
    		TreeSet<ApplicationMain> sm = new TreeSet<ApplicationMain>(accDetails);
    		accDetails = new ArrayList<ApplicationMain>(sm);
    		System.out.println("Sorted by name");
    		System.out.println(accDetails);
    		System.out.println("----------------");
    	}
    	void SortByAge() {
    		TreeSet<ApplicationMain> sm = new TreeSet<ApplicationMain>(accDetails);
    		accDetails = new ArrayList<ApplicationMain>(sm);
    		System.out.println("Sorted by Age");
    		System.out.println(accDetails);
    		System.out.println("----------------");
    	}
    	void SortByUsername() {
    		TreeSet<ApplicationMain> sm = new TreeSet<ApplicationMain>(accDetails);
    		accDetails = new ArrayList<ApplicationMain>(sm);
    		System.out.println("Sorted by Username");
    		System.out.println(accDetails);
    		System.out.println("----------------");
    	}
    	
    		/*
    		System.out.println("sorted by balance");
    		System.out.println(accounts);
    		System.out.println("----------------");
    		System.out.println("sorted by Account-number");
    		System.out.println(accounts);
    		System.out.println("----------------");
    		System.out.println("sorted by phone-number");
    		System.out.println(accounts);
    		System.out.println("----------------");*/
    	
    	void ChooseActionForSort() {
    		int userChoice = 0;
    		do {
    			System.out.println("--------------------");
    			System.out.println("1.Sort By Name");
    			System.out.println("2. Sort By Age");
    			System.out.println("3. Sort by Username");
    			System.out.println("4. Exit");
    			System.out.println("--------------------");
    			userChoice  = scanner.nextInt();
    			switch (userChoice ) {
    			case 1:
    				
    				SortByName();			
    				break;
    			case 2:

    				SortByAge();
    								
    				break;
    			
    			case 3:
    				SortByUsername();
    				
					
    				break;
    			
    			case 4:
    				System.out.println("exiting.....");
    				break;
    			default:
    				System.out.println("Invalid option.. Try again");
    				break;
    			}
    			
    		} while (userChoice!=4);
    		
    	}
    	
    	
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassTwo am = new ClassTwo();
am.addAccounts();
//am.printaccount();
am.loginNew();
am.ChooseActionForUser();
am.loginforAdmin();
am.ChooseActionForAdmin();
am.ChooseActionForSort();
	}

}
