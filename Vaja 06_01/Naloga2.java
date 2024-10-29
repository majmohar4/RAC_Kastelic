import java.lang.*;

/**
* Opis: Naloga 2
Napišite javanski program kin a zaslon izriše kvadrat vrednosti N s stranico N. Npr.:

55555
55555
55555
55555
55555

 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga2 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int število = Integer.valueOf(args[0]);
		int i = število, števka=0;
		while (i>0){
			števka = število;
			while (števka > 0){
				System.out.print(število);
				števka--;
			}
			System.out.println("");
			i--;
		}
	}
}
