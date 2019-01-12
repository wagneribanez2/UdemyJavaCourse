package course;

import java.util.Scanner;

public class QuadradoECubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		for(int x = 1; x <= n1; x++) {
			System.out.printf("%d %.0f %.0f%n", x, Math.pow(x, 2), Math.pow(x, 3));
		}

	}

}
