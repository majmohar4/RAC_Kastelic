import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 18. 11. 2024
 */
public class Naloga11 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int višina, širina=80;
		for (višina=25; višina>0; višina--){
			if (višina==25||višina==1){
				System.out.print("+");
				for(int i=širina-2; i>0; i--)System.out.print("-");
				System.out.print("+");
			}
			else {
				String a = "|";
				System.out.printf("| %"+(širina-2)+"s", a);
			}
			System.out.println("");
		}
	}
}
