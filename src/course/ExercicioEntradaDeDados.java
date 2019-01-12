package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner in = new Scanner(System.in);
		
		String fullName;
		int numBedrooms;
		double productPrice;
		String lastName;
		int age;
		double height;
		
		System.out.println("Enter your full name: ");
		fullName = in.nextLine();
		System.out.println("How many bedrooms are there in your house: "); 
		numBedrooms = in.nextInt();
		System.out.println("Enter product price:  ");
		productPrice = in.nextDouble();
		System.out.println("Enter your last name, age and height (same line): ");
		lastName = in.next();
		age = in.nextInt();
		height = in.nextDouble();
		
		System.out.println(fullName);
		System.out.println(numBedrooms );
		System.out.printf("%.2f", productPrice );
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f", height);
		
	}

}
