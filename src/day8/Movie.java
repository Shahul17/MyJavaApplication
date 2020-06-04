package day8;
import java.util.Scanner;
public class Movie {
int id;
String name;
float duration;
Scanner scanner;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getDuration() {
	return duration;
}
public void setDuration(float duration) {
	this.duration = duration;
}
Movie(){
	scanner = new Scanner(System.in);
}
Movie(String name,float duration){
	scanner = new Scanner(System.in);
	this.name = name;
	this.duration = duration;
}
Movie(int id ,String name,float duration){
	scanner = new Scanner(System.in);
	this.id = id;
	this.name = name;
	this.duration = duration;
}
void GetMovieDetails() {
	System.out.println("pplease enter the movie id");
	id = scanner.nextInt();
	scanner.nextLine();
	System.out.println("pplease enter the movie name");
	name = scanner.nextLine();
	System.out.println("please enter the movie duration");
	duration=scanner.nextFloat();
}
void PrintMovieDetils() {
	System.out.println("movie id"+id);
	System.out.println("movie name"+name);
	System.out.println("movie duration"+duration);
	
	
}
}
