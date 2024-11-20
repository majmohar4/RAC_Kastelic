import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 20. 11. 2024
 */
public class Naloga1 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int število = Integer.valueOf(args[0]);
		najblizjaPotenca2stevilu(število);
	}
	public static void najblizjaPotenca2stevilu(int število){
		int z0 = (int)(Math.log(število) / Math.log(2));
		
		int s0 = (int)Math.pow(2, z0);
		int s1 = (int)Math.pow(2, z0+1);
		
		if ((število-s0)> (s1 - število)) z0++;
		System.out.println("Število "+število+" je najbližje potenci 2ˇ"+z0+".");
		System.out.print(z0);
	}
}