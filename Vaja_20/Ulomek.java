import java.lang.*;
import java.util.*;

/**
* Opis: 
* 
* @author Maj
* @version 07/04/2025
*/
public class Ulomek {
	private int stevec, imenovalec;
	
	public Ulomek(){
		stevec=1;
		imenovalec=1;
	}
	public Ulomek(int stevec){
		this.stevec = stevec;
		this.imenovalec = 1;
	}
	public Ulomek(int stevec, int imenovalec){
		this.stevec = stevec;
		if(imenovalec==0)
			this.imenovalec = 1;
		else 
			this.imenovalec = imenovalec;
	}
	
	public void pokrajsaj(){
		int deljitelj = gcd(stevec, imenovalec);
		this.imenovalec/=deljitelj;
		this.stevec/=deljitelj;
	}
	int gcd(int a, int b) {
		int t;
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	public String toString(){
		return stevec+"/"+imenovalec;
	}
	public int getStevec(){
		return stevec;
	}
	public int getImenovalec(){
		return imenovalec;
	}
	public boolean enakaUlomka(Ulomek b){
		b.pokrajsaj();
		if(this.stevec == b.getStevec() && this.imenovalec == b.imenovalec)
			return true;
		return false;
	}
	public static void main(String[] args){
		Ulomek a = new Ulomek();
		Ulomek b = new Ulomek(3);
		Ulomek c = new Ulomek(5,4);
		a.pokrajsaj();
		b.pokrajsaj();
		c.pokrajsaj();
		Ulomek sestevek = Ulomek.sestejUlomka(a, b);
		sestevek = Ulomek.sestejUlomka(sestevek, c);
		System.out.println("Ulomek a je enak ulomku b: "+a.enakaUlomka(b));
		System.out.println("Sestevek vseh 3eh ulomkov je "+sestevek);
		
	}
	public static Ulomek sestejUlomka(Ulomek a, Ulomek b){
		int stevec = a.getStevec()*b.getImenovalec()+b.getStevec()*a.getImenovalec();
		int imenovalec = a.getImenovalec()*b.getImenovalec();
		Ulomek konec = new Ulomek(stevec, imenovalec);
		konec.pokrajsaj();
		return konec;
	}
}