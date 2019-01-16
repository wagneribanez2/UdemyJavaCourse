package secao9.abstraction.entities;

public class Individual extends TaxPayer {
	private double gastosSaude;

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	public Individual(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double impostoPago() {
		if (getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - getGastosSaude() * 0.5;
		} else {
			return getGastosSaude() * 0.25 - getGastosSaude() * 0.5;
		}
	}
}
