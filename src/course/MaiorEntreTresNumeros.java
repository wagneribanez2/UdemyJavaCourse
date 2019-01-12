/*
 * Esse programa lê três número, avalia qual é o maior  
 * e o exibe na tela
 */
package course;

import java.util.Scanner;

public class MaiorEntreTresNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int higher, n1, n2, n3;
		
		System.out.println("Entrada");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3 ) {				
				System.out.printf("Higher = %d", n1);			
		}else if (n2 > n1 && n2 > n3){
			System.out.printf("Higher = %d", n2);
		}else {
			System.out.printf("Higher = %d", n3);
		}
	}

}
