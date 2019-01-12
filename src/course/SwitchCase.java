package course;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in) ;
		int day = sc.nextInt();
		
		String retorno = verificaDia(day);
		System.out.println(retorno);
	}
	
	public static String verificaDia(int day)  {
		switch (day)  {
		case 1:
			return "Sunday" ;
			
		case 2:
			return "Monday" ;
			
		case 3:
			return "Tuesday" ;
			
		case 4:
			return "Wednesday" ;
			
		case 5:
			return "Thursday" ;
			
		case 6:
			return "Friday" ;
			
		case 7:
			return "Saturday" ;
			
		default:
			return "Invalid Day!" ;
		}

	}

}
