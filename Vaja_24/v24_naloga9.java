import java.lang.*;
import java.util.*;

/**
* Opis: 
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga9 {

	/**
	* Glavna metoda aplikacije - spisite komentar po svoji meri
	* 
	* @param  arg[0]  - primer parametra glavne funkcije 
	*/
	public static void main(String[] args) {
		System.out.println("Najljucno generirani nizi: ");
		System.out.println("    -  "+generirajNizCrke(8));
		System.out.println("    -  "+generirajNizCrkeStevilke(8));
		System.out.println("    -  "+generirajNizStevilke(8));
		System.out.println("    -  "+generirajNizCrkeVelike(8));
		System.out.println("    -  "+generirajNizCrkeMale(8));
		System.out.println("    -  "+generirajNizZnaki(8));
	}
	
	/**
		Funkcija generira dolzinaNiza dolg String z črkami
	 * 	@param dolzinaNiza
	 *  @return String
	*/
	public static String generirajNizCrke(int dolzinaNiza){     // zgolj A..Z in a..z
		StringBuffer output = new StringBuffer();
		for(int i=0;i<dolzinaNiza;i++){
			if(Math.random()>0.5)
				output.append((char)('A' + (int)(Math.random() * 26)));
			else 
				output.append((char)('a' + (int)(Math.random() * 26)));
		}
		return output.toString();
	}
	
	/**
		Funkcija generira dolzinaNiza dolg String z črkami in številkami
	 * 	@param dolzinaNiza
	 *  @return String
	*/
	public static String generirajNizCrkeStevilke(int dolzinaNiza){ // A..Z in a..z in 0..9
		StringBuffer output = new StringBuffer();
		for(int i=0;i<dolzinaNiza;i++){
			int t = (int)(Math.random()*3);
			if(t==0)
				output.append((char)('A' + (int)(Math.random() * 26)));
			else if(t==1)
				output.append((char)('a' + (int)(Math.random() * 26)));
			else
				output.append((int)(Math.random()*10));
		}
		return output.toString();
	}
	
	/**
		Funkcija generira dolzinaNiza dolg String z številkami
	 * 	@param dolzinaNiza
	 *  @return String
	*/
	public static String generirajNizStevilke(int dolzinaNiza){ // 0..9
		StringBuffer output = new StringBuffer();
		for(int i=0;i<dolzinaNiza;i++){
			output.append((int)(Math.random()*10));
		}
		return output.toString();
	}
	
	/**
		Funkcija generira dolzinaNiza dolg String z velikimi črkami
	 * 	@param dolzinaNiza
	 *  @return String
	*/
	public static String generirajNizCrkeVelike(int dolzinaNiza){
		StringBuffer output = new StringBuffer();
		for(int i=0;i<dolzinaNiza;i++){
			output.append((char)('A' + (int)(Math.random() * 26)));
		}
		return output.toString();
	}
	
	/**
		Funkcija generira dolzinaNiza dolg String z malimi črkami
	 * 	@param dolzinaNiza
	 *  @return String
	*/
	public static String generirajNizCrkeMale(int dolzinaNiza){
		StringBuffer output = new StringBuffer();
		for(int i=0;i<dolzinaNiza;i++){
			output.append((char)('a' + (int)(Math.random() * 26)));
		}
		return output.toString();
	}
	
	/**
		Funkcija generira dolzinaNiza dolg String z znaki
	 * 	@param dolzinaNiza
	 *  @return String
	*/
	public static String generirajNizZnaki(int dolzinaNiza){
		StringBuffer output = new StringBuffer();
		for(int i=0;i<dolzinaNiza;i++){
			output.append((char)(Math.random()*93+33));
		}
		return output.toString();
	}
	
}