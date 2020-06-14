package day14sample;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class Account {

      int accountNumber,age;
       String name,phone,Dob,accountType;
       double balance;
       Scanner scanner;
       Transaction cityub;
       ArrayList<Integer> accountList;
       Account(){
              scanner = new Scanner(System.in);
              accountList = new ArrayList<Integer>();
              cityub = new Transaction();
       }
       public void setAccountNumber(int accountNumber) {
           this.accountNumber = accountNumber;
       }
       public void setName(String name) {
           this.name = name;
       }
 public void setPhone(String phone) {
this.phone = phone;
}
 public void setDob(String Dob) {
 this.Dob = Dob;
}
 public void setAge(int age) {
this.age = age;
}
 public void setAccType(String accountType) {
       this.accountType = accountType;
       }
       public void setBalance(double balance) {
              this.balance = balance;
       }
       public String getName() {
      return name;
       }
       public String getPhone() {
           return phone;
       }
       public String getDob() {
              return Dob;
       }
       public double getBalance() {
              return balance;
       }
       public int getAccountNumber() {
    return accountNumber;
 }
       public int getAge() {
              return age;
       }
       double checkBalance() {
       return balance;     
       }     
       abstract boolean transact(Account another,String type,double amount);   
       public String getAccType() {
              return accountType;
    }
       void takeAccountDetails(){
String userChoice = "no";
   do {
       System.out.println("Enter the Account Type");
              accountType = scanner.nextLine();
              System.out.println("Enter the Account number");
              accountNumber = scanner.nextInt();
              scanner.nextLine();
              if(accountList.contains(accountNumber)) {
                    System.out.println("Account already exists!!");
              }
              else {
                     accountList.add(accountNumber);
              System.out.println("Enter the Accounter name");
              name = scanner.nextLine();
              System.out.println("Enter Date of Birth DD/MM/YYYY");
              Dob= scanner.nextLine();
              System.out.println(" Enter Accounter number");
              phone = scanner.nextLine();
              System.out.println("Enter the Initial Amount to deposit");
              balance =scanner.nextFloat();
              scanner.nextLine();
              age = cityub.ageCalculation(Dob);
              cityub.populateAccounts(accountNumber, accountType, name, Dob, phone, balance, age);
              System.out.println("Created");
              }
              System.out.println("Do u want to Continue yes/no??");
              userChoice = scanner.nextLine();
              }while( userChoice.equalsIgnoreCase("yes"));
                   cityub.userOperation();

       }

 

      

      

 

      

}

