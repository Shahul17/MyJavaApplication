package Evaluation3;

public class RoughAccount {
    String name,number;
    double balance;
    public RoughAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public RoughAccount() {
        name = "";
        number="";
        balance = 0.0;
    }

    public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void addFunds(double addedAmount) {
        balance = balance + addedAmount;
    }

    public void withdraw(double withdrawnAmount) {
        balance = balance - withdrawnAmount;        
    }

    public void transfer(double amount, RoughAccount from, RoughAccount to) { //here is the transfer method, if i can improve this or alter it in order to make it easier to run using user input from the main file, let me know
        if(from.balance >= amount){
            from.balance = from.balance - amount;
            to.balance = to.balance + amount;
            System.out.println("Funds successfully transfered.");
        } else {
                System.out.println("Insufficient funds");
            }
        }
    }
