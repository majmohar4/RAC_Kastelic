import java.lang.*;
/**
* Opis: Naloga 5
Naloge od 1 do 4 rešite z uporabo stavka for.
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga5 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - število željene naloge, args[1] - število za argument naloge
	 */
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int i = Integer.valueOf(args[1]);
		switch (a) {
			case 1:
				naloga1(i);
				break;
			case 2:
				naloga2(i);
				break;
			case 3:
				naloga3(i);
				break;
			case 4:
				naloga4(i);
				break;
			default:
			System.out.println("Nisi vpisal veljavne vrednosti.");
				break;
		}
	}
	public static void naloga1(int i) {
			for (int j = i; j > 0; j--) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	
		public static void naloga2(int i) {
			for (int j = i; j > 0; j--) {
				for (int k = 0; k < i; k++) {
					System.out.print(i);
				}
				System.out.print("\n");
			}
		}
	
		public static void naloga3(int i) {
			int presledki = 0, st_presledkov = 0;
			
			for (int j = i; j > 1; j--) {
				for (presledki = st_presledkov; presledki > 0; presledki--) {
					System.out.print(" ");
				}
				for (int k = j; k > 0; k--) {
					System.out.print(k);
				}
				System.out.print("\n");
				st_presledkov++;
			}
		}
	
		public static void naloga4(int stevilo) {
			int m = Integer.toString(stevilo).length();
			int deljitelj = 0, izpis = 0, delovno_stevilo = stevilo;
			
			for (int count = m; count > 0; count--) {
				deljitelj = (int) Math.pow(10, count - 1);
				izpis = delovno_stevilo / deljitelj;
				System.out.println(izpis + " ");
				delovno_stevilo -= izpis * deljitelj;
			}
		}
}
