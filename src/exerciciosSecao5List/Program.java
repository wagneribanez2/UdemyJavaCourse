package exerciciosSecao5List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int idEmployee;
		String name;
		double salary;
		int numEmployees;
		int idPercentageIncrease; // id do funcionario que terá aumento
		double percentageIncrease; // porcentagem do aumento

		System.out.printf("How many employees will be registered? ");
		numEmployees = sc.nextInt();

		for (int count = 0; count < numEmployees; count++) {
			System.out.printf("%nEmplyoee #%d%n", count + 1);

			System.out.print("Id: ");
			idEmployee = sc.nextInt();

			System.out.print("Name: ");
			name = sc.next();

			System.out.print("Salary: ");
			salary = sc.nextDouble();

			employees.add(new Employee(idEmployee, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase :");
		idPercentageIncrease = sc.nextInt();

		Employee emp = employees.stream().filter(x -> x.getId() == idPercentageIncrease).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("\nEnter the percentage: ");
			percentageIncrease = sc.nextDouble();
			emp.increaseSalary(percentageIncrease);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : employees) {
			System.out.println(obj);
		}

		sc.close();

	}

}
