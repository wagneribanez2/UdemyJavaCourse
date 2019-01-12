package exerciciosSecao3;

public class Aluno {
	public double g1, g2, g3;
	public String name;
	
	public void verifyFinalGrade() {
		double finalGrade = g1 + g2 + g3;
		
		if(finalGrade >= 60) {
			System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
			System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - finalGrade) + " POINTS");
		}
	}
}
