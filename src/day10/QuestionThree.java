package day10;

public class QuestionThree {
	
	     String number,name;
	     int id;
	     QuestionThree (String name,String number, int id)
	    {
	    	 this.number=number;
	         this.name=name;
	         this.id=id;
	    }
	    @Override
	    public String toString() {
	       return "Number is: "+this.number+" & Name is: "+this.name+" & id is: "+this.id;
	    }
	}

