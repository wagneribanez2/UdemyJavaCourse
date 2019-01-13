package exercicioSecao4;

import java.util.Scanner;

public class TesteBankAccount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int accountNumber;
		String name;
		char initialDeposit;
		double depositValue;
		double withDrawValue;
		BankAccount ba;
		
		
		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();		
		
		System.out.print("Enter account holder: ");
		name = sc.next();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		initialDeposit = sc.next().charAt(0);
		
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			depositValue = sc.nextDouble();
			ba = new BankAccount(accountNumber, name, depositValue);						
		}else {
			ba = new BankAccount(accountNumber, name);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(ba);
		
		System.out.print("Enter a deposit depositValue: ");
		depositValue = sc.nextDouble();
		ba.deposit(depositValue);
		
		System.out.println("Updated account data: ");
		System.out.println(ba);
		
		System.out.print("Enter a withdraw value: ");
		withDrawValue = sc.nextDouble();
		ba.withdraw(withDrawValue);
		
		System.out.println("Updated account data: ");
		System.out.println(ba);
		
		sc.close();
	}
}
