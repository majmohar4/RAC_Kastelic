import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 11. 2024
 */
public class Naloga6 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		char[] samoglasniki = {'A', 'E', 'I', 'O', 'U'};
		int velikost = (int)(Math.random()*11+10);
		char[] tabela = new char[velikost];
		for (int i = 0; i<velikost; i++){
			int število = (int)(Math.random()*5);
			tabela[i] = samoglasniki[število];
		}
		for (int i=0; i<tabela.length;i++)System.out.println(tabela[i]);
		System.out.println("Prva dva elementa: "+tabela[0]+" "+tabela[0]);
		System.out.println("Zadnje dva elementa: "+tabela[velikost-1]+" "+tabela[velikost-2]);
	}
}
