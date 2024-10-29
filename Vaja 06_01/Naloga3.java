import java.lang.*;
/**
* Opis: Naloga 3
Napišite javanski program ki na zaslon izriše podano obliko. Za boljšo ponazoritev sta podana dva izrisa:
>java V4n3 5

54321
4321
321
21 
>java V4n3 3

321
21
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga3 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int i = Integer.valueOf(args[0]);
		int j = i;
		int presledki = 0, št_presledkov=0;
		while (j>1){
			i=j;
			while(presledki>0){
				System.out.print(" ");
				presledki--;
			}
			while (i>0) {
				System.out.print(i);
				i--;
			}
			System.out.print("\n");
			št_presledkov++;
			presledki=št_presledkov;
			j--;
		}
	}
}
