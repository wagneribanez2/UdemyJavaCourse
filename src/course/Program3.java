/*
 * Est� classe mostra a utiliza��o de alguns m�todos para entrada
 * de dados pelo usu�rios atrav�s do teclado
 */
package course;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		String sentence;
		String x, y, z;

		Scanner sc = new Scanner(System.in);

		sentence = sc.nextLine();

		// l� linha a linha
		x = sc.next();
		y = sc.next();
		z = sc.next();

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// l� String separadas por espa�o
		x = sc.next();
		y = sc.next();
		z = sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}
