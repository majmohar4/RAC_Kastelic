import java.lang.*;
import java.util.*;

/**
* Opis: Uporaba metode indexOf()
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga4 {

	/**
	* Glavna metoda aplikacije - uporaba metode indexOf() in iskanje znaka v Stringu
	* 
	* @param  arg[0]  - primer parametra glavne funkcije 
	*/
	public static void main(String[] args) {
		
	}
	
	/**
		Funkcija išče če se znak pojavi v nizu
	* 	@param niz, c
	*   @return boolean
	*/
	public static boolean aliJeVNizu(String niz, char c){
		if(niz.indexOf(c)>-1)
			return true;
		else return false;
	}
	
	/**
		Funkcija išče če se v nizu pojavi podniz
	* 	@param niz, podniz
	*   @return boolean
	*/
	public static boolean aliJeVNizu(String niz, String podniz){
		if(niz.indexOf(podniz)>-1)
			return true;
		else return false;
	}
	
	/**
		Funkcija išče kje v nizu se pojavi podniz
	* 	@param niz, podniz
	*   @return int
	*/
	public static int kjeiJeVNizu(String niz, String podniz){
		int temp =niz.indexOf(podniz);
		if(temp>-1)
			return temp;
		else return -1;
	}
	
	/**
		Funkcija išče kolikorat se znak pojavi v nizu
	* 	@param niz, c
	*   @return int
	*/
	public static int kolikoJeVNizu(String niz, char c){
		int index =0;
		int ret =0;
		for(int i=0; i<niz.length(); i++){
			int temp =niz.indexOf(c, index);
			if(temp>-1){
				index=temp+1;
				ret++;
			}
			else if(temp==-1)
				break;
		}
		return ret;
	}
	/**
		Funkcija išče kolikorat se podniz pojavi v nizu
	* 	@param niz, podniz
	*   @return int
	*/
	public static int kolikoJeVNizu(String niz, String podniz){
		int index =0;
		int ret =0;
		for(int i=0; i<niz.length(); i++){
			int temp =niz.indexOf(podniz, index);
			if(temp>-1){
				index=temp+podniz.length();
				ret++;
			}
			else if(temp==-1)
				break;
		}
		return ret;
	}
}