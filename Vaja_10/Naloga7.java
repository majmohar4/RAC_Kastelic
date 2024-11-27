import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 11. 2024
 */
public class Naloga7 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		izpisiLetnico(Integer.valueOf(args[0]));
	}
	
	public static void izpisiLetnico(int a){
		if (a < 9999 || a>999){
			System.out.println("Letnica rojstva: "+ a);
			int c = a;
			int[] tabela = new int[4];
			for (int i = 3; i>=0; i--){
				tabela[i] = c%10;
				c = (int)(c/10);
			}
			System.out.print("Razčlenjena letnica rojstva: "+ tabela[0]+" - "+ tabela[1]+" - "+ tabela[2]+" - "+ tabela[3]);
		} else System.out.print("Prosim vnesi letnico v 4-mestnem formatu.");
	}
}
