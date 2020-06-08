package day10;

public class BankAccount {
	
	   public int id,id1;
	    public String name,number,type;
	    public float balance;

	    public BankAccount(){
	    	id=101;
	    	number = "5133";
	    	name="raju";
	    	type="savings";
	    	balance = (float)12.5;
	    
	    	
	    }
	    public BankAccount(int id,String number, String name, String type, float balance){
	       this.id =id;
	    	this.name = name;
	        this.number = number;
	        this.type = type;
	        this.balance = balance;
	       
	    }
	    @Override
	    public boolean equals(Object obj) {
			if(this.toString().equals(obj.toString()))
				return true;
			else
				return false;
		}

	  @Override
	  public String toString() {
			String data = "id is :"+id+
					"\nNumber is : "+number+
					"\nName is : "+name+
					"\nType is : "+type+
					"\nbalance is "+balance;
			return data;
		}
	  
	  
	
public static void main(String args[]) {
	BankAccount details1 = new BankAccount(1,"5133","kajol","savings",(float)2.5);
	BankAccount details2 = new BankAccount(2,"5134","royel","current",(float)3.5);
	System.out.println(details1);
	System.out.println(details2);
	if(details1.equals(details2))
		System.out.println("Both have same details");
	else
		System.out.println("Both have different data");
	
}
}
