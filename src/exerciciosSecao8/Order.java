package exerciciosSecao8;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exerciciosSecao8Enum.OrderStatus;

public class Order {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private Client client;
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> list = new ArrayList<>();

	public Order(Client client, Date moment, OrderStatus status) {
		this.client = client;
		this.moment = moment;
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		list.add(item);
	}
	
	public void removeItem(OrderItem item) {
		list.remove(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double total=0;
		
		sb.append("Order moment: "); 
		sb.append(sdf.format(moment)).append("\n");
		sb.append("Order status: ");
		sb.append(status).append("\n");
		sb.append("Client: ");
		sb.append(client).append("\n");
		sb.append("Order items: "); 
		sb.append("\n");
		
		for(OrderItem item : list) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
		
	}

	private double total() {
		double sum = 0;
		for(OrderItem item : list) {
			sum += item.subTotal();
		}
		
		return sum;
	}
	
	
}
