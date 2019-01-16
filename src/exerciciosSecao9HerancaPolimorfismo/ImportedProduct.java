package exerciciosSecao9HerancaPolimorfismo;

public class ImportedProduct extends Product {
	private double customsFee;
	
	public ImportedProduct() {
		
	}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
		
	@Override
	public String priceTag() {
		return String.format("%s (Customs fee: $ %.2f", 
				super.priceTag(), totalPrice() );
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	
}
