/*
Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()
 */
package exerciciosSecao8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exerciciosSecao8Enum.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String clientName;
		String email;
		Date birthDate;
		Client client;
		OrderStatus status;
		int itemQuantity;
		Order order;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		clientName = sc.nextLine();
		
		System.out.print("Email: ");
		email = sc.nextLine();
		
		System.out.print("Birth date (dd/mm/yyyy): ");
		birthDate = sdf.parse(sc.next());
		client = new Client(clientName, email, birthDate );
		
		System.out.print("Status: ");
		status = OrderStatus.valueOf(sc.next());
		
		order = new Order(client, new Date(), status );
		
		System.out.print("How many items to this order?");
		itemQuantity = sc.nextInt();
		
		for(int i = 1; i <= itemQuantity; i++) {
			String productName;
			double productPrice;
			int quantity;
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name ");
			productName = sc.next();
			
			System.out.print("Price: ");
			productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			quantity = sc.nextInt();
			
			order.addItem(
					new OrderItem(quantity, productPrice, 
							new Product(productName, productPrice)));
		}
		
		System.out.println("\nOrder Summary: ");
		System.out.println(order);
		
		sc.close();
	}
}
