import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga12 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int y=0, x=0;
		int lines=24;
		for(int line=0;line<25;line++){
			for (int col=0;col<80;col++){
				y = 25-line; x=col;
				//if (y<=x) // y=x
				if (y<= 0.25*x) // y=x/4 : položnejša
				//if (y<= Math.log(x) ) // y=log(x) :logaritem
				//if (y<= Math.log(x*4) ) // y=log(x*4) :strmina
				//if (y<=24*Math.sin(x*(Math.PI/80))) // sinus z A=24
				// in raztegom PI/80
					System.out.print('+');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}
