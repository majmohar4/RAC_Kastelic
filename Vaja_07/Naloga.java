
import java.lang.*;import javax.sound.midi.*;

/**
 * Opis: 
 * 
 * @author Maj
 * @version 17. 11. 2024
 */
public class Naloga {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		double x, y, razdalja, točke=0, vsota=0, max=0;
		for (int i = 1; i<=10; i++){
			x = Math.round((double)(Math.random()*12-6)*10.0)/10.0;
			y = Math.round((double)(Math.random()*12-6)*10.0)/10.0;
			razdalja = 10-Math.round(Math.sqrt(x*x+y*y)*10.0)/10.0;
			točke = točke + 10-razdalja;
			max=(razdalja>max?razdalja:max);
			System.out.print("serija "+ i+ ": ");
			System.out.printf("Vrednost strela: %.1f akumulacija %.1f", razdalja, točke);
			System.out.println("");
		}
		System.out.printf("Rezultat: %.1f \n", točke);
		System.out.printf("Najboljši strel: %.1f", max);
	}
}
