package exerciciosSecao3;

import java.util.Scanner;

public class TesteRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width;
		double height;
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();		
		
		
		System.out.println("AREA = " + rec.area() +
				"\nPERIMETER = " + rec.perimeter() + 
				"\nDIAGONAL = " + rec.diagonal()
				);

	}

}
