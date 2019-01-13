package exercicioSecao4;

public class BankAccount {
	private final int ACCOUNT_NUMBER;
	private String name;
	private double balance;

	public BankAccount(int ACCOUNT_NUMBER, String name, double initialDeposit) {
		this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
		this.name = name;
		deposit(initialDeposit);
	}

	public BankAccount(int ACCOUNT_NUMBER, String name) {
		this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0)
			this.balance += amount;		
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return String.format("Account: %d, Holder: %s, Balance: $ %.2f%n" , 
				this.ACCOUNT_NUMBER, this.getName(), this.getBalance());
	}

}
