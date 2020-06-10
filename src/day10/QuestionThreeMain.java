package day10;

import java.util.ArrayList;
public class QuestionThreeMain
{
	@Override
	 public boolean equals(Object tmp) {
			if(tmp.toString().equals(tmp.toString()))
				return true;
			else
				return false;
		}
     public static void main(String [] args)
     {
    	
          ArrayList<QuestionThree> al= new ArrayList<QuestionThree>();
          al.add(new QuestionThree("123","raja",  2));
          al.add(new QuestionThree("124","haja",  3));
       
         for (QuestionThree tmp: al){
              System.out.println(tmp);
              if(tmp.equals(tmp))
      			System.out.println("");
      		else
      			System.out.println("");
          }
     }
}