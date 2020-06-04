package Day6Q;

public class Shop {
	void addCustomer() {
		SilverCustomer customer = new SilverCustomer();
		customer.getCustomerDataFromuser();
		customer.luckyDraw(101);
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Shop().addCustomer();
	}

}
