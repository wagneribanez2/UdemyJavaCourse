/*
 * Análise e teste da expressão condicional ternaria
 */
package course;

import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();		
				
		System.out.println((n1 % 2 == 0)? "Par" : "Impar");
		
	}

}
