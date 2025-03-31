import java.lang.*;
import java.util.*;
/**
 * Opis: Class Lik shranjuje pozicijo lika in smer gibanje (abstraktno smer)
 * 
 * Spremenljivke: x, y, s
 * @author Maj
 * @version 17. 3. 2025
 */
public class Lik {
	private int x;
	private int y;
	public Smer s;
	
	/**
	 * Konstruktor, ki je klican brez argumentov
	**/
	public Lik(){
		x=0;
		y=0;
		s = new Smer();
	}
	
	/**
	 * Konstruktor, ki je klican z argumenti pozicije x in y
	**/
	public Lik(int x, int y){
		this.x = x;
		this.y = y;
		s = new Smer();
	}
	
	/**
	 * Konstruktor, ki je klican z argumenti pozicije x in y in smerjo
	**/
	public Lik(int x, int y, int s1, int s2){
		this.x = x;
		this.y = y;
		s = new Smer(s1, s2);
	}
	
	/**
	*    Kliče funkcijo getX() iz objekta vrste Smer;
	*/
	public int getX(){
		return x;
	}
	
	/**
	*    Kliče funkcijo getY() iz objekta vrste Smer;
	*/
	public int getsY(){
		return y;
	}
	/**
	*    Kliče funkcijo getX() iz objekta vrste Smer;
	*/
	public int getsX(){
		return s.getX();
	}
	
	/**
	*    Kliče funkcijo getY() iz objekta vrste Smer;
	*/
	public int getY(){
		return s.getY();
	}
	/**
	 *   Kliče funkcijo obrniLevo() iz objekta vrste Smer;
	*/
	public void obrniLevo(){
		s.obrniLevo();
	}
	
	/**
	*    Kliče funkcijo obrniDesno() iz objekta vrste Smer;
	*/
	public void obrniDesno(){
		s.obrniDesno();
	}
	
	/**
	*    Funkcija premakne lik v smeri gibanja, ki jo dobi iz objekta vrsta Smer
	*/
	public void premakni(){
		x+=s.getX();
		y+=s.getY();
	}
	
	/**
	*    @param stevilo
	*    Funkcija premakne lik v smeri gibanja za količino stevilo, ki jo dobi iz objekta vrsta Smer
	*/
	public void premakni(int stevilo){
		x+=s.getX()+stevilo;
		y+=s.getY()+stevilo;
	}
}