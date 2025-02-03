import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 3. 2. 2025
 */
public class Naloga8 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int dolzina=0;
		for (int i = 0; i<Integer.valueOf(args[0]); i++){
			int sestevek =0;
			String stevilka = Integer.toString(i);
			for (int j=0; j<stevilka.length(); j++){
				int a = Character.getNumericValue(stevilka.charAt(j));
				sestevek += a*a*a;
			}
			if (i == sestevek) dolzina++;
		}
		int[] tab = new int[dolzina];
		int k=0;
		for (int i = 0; i<Integer.valueOf(args[0]); i++){
			int sestevek =0;
			String stevilka = Integer.toString(i);
			for (int j=0; j<stevilka.length(); j++){
				int a = Character.getNumericValue(stevilka.charAt(j));
				sestevek += a*a*a;
			}
			if (i == sestevek) {
				tab[k]=i;
				k++;
			}
		}
		System.out.println(Arrays.toString(tab));
	}
}
