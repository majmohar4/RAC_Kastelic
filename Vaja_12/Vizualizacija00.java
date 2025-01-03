import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 18. 12. 2024
 */
public class Vizualizacija00 {
	
	static int dolzinaTabele=12;
	
	public static void main(String[] args){
		
		int[] tab=generirajTabelo(dolzinaTabele);
		
		izpisiPrvoVrsticoTabele(tab);
		izpisiKazelecElemTabele(tab,6);
		
	}
	public static int[] generirajTabelo(int dolzina){
		int[] tab = new int[dolzina];
		for(int i=0; i<tab.length; i++)
			tab[i] = (int)(Math.random()*100000);
		return tab;
	}
	public static void izpisiPrvoVrsticoTabele(int[] tab){
		for (int i=0; i<tab.length; i++)
			System.out.print(tab[i]+" ");
		System.out.println();
	}
	public static void izpisiKazelecElemTabele(int[] tab, int index){
		int vsota =0,i;
		for (i=0; i<index; i++){
			vsota= vsota + prestejStevke(tab[i])+1;
		}
		int dolzina = prestejStevke(tab[i+1]);
		dolzina = (dolzina%2==0)?(int)(dolzina/2):(int)(dolzina/2)+1;
		vsota+=dolzina;
		System.out.printf("%"+vsota+"s", "*");
	}
	public static int prestejStevke(long abc){
			int ll=1;
			for(;(abc/=10)!=0;ll++);
			return Math.max(1,ll);
		}
}

