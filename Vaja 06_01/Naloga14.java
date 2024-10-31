import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga14 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int število = Integer.valueOf(args[0])-1;
		int števka = 0;
		int št;
		for (int i = število+1; i>0; i--){
			št = števka;
			for (int k=število; k>števka; k--){
				System.out.print("  ");
			}
			while (št>=0){
				System.out.print(št+" ");
				št--;
			}
			//števka = -1 zaradi zadnjega while
			// števka je posamezna zadeva
			for (št = 0; št<=števka; št++){
				System.out.print(št+" ");
			}
			
			System.out.println("");
			števka++;
		}
		
		//število = 5
		for (int i = število; i >= 0; i--) {
			for (int k = število; k > i; k--) {
				System.out.print("  ");
			}
			for (št = i; št >= 0; št--) {
				System.out.print(št + " ");
			}
			for (št = 0; št <= i; št++) {
				System.out.print(št + " ");
			}
			System.out.println("");
		}
	}
}
