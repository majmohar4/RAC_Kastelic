import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 11. 2024
 */
public class Naloga8 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int velikost = Integer.valueOf(args[0]);
		narediTabelo(velikost);
	}
	
	public static void narediTabelo(int velikost){
		char[] samoglasniki = {'A', 'E', 'I', 'O', 'U'};
		char[] soglasniki = {'B', 'C', 'Č', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'Š', 'T', 'V', 'Z', 'Ž'};
		char[] tabela = new char[velikost];
		for (int i = 0; i<velikost; i++) tabela[i] = ((i%2) == 0)? samoglasniki[(int)(Math.random()*samoglasniki.length)]:soglasniki[(int)(Math.random()*soglasniki.length)];
		// naredi to, da dodeli vrednosti tabeli
		for (int i = 0; i<velikost; i++)System.out.println(tabela[i]);
	}
}
