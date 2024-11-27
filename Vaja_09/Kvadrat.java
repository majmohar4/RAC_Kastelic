import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 20. 11. 2024
 */
public class Kvadrat{
	public static void main(String[] args) {
		int x1 = (int)(Math.random()*21-10);
		int y2 = (int)(Math.random()*21-10);
		int x2 = y2;
		int y1 = x1;
		int a = Math.abs(x1-y2);
		
		int obseg1 = getObseg(a);
		int obseg2 = getObseg(x1, x2, y1, y2);
		int ploscina1 = getPloscina(a);
		int ploscina2 = getPloscina(x1, x2, y1, y2);
		double diagonala = getDiagonala(a);
		int ploscinaIzObsega = getPloscinaIzObsega(obseg1);
		double ploscinaIzDiagonale = getPloscinaIzDiagonale(diagonala);
		
		System.out.print("Kvadrat z stranico "+a+" in točkama T1("+x1+", "+y1+") in T2("+x2+", "+y2+") ima ploscini "+ploscina1+", "+ploscina2+", "+ploscinaIzObsega+" in "+ploscinaIzDiagonale+", obseg "+obseg1+" in "+obseg2+", in diagonalo ");
		System.out.printf("%.2f.\n", diagonala);
		
		Pravokotnik Pravokotnik=new Pravokotnik();
		if (obseg1 == Pravokotnik.getObseg(a, a)){
			System.out.print("Ploščini sta enaki.");
		}
		
		
	}
	public static int getObseg(int a){
		return (a*4);
	}
	public static int getObseg(int x1, int x2, int y1, int y2){
		int a = Math.abs(x1-y2);
		return (a*4);
	}
	public static int getPloscina(int a){
		return (a*a);
	}
	public static int getPloscina(int x1, int x2, int y1, int y2){
		int a = Math.abs(x1-y2);
		return (a*a);
	}
	public static double getDiagonala(int stranica){
		return (stranica * Math.sqrt(2));
	}
	public static int getPloscinaIzObsega(int obseg){
		return (obseg/4)*(obseg/4);
	}
	public static double getPloscinaIzDiagonale(double diagonala){
		double a = (diagonala / Math.sqrt(2));
		return(a*a);
	}
}
