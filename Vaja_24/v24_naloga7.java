import java.lang.*;
import java.util.*;

/**
* Opis: Uporaba metode substrin()
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga7 {

	/**
	* Glavna metoda aplikacije - prikazuje uporabo funkcij, ki zamenjajo podniz na različne načine
	* 
	* @param  arg[0]  - primer parametra glavne funkcije 
	*/
	public static void main(String[] args) {
			String besedilo = "Danes je petek, jutri je petek, petek je slab";
		
			System.out.println("Niz: "+besedilo);
		
			String prvo = zamenjajPrviNizSPodnizom(besedilo, "petek", "sobota");
			System.out.println("Zamenjaj prvi petek z 'sobota': "+prvo);
		
			String zadnji = zamenjajZadnjiNizSPodnizom(besedilo, "petek", "sobota");
			System.out.println("Zamenjaj zadnji petek z sobota: "+zadnji);
		
			String vsi = zamenjajVsePodnizeZNizom(besedilo, "petek", "sobota");
			System.out.println("Zamenjaj vse petek z sobota: "+ vsi);
		}
	
	/**
		Funkcija zamenja prvi niz s podnizom
	* 	@param niz, osnovni, novi
	*   @return String
	*/
	public static String zamenjajPrviNizSPodnizom(String niz, String osnovni, String novi){
		return niz.replaceFirst(osnovni, novi);
	}
	
	/**
		Funkcija zamenja zadnji niz s podnizom
	* 	@param niz, osnovni, novi
	*   @return String
	*/
	public static String zamenjajZadnjiNizSPodnizom(String niz, String osnovni, String novi){
		int temp = niz.lastIndexOf(osnovni);
		return niz.substring(0, temp)+novi+niz.substring(temp+novi.length());
	}
	
	/**
		Funkcija zamenja vse ponovitve podniza z nizom
	* 	@param niz, osnovni, novi
	*   @return String
	*/
	public static String zamenjajVsePodnizeZNizom(String niz, String osnovni, String novi){
		return niz.replace(osnovni, novi);
	}
}