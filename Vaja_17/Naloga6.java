import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 3. 2. 2025
 */
class Naloga6{
	
	private Oseba[] tabOseb = new Oseba[20];
	
	public static void main(String[] args){
		/* vse dovoljene spremembe so znotraj tega bloka kode */
		// naredi 20 oseb in jih vpiši v this.tabOseba
		// izpiši vseh 20 oseb iz tabele
		
		for (int i=0; i<tabOseb.length; i++)
			tabOseb[i] = new Oseba();
			
		izpisiVseOsebe();
	}
		
	public static void izpisiVseOsebe(){
		for (int i=0; i<tabOseb.length; i++)
			System.out.println(tabOseb[i]);
	}
}

