import java.lang.*;
/**
* Opis: Naloga 11
Realizirajte izpis, kot je dan na spodnjem primeru. Upoštevajte, da je dolžina izpisa(število vrstic izpisa) vhoden podatek programa. Dan je primer za vhodni parameter z vrednostjo 6.

5 4 3 2 1 0
  4 3 2 1 0
    3 2 1 0
      2 1 0
        1 0
          0

 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga11 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int število = Integer.valueOf(args[0])-1;
		int j =število;
		int k=0, m;
		for (int i = število; i >=0; i--){
			k=j;
			m = število;
			while (k<m){
				System.out.print("  ");
				m--;
			}
			while (k>=0){
				System.out.print(k+" ");
				k--;
			}
			System.out.println("");
			j-=1;
		}
		
	}
}
