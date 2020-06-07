package day8;
import java.util.Scanner;
public class CD {
String id;
float price;
boolean isavailable;
Movie movie;
Scanner scanner;

CD(){
	scanner = new Scanner(System.in);
	isavailable = true;
	movie = null;}
	CD(float price){
		scanner = new Scanner(System.in);
		this.price=price;
		isavailable = true;
		movie = null;
}
CD(float price,Movie movie){
	scanner = new Scanner(System.in);
	this.price=price;
	isavailable=true;
	this.movie=movie;
	
}
CD(String id,float price ,Movie movie){
	scanner = new Scanner(System.in);
	this.id=id;
	this.price=price;
	isavailable=true;
	this.movie=movie;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public boolean isIsavailable() {
	return isavailable;
}
public void setIsavailable(boolean isavailable) {
	this.isavailable = isavailable;
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}
void getdetailsfromuser() {
	System.out.println("please enter the cd id");
	id=scanner.nextLine();
	System.out.println("please enter the cd price");
	price=scanner.nextFloat();
	
}
void getcddetails() {
	System.out.println("please enter the cd id");
	id=scanner.nextLine();
	System.out.println("please enter the cd price");
	price=scanner.nextFloat();
	
	
}
}
