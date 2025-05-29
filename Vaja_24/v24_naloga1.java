import java.lang.*;
import java.util.*;

/**
* Opis: Uporaba konstruktorjev razreda String
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga1 {

	/**
	* Glavna metoda aplikacije - prikazuje uporabo kontruktorjev razreda String
	* 
	* @param  arg[0]  - primer parametra glavne funkcije 
	*/
	public static void main(String[] args) {
		String s1 = new String("Literalen niz");
		String s2 = new String(s1);
		String s3 = new String();
		char[] tabela = {'a', 'b', 'c', 'd', 'e'};
		String s4 = new String(tabela, 2, 2);
		
		System.out.println("Literalen niz znakov: "+s1);
		System.out.println("String iz drugega stringa: "+s2);
		System.out.println("Prazen string: "+s3+", dolzina: "+s3.length());
		System.out.println("String iz niza znakov: "+s4);
	}
}