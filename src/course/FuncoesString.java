/*
 * Algumas funções úteis para Strings
 */
package course;

public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String lowerCase = original.toLowerCase();
		String upperCase = original.toUpperCase();
		String trim = original.trim();
		
		String[] vect = original.split(" ");
		
		
		
		System.out.println("Original : -" + original + "-");
		System.out.println("LowerCase: -" + lowerCase +"-");
		System.out.println("UpperCase: -" + upperCase +"-");
		System.out.println("Tim	 : -" + trim +"-\n");
		
		
		System.out.println("String dividida: ");
		for(String s: vect) {
			System.out.println(s);
		}
		
	} 

}
