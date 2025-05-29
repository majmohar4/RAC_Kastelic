import java.lang.*;
import java.util.*;

/**
* Opis: Krajšanje in brisanje stringov
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga6 {

	/**
	* Glavna metoda aplikacije - primer uporabe krajšanja stringov
	* 
	* @param  arg[0]
	*/
	public static void main(String[] args) {
		String niz = "Programiranje v Javi je super";
		
		System.out.println("Brisi prvo 'Java': " + brisiPrvoPojaviteNiza(niz, "Java"));
		System.out.println("Brisi zadnjo 'je': " + brisiZadnjoPojavitevNiza(niz, "je"));
		System.out.println("Brisi vse 'a': " + brisiVsePojavitvePodniza(niz, "a"));
		System.out.println("Prva polovica: " + vrniPrvoPolovicoNiza(niz));
		System.out.println("Zadnja polovica: " + vrniZadnjoPolovicoNiza(niz));
		System.out.println("Srednja tretjina: " + vrniSrednjoTretjinoNiza(niz));
		System.out.println("Odrezanih 5 zadnjih znakov: " + odreziZadnjihNZnakovNiza(niz, 5));
	}
	
	
	/**
		Funkcija izbriše prov pojavitev niza v podanem argumentu
	* 	@param niz, brisan
	*   @return String
	*/
	public static String brisiPrvoPojaviteNiza(String niz, String brisan){
		return niz.replaceFirst(brisan, "");
	}
	
	/**
		Funkcija izbriše zadnjo ponovitev niza v Stringu niz
	* 	@param niz, brisan
	*   @return String
	*/
	public static String brisiZadnjoPojavitevNiza(String niz, String brisan) {
		int index = niz.lastIndexOf(brisan);
		if (index != -1) {
			return niz.substring(0, index) + niz.substring(index + brisan.length());
		} else {
			return niz;
		}
	}
	
	/**
		Funkcija izbriše vse pojavitve podniza v Stringu niz
	* 	@param niz, podniz
	*   @return String
	*/
	public static String brisiVsePojavitvePodniza(String niz, String podniz) {
		return niz.replace(podniz, "");
	}
	
	/**
		Funkcija vrne prvo polovico podanega niza znakov
	* 	@param niz
	*   @return String
	*/
	public static String vrniPrvoPolovicoNiza(String niz){
		int t = (int) (niz.length()/2);
		return niz.substring(0, t);
	}
	
	/**
		Funkcija vrne zadnjo polovico podanega niza znakov
	* 	@param niz, brisan
	*   @return String
	*/
	public static String vrniZadnjoPolovicoNiza(String niz) {
		int t = niz.length() / 2;
		return niz.substring(t); // brez +1
	}
	
	/**
		Funkcija vrne srednjo tretjino podanega niza znakov
	* 	@param niz
	*   @return String
	*/
	public static String vrniSrednjoTretjinoNiza(String niz){
		int t = (int) (niz.length()/3);
		return niz.substring(t, 2*t);
	}
	
	/**
		Funkcija odreze zadnjih nekaj stevilo znakov, podanega kot argument
	* 	@param niz, stevilo
	*   @return String
	*/
	public static String odreziZadnjihNZnakovNiza(String niz, int stevilo){
		return (niz.substring(0, niz.length()-stevilo));
	}
	
}