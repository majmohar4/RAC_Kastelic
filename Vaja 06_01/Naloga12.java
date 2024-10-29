import java.lang.*;
/**
* Opis: Naloga 12
Realizirajte tudi (glej besedilo predhodne vaje):

          0
        1 0
      2 1 0
    3 2 1 0
  4 3 2 1 0
5 4 3 2 1 0

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
		int argument = Integer.valueOf(args[0])-1;
		int vrstice = argument;
		int število=0, število_2;
		for (int i = vrstice+1; i>0;i--){
			število_2 = število;
			while (število_2 < vrstice){
				System.out.print("  ");
				število_2++;
			}
			število_2 = število;
			while (število_2>=0){
				System.out.print(število_2+" ");
				število_2--;
			}
			System.out.println("");
			število++;
		}
		
	}
}
