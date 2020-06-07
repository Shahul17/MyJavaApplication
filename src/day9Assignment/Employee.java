package day9Assignment;

class Employee {
    public int id, age;
    public String name, phnumber;

    public Employee(){}
    public Employee(int id, String name, String phnumber, int age){
        this.id = id;
        this.name = name;
        this.phnumber = phnumber;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("the id is"+id);
        System.out.println("the name is" + name);
        System.out.println("the phnumber is"+phnumber);
        System.out.println ("the age is"+ age);
    }
}
