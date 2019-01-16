package secao9.abstraction.entities;

public abstract class TaxPayer {
	private String nome;
	private double rendaAnual;
	

	public TaxPayer(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double impostoPago();
	
	@Override
	public String toString() {	
		return String.format("%s: $ %.2f", getNome(), impostoPago());
	}

}
