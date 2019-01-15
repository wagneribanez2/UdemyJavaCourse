package exerciciosSecao6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianClassDemo {
	public static void main(String args[]) {
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc.getTime());
		
		System.out.println("Dia: " + gc.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + gc.get(Calendar.MONTH) + 1);
		System.out.println("Ano: " + gc.get(Calendar.YEAR));
		
	}
}
