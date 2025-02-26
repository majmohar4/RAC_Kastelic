import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 26. 2. 2025
 */
public class Naloga5 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	private static Oseba[] oseba = new Oseba[20];
	public static void main(String[] args) {
		
		for (int i=0; i<oseba.length; i++)
			oseba[i] = new Oseba();
			
	izpisiVseOsebe();
	}
	
	public static void izpisiVseOsebe(){
		for (int i=0; i<oseba.length; i++)
			System.out.println(oseba[i]);
	}
}
