import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 3. 2. 2025
 */
public class Naloga2 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prebrano = scan.nextInt();
		boolean minus=true;
		if(prebrano>0) minus=false;
		String stevilo = Integer.toString(Math.abs(prebrano));
		int dolzina = stevilo.length();
        int j=0;
		for (int i=0; i<16;i++){
			if (i<15-dolzina){
				System.out.print("|''|");
			}
			else if (i==15-dolzina){
				if(minus) System.out.print("|'-'|");
				else System.out.print("|''|");
			}
			else {
				System.out.print("|'"+stevilo.charAt(j)+"'|");
                j++;
			}
		}
	}
}
