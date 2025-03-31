import java.lang.*;
import java.util.*;
/**
 * Opis: Class Smer shranjuje smer s pomočjo privatnih lastnosti x in y
 * 
 * Spremenljivke: x, y
 * @author Maj
 * @version 16. 3. 2025
 */
public class Smer{
	
	private int x;
	private int y;
	
	public Smer(){
		x = 1;
		y = 0; //desno
	}
	public Smer(int x, int y){
		this.x = (int)Math.signum(x);
		if(this.x!=0)
			this.y=0;
		else
			this.y = (int)Math.signum(y);
	}
	/**
	*    @return x
	*    Fukcija vrne x komponento smeri gibanja
	*/
	public int getX(){
		return this.x;
	}
	
	/**
	*    @return y
	*    Fukcija vrne y komponento smeri gibanja
	*/
	public int getY(){
		return this.y;
	}
	
	/**	*    Funkcija simulira obračanje smeri v levo s pomočjo menjave koordinat
	*/
	public void obrniLevo(){
		int t = y;
		y=x;
		x = t*(-1);
	}
	
	/**
	*    Funkcija simulira obračanje smeri v desno s pomočjo menjave koordinat
	*/
	public void obrniDesno(){
		int t =x;
		x=y;
		y=t*(-1);
	}
	
	/**
	*    Funkcija izpiše "vektor" smeri gibanja
	*/
	public String toString(){
		return ("Vector = ("+x+", "+y+")");
	}
}