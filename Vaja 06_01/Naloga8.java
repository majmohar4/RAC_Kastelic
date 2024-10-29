import java.lang.*;
/**
* Opis: Naloga 8
Tabelirajte funkcijo y=sin(x) na intervalu od –π/4 do + π/4 v koraku 1/10. Izpisana tabela naj bo oblike:

X | Y
-----
  |

Pri tem naj bo tabela vizualno lepo oblikovana in poravnana na zaslonu. Omejite necele vrednosti števil na največ tri mesta za decimalno vejico (piko).
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga8 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		double x, y;
		double max = Math.PI/4;
		x= -Math.PI/4;
		System.out.println("   X  |   Y ");
		System.out.println("-------------");
		while (x <= max) {
					y = Math.sin(x);
					System.out.printf("% .2f | % .2f%n", x, y);
					x += 1.0 / 10;
				}
	}
}
