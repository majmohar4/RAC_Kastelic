import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 25. 2. 2025
 */
public class Naloga3 {
	static int o1=0, o2=0;
	
	public static void main(String[] args) {
		Oseba[] oseba = new Oseba[20];
		
		for (int i=0; i<oseba.length; i++)
			oseba[i] = new Oseba();
			
		izberiOsebe();
		if((oseba[o1].getSpol() == oseba[o2].getSpol()) &&(oseba[o1].getSpol()=="dekle"))
			izberiOsebe();
			
		//zamenja osebi, če slučajno prvi ni fant
		if(oseba[o1].getSpol() != "fant"){
			int temp = o1;
			o1=o2;
			o2=temp;
		}
		//konverzacija ali pogovor
		System.out.print("Oseba1: ");
		oseba[o1].predstaviSe();
		System.out.println("Oseba1: Ali si dekle?");
		System.out.println("Oseba2: "+((oseba[o2].siDekle())?"Ja.":"Ne."));
		System.out.println("Oseba1: Kako ti je ime?");
		System.out.println("Oseba2: "+oseba[o2].getIme());
		if(oseba[o2].siDekle()){
			System.out.println("Oseba1: Ali bi sla na zmenek?");
			System.out.println("Oseba2: "+((oseba[o2].biSlaNaZmenek())?"Ja.":"Ne."));
		}
		else{
			System.out.println("Oseba1: Greva na sok?");
			System.out.println("Oseba2: "+((oseba[o2].grevaNaSok())?"Ja":"Ne"));
		}
	}
	static void izberiOsebe(){
		o1 = (int)(Math.random()*20);
		o2 = (int)(Math.random()*20);
	}
}
