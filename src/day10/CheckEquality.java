package day10;

public class CheckEquality {
	String name;
	String number;
	String type;
	 Float balance;
	 CheckEquality (){
			number = "513315104039";
			name = "Raja";
			type = "saving";
			balance = (float) 2500.0;
	 }
	 CheckEquality(String number,String name,String type,float balance){
			this.number = number;
			this.name = name;
			this.type = type;
			this.balance =balance;
	 }
	 
	@Override
	 public String toString() {
			String data = "Number is : "+number+
					"\nName is : "+name+
					"\nType is : "+type+
					"\nbalance is "+balance;
			return data;
		}
	@Override
	public boolean equals(Object obj) {
	CheckEquality other = ( CheckEquality)obj;//Type cast
		if(this.number == other.number)
			return true;
		else
			return false;
	}
		
	/*public boolean equals(Object obj) {
		if(this.toString().equals(obj.toString()))
			return true;
		else
			return false;
	}*///Incase if u want all the details should be equal use it:
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckEquality check1 = new CheckEquality("513315104039","Rahul","current",(float) 2500.25);
		CheckEquality check2 = new CheckEquality("513315104039","shahul","savings",(float) 2500.25);
		System.out.println(check1);
		System.out.println(check2);
		if(check1.equals(check2))
			System.out.println("Both have same details");
		else
			System.out.println("Both have different data");
	}

}
