import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 11. 2024
 */
public class Naloga5 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int a = 0, b=5, c;
		int[] tabela = new int[10];
		tabela[0] = b;
		for (int i = 1; i<10; i++){
			int naslednji =a+2*b;
			tabela[i]=naslednji;
			a=b;
			b=naslednji;
		}
		for (int i = 9; i>=0; i--)System.out.println(tabela[i]);
	}
}
