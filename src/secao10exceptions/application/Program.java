package secao10exceptions.application;

import java.util.Scanner;

import secao10exceptions.model.entities.Account;
import secao10exceptions.model.exception.DomainException;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		String holder;
		double balance;
		double withDrawlimit;
		double amountForWithdraw;
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Holder: ");
		holder = sc.nextLine();
		
		System.out.print("Balance: ");
		balance = sc.nextDouble();
		
		System.out.print("Withdraw Limit: ");
		withDrawlimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withDrawlimit);
		
		System.out.print("Enter amount for withdraw: ");
		amountForWithdraw = sc.nextDouble();
		
		acc.withdraw(amountForWithdraw);
	
		System.out.println("New balance: " + acc.getBalance());
		
		}catch(DomainException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		
		sc.close();
	}
}
