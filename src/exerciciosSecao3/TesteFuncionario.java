package exerciciosSecao3;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();

		System.out.print("Name: ");
		func.name = sc.nextLine();

		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		func.tax = sc.nextDouble();

		System.out.println("\nEmployee: " + func);

		System.out.print("\nWhich percentage to increase salary? ");
		func.increaseSalary(sc.nextDouble());

		System.out.println("\nUpdated data: " + func);
		sc.close();
	}

}
