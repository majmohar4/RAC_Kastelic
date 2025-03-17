import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 10. 3. 2025
 */
public class Naloga1 {
	public static void main(String[] args) {
		Smer objekt = new Smer();
		System.out.println(objekt.toString());
		objekt.obrniDesno();
		System.out.println(objekt.toString());
		objekt.obrniLevo();
		System.out.println(objekt.toString());
	}
}

