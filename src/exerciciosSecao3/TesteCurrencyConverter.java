package exerciciosSecao3;

import java.util.Scanner;

public class TesteCurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dollarPrice;
		int quantity;

		System.out.printf("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		quantity = sc.nextInt();
		System.out.printf("Amount to be paid in reais = %.2f", 
				CurrencyConverter.amount(dollarPrice, quantity));
		
		sc.close();

	}

}
