import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 18. 11. 2024
 */
public class Naloga14 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		char znak = args[0].charAt(0);
		int število = Integer.valueOf(args[1]);
		if (število - 2*(število/2)==0)System.out.println("Romb z sodim številom vrstic ni možen!");
		else{
			int polovica_romba= število/2;
			int vrstica = (število+2)*3;
			for(int i=vrstica; i>0;i--) System.out.print(znak);
			System.out.println("");
			int romb=1;
			boolean čez_pol=false;
			for (int i = 0; i<število;i++){
				int leva=(vrstica-romb)/2;
				for(int j=leva;j>0;j--)System.out.print(znak);
				for(int j=romb;j>0;j--)System.out.print(" ");
				for(int j=leva;j>0;j--)System.out.print(znak);
				System.out.println("");
				if(i>=polovica_romba|| čez_pol==true){
					čez_pol=true;
					romb=romb-2;
				}
				else romb=romb+2;
			}
			for(int i=vrstica; i>0;i--) System.out.print(znak);
		}
	}
}
