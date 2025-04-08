import java.lang.*;
import java.util.*;
/**
 * Opis: Razred Trikotnik je razširjen razred Lik, specializiran za lastnosti in metode za trikotnik
 * 
 * @author Maj
 * @version 31. 3. 2025
 */
class Trikotnik extends Lik {
	private int x1, y1, x2, y2, x3, y3;
	/**
	*    Konstruktor brez argumentov poda privzete točke
	*/
	public Trikotnik() {
			super(0, 0);
			this.x1 = 0;
			this.y1 = 0;
			this.x2 = 1;
			this.y2 = 0;
			this.x3 = 0;
			this.y3 = 1;
		}
	/**
	*    Kostruktor prejme koordinate trikotnika in jih zapiše
	*/
	public Trikotnik(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(x1, y1);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	/**
	*    Funkcija kliče premakni, ki premakne prvo točko, vse ostale pa premakne enako kot je prvo
	*/
	public void premakni() {
		super.premakni();
		int dx = super.getX() - x1;
		int dy = super.getY() - y1;
		
		x1 += dx; y1 += dy;
		x2 += dx; y2 += dy;
		x3 += dx; y3 += dy;
	}
	/**
	*    Fukcija izračuna obseg trikotnika
	*/
	public double izracunajObseg() {
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		return a + b + c;
	}
	/**
	*    Fukcija izračuna ploščino trikotnika
	*/
	public double izracunajPloscino() {
		return Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2.0);
	}
	/**
	*    Funkcija preobloži metodo toString in uporabi svojo
	*/
	public String toString() {
		return "Trikotnik s točkami: A(" +x1+ ", " +y1+ "), B(" +x2+ ", " +y2+ "), C(" +x3+ ", " +y3+ "), smer: S(" +super.s.getX()+ ", " +super.s.getY() + ").";
	}
	public static void main(String[] args){
		Trikotnik t = new Trikotnik();
	}
}


