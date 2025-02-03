import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 3. 2. 2025
 */
public class Naloga6 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int n=50; // n mora biti manjši od 100
		long k=28, l=45,g=0, stevilo=0;
		n=n-7; // ker preskočimo prvih 7 členov
		System.out.print("1, 5, 6, 11, 17, 28, 45, ");
		for (int i=0; i<50-7; i++){
			stevilo = k+l;
			k=l;
			l=stevilo;
			System.out.print(stevilo+", ");
		}
	}
}
