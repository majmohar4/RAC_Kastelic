import java.lang.*;
/**
* Opis: Naloga 10
Realizirajte izpis, kot je dan na spodnjem primeru. Upoštevajte, da je dolžina izpisa(število vrstic izpisa) vhoden podatek programa. Dan je primer za vhodni parameter z vrednostjo 6.

0 1 2 3 4 5
0 1 2 3 4
0 1 2 3
0 1 2
0 1
0
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga10 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - število vrstic, ki jih funkcija napiše
	 */
	public static void main(String[] args) {
		int število = Integer.valueOf(args[0]);
		int j =število-1;
		int k=0;
		for (int i = število; i >0; i--){
			k=0;
			while (k<i){
				System.out.print(k +" ");
				k++;
			}
			System.out.println("");
		}
	}
}
