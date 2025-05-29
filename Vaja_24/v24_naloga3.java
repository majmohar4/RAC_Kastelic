import java.lang.*;
import java.util.*;

/**
* Opis: 
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga3 {

	/**
	* Glavna metoda aplikacije - spisite komentar po svoji meri
	* 
	* @param  arg[0]  - primer parametra glavne funkcije 
	*/
	public static void main(String[] args) {
		String s = new String("hello my frineds");
		char[] tabela = izpisiPrvaInZadnjaDva(s);
	}
	
	/**
		Funkcija naredi niz znakov v katerega pošlje prva in zadnja dva znaka v nizu znakov argumenta
	* 	@param s
	*   @return char[]
	*/
	public static char[] izpisiPrvaInZadnjaDva(String s){
		if(s.length()<4){
			return new char[0];
		}
		else{
			char[] c = new char[4];
			c[0] = s.charAt(0);
			c[1] = s.charAt(1);
			c[2] = s.charAt(s.length()-2);
			c[3] = s.charAt(s.length()-1);
			v24_naloga2.izpisiPrvaInZadnjaDva(s);
			return c;
		}
	}
}