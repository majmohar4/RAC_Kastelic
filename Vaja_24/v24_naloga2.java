import java.lang.*;
import java.util.*;

/**
* Opis: Primer uporabe metode charAt(int index)
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga2 {

	/**
	* Glavna metoda aplikacije - prikazuje uporabo metode charAt()
	* 
	* @param  arg[0]
	*/
	public static void main(String[] args) {
		String hello = new String("Hello");
		izpisiPrvaInZadnjaDva(hello);
	}
	
	/**
		Funkcija izpiše prva in zadnja dva znaka v Stringu, ki je podan kot argument
	* 	@param dolzinaNiza
	*   @return String
	*/
	public static void izpisiPrvaInZadnjaDva(String s){
		if(s.length()<4)
			System.out.println("Premalo znakov v tabeli.");
		else{
			System.out.println("Prva dva znaka: "+s.charAt(0)+","+s.charAt(1)+" in zadnja dva znaka: "+s.charAt(s.length()-2)+", "+s.charAt(s.length()-1));
		}
	}
}