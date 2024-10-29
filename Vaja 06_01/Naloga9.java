import java.lang.*;
/**
* Opis: Naloga 9
Narišite funkcijo iz predhodne naloge na izbranem intervalu na zaslon (glej podporno datoteko). Meje izbranega intervala privzamete iz parametrov ukazne vrstice (vpišete pri zagonu programa).

 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga9 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  args[0]  - najmanjša vrednost x, args[1] - največja vrednost x
	 */
	public static void main(String[] args) {
        double min = Double.valueOf(args[0]);
        double max = Double.valueOf(args[1]);
        
        int amplituda = 40;
        for (double k=min; k <max; k+=.1){
            double vsin = Math.sin(k)*amplituda;
            for (int i = 0; i<vsin+40; i++) System.out.print(" ");
            System.out.println("*");
        }
	}
}
