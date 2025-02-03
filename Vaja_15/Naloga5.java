import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 3. 2. 2025
 */
public class Naloga5 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	static int[] tab = new int[100];
	
	public static void main(String[] args) {
		napolniTabelo();
		izpisiElemente();
	}
	static void izpisiElemente(){
		int vsota = 0;
		for (int i = 0; i < 100; i++)
			vsota += tab[i];
		int povprecje = vsota / 100;
		System.out.println("Povprecje: " + povprecje);
		
		for (int i = 0; i < 100; i++) {
			if (tab[i] <0.9*povprecje|| tab[i]>1.1*povprecje){
				System.out.print(tab[i] + ", ");
			}
		}
	}
	static void napolniTabelo(){
		for (int i=0; i<100; i++)
			tab[i] = (int)(Math.random()*100);
	}
}
