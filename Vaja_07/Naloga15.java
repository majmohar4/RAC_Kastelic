import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 18. 11. 2024
 */
public class Naloga15 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int vrstica = 80, stolpec = 16;
		int count = 0, odštevanje=0;
		boolean čez_sred=false;
		int progres;
		
		for (int i = stolpec; i>1; i--){
			progres=count;
			if (count==0){
				System.out.print("+");
				for (int x=vrstica-2; x>0;x--) System.out.print("-");
				System.out.print("+");
			}
            else{
                for (int j = count; j>0;j--){//do zaćetka kvadrata
                    System.out.print("|   ");
                }
                System.out.print("+---");
                for (int j = vrstica-count*4*2-8; j>0;j--){//od sredine do konca
                    System.out.print("-");
                }
                System.out.print("---+");
                for (int j = count; j>0; j--){
                    System.out.print("   |");
                }
            }
			if (count == stolpec/2-1|| čez_sred==true){
				čez_sred=true;
				count--;
			}
			else count++;
			System.out.println("");
		}
	}
}
