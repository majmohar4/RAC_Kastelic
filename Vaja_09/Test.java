import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 20. 11. 2024
 */
public class Test {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		for (int i = 20; i>0; i--){
			int stevilo = (int)(Math.random()*2*Integer.MAX_VALUE-Integer.MAX_VALUE);
			System.out.println("Št. "+stevilo+" je pozitivno? "+(Integer.signum(stevilo)*stevilo==stevilo) +" njegova abs. vrednost="+Integer.signum(stevilo)*stevilo);
		}
	}
}
