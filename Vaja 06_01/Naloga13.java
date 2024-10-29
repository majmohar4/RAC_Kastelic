import java.lang.*;
/**
* Opis: Naloga 13
Realizirajte tudi (glej besedilo predhodne vaje):


0
0 1
0 1 2
0 1 2 3
0 1 2 3 4
0 1 2 3 4 5

 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga13 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - število vrstic, ki jih program napiše
	 */
	public static void main(String[] args) {
		int število = Integer.valueOf(args[0]); 
		int vrstica=0;
		for (int i = število; i>=0; i--){
			for (int število2=0; število2<vrstica; število2++) System.out.print(število2+ " ");
			System.out.println("");
			vrstica++;
		}
	}
}
