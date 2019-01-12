/*
 * Testa as funcionalidades dos operadores bitwise
 */
package course;

public class TesteBitwise {
	public static void main(String args[]) {
		// representação binaria
		// 01011001
		int n1 = 89;

		// representação binaria
		// 00111100
		int n2 = 60;
		
		System.out.println(n1 & n2); // retorna 24
		System.out.println(n1 | n2); // retorna 125
		System.out.println(n1 ^ n2); // retorna 101
	}
}
