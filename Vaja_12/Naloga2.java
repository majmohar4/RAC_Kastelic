import java.lang.*;
import java.util.*;
/**
 * Opis: Plače 100ih delavcev v podjetju
 * 
 * @author Maj
 * @version 18. 12. 2024
 */
public class Naloga2 {
	public static void main(String[] args) {
		int stevilo = 100;
		double visina_place = 680;
		double[] tabela_plac = generirajPlace(stevilo);
		double masaPlac = sestejPlace(tabela_plac);
		izpisite_IDje(tabela_plac, visina_place);
		System.out.println("Nekdo od delavcev ima plačo 15000: "+aliJeMax(tabela_plac));
	}
	public static double[] generirajPlace(int stevilo){
		double[] tab = new double[stevilo];
		for (int i =0; i<tab.length; i++)
			tab[i] = ((int)(Math.random()*1450100+50000))/100d;
		return tab;
	}
	public static boolean aliJeMax(double[] tab){
		boolean a = false;
		for (int i = 0; i<tab.length; i++)
			if(tab[i]>=15000){
				a=true;
				break;
			}
		return a;
	}
	public static double sestejPlace(double[] tab){
		double vsota=0;
		for (int i=0; i<tab.length;i++)
			vsota+=tab[i];
		return vsota;
	}
	public static void izpisite_IDje(double[] tab, double visina){
		System.out.println("Plačo v višini "+visina+"€ imajo delavci številka: ");
		boolean niEdini = false;
		for (int i =0; i<tab.length; i++){
			if(tab[i] == visina){
				System.out.print(i);
				niEdini = true;
			}
		}
		if(!niEdini) System.out.println("nobeden.");
	}
}
