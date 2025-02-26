import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 26. 2. 2025
 */
class Naloga6{
	
	private Oseba[] tabOseb = new Oseba[20];
	
	public static void main(String[] args){
		/* vse dovoljene spremembe so znotraj tega bloka kode */
		// naredi 20 oseb in jih vpiši v this.tabOseba
		// izpiši vseh 20 oseb iz tabele
		Naloga6 naloga = new Naloga6();
		naloga.inicializiraj();
		naloga.izpisiVseOsebe();
		
		
	}
	public void inicializiraj(){
		for (int i=0; i<tabOseb.length; i++)
			this.tabOseb[i] = new Oseba();
	}
		
	public void izpisiVseOsebe(){
		for (int i=0; i<tabOseb.length; i++)
			System.out.println(tabOseb[i]);
	}
}

