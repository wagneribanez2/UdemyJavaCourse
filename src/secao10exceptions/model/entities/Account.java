/*
Fazer um programa para ler os dados de uma conta banc�ria e depois realizar um
saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta banc�ria conforme projeto abaixo:
 */
package secao10exceptions.model.entities;

import secao10exceptions.model.exception.DomainException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withDrawlimit;

	public Account(int number, String holder, double balance, double withDrawlimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawlimit = withDrawlimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithDrawlimit() {
		return withDrawlimit;
	}

	public void setWithDrawlimit(double withDrawlimit) {
		this.withDrawlimit = withDrawlimit;
	}

	public void deposit(double amount) throws DomainException {
		
		if(amount <= 0)
			throw new DomainException("Invalid value: " + amount);
		
		this.balance += amount;		
	}

	public void withdraw(double amount) {
		if(amount > getWithDrawlimit()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit ");
		}
		
		if(amount > getBalance()) {
			throw new DomainException("Withdraw error: Not enough balance ");
		}
		
		this.balance -= amount;
	}	
}
