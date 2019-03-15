
public class Account {
	
	public String name;
	public char id;
	public double balance;	
	
	public Account(String name, char id, double initialBalance) {
		this.name = name;
		this.id = id;
		this.balance = initialBalance;
	}
	public Account(String name, char id) {
		this.name = name;
		this.id = id;
	}
	public String getDescription() {
		return (id=='i')?"International account with owner " +name+ " has current balance $"+balance:"Domestic account with owner " +name+ " has current balance $"+balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double b) {
		this.balance = b;
	}
	public void deposit(double d) {
		this.balance += (id=='i') ? 0.9*d : d;
	}
	public void withdraw(double d) {
		this.balance -= (id=='i') ? 1.1*d : d;
	}
	public void transferTo(Account acc, double t) {
		acc.deposit(t);	withdraw(t);
	}

}
