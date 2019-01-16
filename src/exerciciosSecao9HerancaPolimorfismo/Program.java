package exerciciosSecao9HerancaPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int numberOfProducts;
		List<Product> list = new ArrayList<Product>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		numberOfProducts = sc.nextInt();

		for (int i = 1; i <= numberOfProducts; i++) {
			char type;			
			String name;
			double price;
			double customsFee;
			Date manufactureDate;
			
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Price: ");
			price = sc.nextDouble();
			
			switch(type) {
			case 'i':				
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				break;
			case 'c':				
				list.add(new Product(name, price));
				break;
			case 'u':				
				price = sc.nextDouble();				
				System.out.print("Manufacture date (dd/mm/yyyy): ");
				manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
				break;
			}
			
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p: list) {
			System.out.println(p.priceTag());
		}
		

		sc.close();
	}
}
