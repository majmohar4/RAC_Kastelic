import java.lang.*;
/**
* Opis: Naloga 4
Program naj razstavi s parametrom vneseno število na posamezne števke. Vsako števko podanega števila naj izpiše v drugi vrstici. Npr.:

>java V4n4 2319

2
3
1
9
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga4 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		String i = args[0];
		int stevilo = Integer.valueOf(i);
		int m = i.length();
		int deljitelj=0, prejsnja_cifra=0, izpis=0, delovno_stevilo=stevilo;
		while (m>0){
			deljitelj = (int)Math.pow(10, m-1);
			izpis = delovno_stevilo/deljitelj;
			System.out.println(izpis+" ");
			delovno_stevilo -=izpis*deljitelj;
			m--;
		}
	}
}
