package day9Assignment;
import java.util.Scanner;
 class CheckstringCharacter {
	Scanner scanner;
	String str;
    char Firstcharacter, Secondcharacter;
    CheckstringCharacter(){
    Scanner sc = new Scanner(System.in);
    }
    
  void CheckstringCharacters(){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    str = sc.nextLine();
    System.out.println("Enter the Two characters for check: ");
    Firstcharacter = sc.next().charAt(0);
    Secondcharacter = sc.next().charAt(0);
    int FirstcharacterPos = str.indexOf(Firstcharacter);
    int SecondcharacterPos = str.indexOf(Secondcharacter);
    System.out.println(str);
    System.out.println(Firstcharacter);
    System.out.println(Secondcharacter);
    if(FirstcharacterPos > -1){
      if(SecondcharacterPos > -1){
         System.out.println("Characters is found here");
      if(SecondcharacterPos > FirstcharacterPos)
          System.out.println("First"+Firstcharacter + "then"+Secondcharacter);
      else
        System.out.println("First"+Secondcharacter + "then"+Firstcharacter);
       }
      else 
      {
        System.out.println("Only one character is found here");
         System.out.println("First" +Firstcharacter);
        }
    }
    else if(SecondcharacterPos > -1){
        System.out.println("Only one character is found here");
        System.out.println("First" +Secondcharacter);
    }
    else {
        System.out.println("Sorry the character is not found here in the string.");
    }
  }
    public static void main(final String args[]) {
    	CheckstringCharacter check = new CheckstringCharacter();
    	check.CheckstringCharacters();
        
    }
}