package accountSuper;

public class Accounts {
	
	// fields
	private String accnum;
	private int password;
	private String name;
	private int balance;
	
	
	// constructor
	public Accounts(String accnum, int password, String name) {
		this.accnum = accnum;
		this.password = password;
		this.name = name;
	}
	
	// getters and setters
	public String getAccnum() {
		return accnum;
	}
	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// money deposit
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	// money withdraw
	public void withdraw(int amount) {
		this.balance -= amount;
	}
}
