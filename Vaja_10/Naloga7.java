import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 11. 2024
 */
public class Naloga7 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		if (Integer.valueOf(args[0]) < 9999){
			String letnica = args[0];
			System.out.println("Letnica rojstva: "+ letnica);
			System.out.println("Razčlenjena letnica rojstva: "+ letnica.charAt(0)+" - "+ letnica.charAt(1)+" - "+letnica.charAt(2)+" - "+letnica.charAt(3));
			
		} else System.out.print("Prosim vnesi letnico v 4-mestnem formatu.");
	}
}
