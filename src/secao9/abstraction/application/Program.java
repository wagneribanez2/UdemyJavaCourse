package secao9.abstraction.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import secao9.abstraction.entities.TaxPayer;
import secao9.abstraction.entities.Individual;
import secao9.abstraction.entities.Company;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numTaxPayers;
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		double totalTaxes = 0;

		System.out.print("Enter the number of tax payers: ");
		numTaxPayers = sc.nextInt();

		for (int i = 1; i <= numTaxPayers; i++) {
			char type = ' ';

			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			type = sc.next().charAt(0);

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditure));
			} else if (type == 'c') {
				System.out.print("Number of employess: ");
				int numEmployee = sc.nextInt();

				list.add(new Company(name, anualIncome, numEmployee));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer p : list) {
			System.out.println(p);
			totalTaxes += p.impostoPago();
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f", totalTaxes);

		sc.close();

	}
}
