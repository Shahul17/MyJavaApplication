package day14sample;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
public class Transaction {
       ArrayList<Account> accDetails;
       Scanner scanner;
       double amt;
       Transaction(){
              scanner = new Scanner(System.in);
              accDetails = new ArrayList<Account>();
       }
void userOperation()
{
       int userChoice = 0;
       String transOpt=null, addChoice=null;
       do {
              System.out.println("Please select a number \n" + "1) Transact\n" +"2) Print Account Details\n" +"3) Show balance");
              userChoice = scanner.nextInt();
              scanner.nextLine();
              if(userChoice==1) {
             System.out.println("Please enter the type of transaction\r\n" +"1) Withdraw\r\n" + "2) Deposit");
             transOpt =scanner.next();
             scanner.nextLine();
              }
              System.out.println("Please enter the account number");
              int accNo=scanner.nextInt();
              scanner.nextLine();
              Account obj = findAccount(accNo);
              if(obj!= null) {
              switch(userChoice) {
               case 1: System.out.println("Please enter the amount");
              amt=scanner.nextDouble();
              scanner.nextLine();
             if(obj.getAccType().equalsIgnoreCase("savings"))
             {
            new SavingsAccount().transact(obj, transOpt, amt);
                }
             else if(obj.getAccType().equalsIgnoreCase("current"))
               {
             new CurrentAccount().transact(obj, transOpt, amt);
               }
              break;
                case 2: 
             System.out.println(obj.getAccType()+"\r\nAccount Number : "+accNo+"\r\nName : "+obj.getName()+  "\r\nAge : " +obj.getAge()+ "\r\nPhone : "+obj.getPhone()+ "\r\nBalance : "+obj.getBalance());
              break;
             case 3 :
              System.out.println("The available balance is "+obj.checkBalance());      
            break;
             }
                     System.out.println("Do u want to do another operation??...yes/no");
                     addChoice = scanner.nextLine();
              }
       }while( addChoice.equalsIgnoreCase("yes"));
}
int ageCalculation (String dob) {
       int age = 0;
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
              LocalDate localDate = LocalDate.parse(dob, formatter);
         LocalDate now = LocalDate.now();
         Period diff = Period.between(localDate, now); 
         age = diff.getYears();
       return age;
}      
      void populateAccounts(int accountNumber, String accType, String name, String dob, String phone, double balance, int age)
       {
              Account obj = new SavingsAccount();
              obj.setAccountNumber(accountNumber);
              obj.setAccType(accType);
              obj.setBalance(balance);
              obj.setName(name);
              obj.setDob(dob);
              obj.setAge(age);
              obj.setPhone(phone);
              accDetails.add(obj);
       }
       Account findAccount(int accNo) {
              for(Account obj:accDetails){
                     if(obj.getAccountNumber() == accNo)
                           return obj;
              }
              System.out.println("Account does not exist");
              return null;
       }
       public static void main(String[] a) {
              Account sObj = new SavingsAccount();
              sObj.takeAccountDetails();
       }

}

 

