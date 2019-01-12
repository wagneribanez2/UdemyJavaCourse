/*
 * Está classe mostra a utilização de alguns métodos para entrada
 * de dados pelo usuários através do teclado
 */
package course;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		String sentence;
		String x, y, z;

		Scanner sc = new Scanner(System.in);

		sentence = sc.nextLine();

		// lê linha a linha
		x = sc.next();
		y = sc.next();
		z = sc.next();

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// lê String separadas por espaço
		x = sc.next();
		y = sc.next();
		z = sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}
