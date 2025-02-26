import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 25. 2. 2025
 */
public class Naloga1 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 * Oseba(ime, priimek, spol, razred, stevilka)
	 */
	public static void main(String[] args) {
		Oseba janez = new Oseba("Janez", "Novak", "fant", "g3a");
		Oseba metka = new Oseba("Metka", "", "fant", "g3b");
		
		System.out.println("Janez: Ali si dekle?");
		System.out.println("Metka: "+((metka.siDekle())?"Ja":"Ne"));
		System.out.println("Janez: Kako ti je ime?");
		System.out.println("Mekta: "+metka.getIme());
		if(metka.siDekle()){
			System.out.println("Janez: Ali bi sla na zmenek?");
			System.out.println("Metka: "+((metka.biSlaNaZmenek())?"Ja":"Ne"));
		}
		else{
			System.out.println("Janez: Greva na sok?");
			System.out.println("Metka: "+((metka.grevaNaSok())?"Ja":"Ne"));
		}
	}
}
