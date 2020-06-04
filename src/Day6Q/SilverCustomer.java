package Day6Q;
import java.util.Random;
public class SilverCustomer extends Customer1 {
	public void luckyDraw()
	{
		int num =new Random().nextInt();
		if(num==getId())
			System.out.println("you are lucky");
		else
			System.out.println("better luck next time");
		
	}
public void luckyDraw(int num) {
	if(num==getId())
		System.out.println("you are lucky");
	else
		System.out.println("better luck next time");
}
}
