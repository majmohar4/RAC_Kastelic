import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 11. 2024
 */
public class Naloga1 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int i=5;
		int[] t; // deklarira tabelo
		t=new int[5]; // rezervira prostor za elemente tabele
		System.out.println( t[0] ); // izpiše vrednost prvega elementa tabele
		System.out.println( t.length ); // izpiše število elementov v tabeli
		t[ t.length-3 ] = 5; // zapiše vrednost 5 v srednji element tabele
		
		
		t = new int[12]; // to lahko obstaja
		t[12] = 12; // ne more se zapisati, ker se elementi tabele označujejo z številko iz intervala [0, ∞)
		t[-2] = 12; // ne more biti uspešen, ker so so elementi tabele označeni z številko iz intervala [0,∞)
		
	}
}
