import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 20. 11. 2024
 */
public class Pravokotnik {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		int x1 = (int)(Math.random()*21-10);
		int x2 = (int)(Math.random()*21-10);
		int y1 = (int)(Math.random()*21-10);
		int y2 = (int)(Math.random()*21-10);
		int A = Math.abs(x1-x2);
		int B = Math.abs(y1-y2);
		
		int ploscina1 = getPloscina(A, B);
		int ploscina2 = getPloscina(x1, x2, y1, y2);
		int obseg1 = getObseg(A, B);
		int obseg2 = getObseg(x1, x2, y1, y2);
		int dolzinaD1 = getDolzinaDiagonale(A, B);
		int dolzinaD2 = getDolzinaDiagonale(x1, x2, y1, y2);
		
		System.out.print("Pravokotni s stranico a="+A+" in b="+B+", določen s točkama T1("+x1+", "+y1+") in T2("+x2+", "+y2+"), ima obseg "+obseg1+" in "+obseg2+", ploščini "+ploscina1+" in "+ploscina2+", ter dolzino diagonal "+dolzinaD1+" in "+dolzinaD2+".");
	}
	public static int getPloscina(int stranicaA, int stranicaB){
		int ploscina = stranicaA*stranicaB;
		return ploscina;
	}
	public static int getPloscina(int x1, int x2, int y1, int y2){
		int ploscina = Math.abs(x1-x2)*Math.abs(y1-y2);
		return ploscina;
	}
	public static int getObseg(int stranicaA, int stranicaB){
		int obseg = 2*(stranicaA+stranicaB);
		return obseg;
	}
	public static int getObseg(int x1, int x2, int y1, int y2){
		int obseg = 2*(Math.abs(x1-x2)+Math.abs(y1-y2));
		return obseg;
	}
	public static int getDolzinaDiagonale(int stranicaA, int stranicaB){
		int dolzina = (int)(Math.sqrt(stranicaA*stranicaA+stranicaB*stranicaB));
		return dolzina;
	}
	public static int getDolzinaDiagonale(int x1, int x2, int y1, int y2){
		int dolzina = (int)(Math.sqrt(Math.abs(x1-x2)*Math.abs(x1-x2)+Math.abs(y1-y2)*Math.abs(y1-y2)));
		return dolzina;
	}
}
