package exerciciosSecao6;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date dt = new Date();
		
		System.out.println(dt.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("E dd/MM/yyyy 'at' k:mm:ss a zzz");
		System.out.println("Currend date: " + sdf.format(dt));

		//Parsing String into Dates
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String input = args.length == 0 ? "1818-11" : args[0];
		
		System.out.println(input + " Parses as");
		Date t ;
		try {
			t = ft.parse(input);
			System.out.println(t);
		}catch(ParseException e) {
			System.out.println("Unsparseable using " + ft.toPattern());
		}
		
		
		//Sleeping for a while
		System.out.println("Sleeping for a while!");
		try {
			System.out.println(new Date());
			Thread.sleep(1000 * 3);
			System.out.println(new Date());
		} catch (Exception e) {
			System.out.println("An exception occurred!");
		}
		
		//Measuring Elapsed Time
		System.out.println("\nMeasuring Elapsed Time");
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			
			Thread.sleep(1000 * 3);			
			System.out.println(new Date() + "\n");
			
			long end = System.currentTimeMillis();
			long diff = end - start ;
			System.out.println("Difference is : " + diff);
			
		} catch (Exception e) {
			System.out.println("An exception occurred!");
		}
		
		/*
		System.out.println("Bruno é mais novo que Wagner: ");		
		System.out.println(new Date(88, 13,05).after(new Date(89, 01, 11)));
		
		System.out.println("\nWagner é mais velho que Aline? ");		
		System.out.println(new Date(89,01,11).before(new Date(92,21,06)));
		
		System.out.printf("Current date: %tc%n", dt);
		
		Date cloned = (Date) dt.clone();
		System.out.println("Data clonada: " +  cloned);
		
		System.out.println("Data iguais? " + dt.equals(cloned));
		*/
	}

}
