package exerciciosSecao3;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.g1 = sc.nextDouble();
		aluno.g2 = sc.nextDouble();
		aluno.g3 = sc.nextDouble();
		
		aluno.verifyFinalGrade();
		sc.close();
	}

}
