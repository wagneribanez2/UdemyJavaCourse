/*
 * Testando as funcionalidades das estruturas condicionais
 */
package course;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hours;
		
		System.out.println("What time is it?");
		hours = in.nextInt();
		
		if(hours < 12) {
			System.out.println("Good morning!");
		}else if (hours < 18){
			System.out.println("Good afternoon!");
		}else {
			System.out.println("Good evening!");
		}
		
		in.close();

	}

}
