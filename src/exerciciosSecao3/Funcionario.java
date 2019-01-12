package exerciciosSecao3;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	
	//calcular salario liquido
	public double netSalary() {
		return grossSalary - tax;
	}
	
	//aumenta o salario
	public void increaseSalary(double percentage) {
		
		grossSalary = grossSalary + (grossSalary * percentage / 100); 
	}
	
	//sobreescreve toString
	public String toString(){
		return String.format("%s, $ %.2f", this.name, this.netSalary());
	}
}
