import java.lang.*;
import java.util.*;

/**
* Opis: Primeri združevanja dveh ali več stringov
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga5 {

	/**
	* Glavna metoda aplikacije - primeri združevanja dveh ali več stringov
	* 
	* @param  arg[0]
	*/
	public static void main(String[] args) {
		String s1 = "Jaz";
		String s2 = " sem ";
		String s3 = "kul.";
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2.concat(s3)));
		
		StringBuilder builder =new StringBuilder("");
		System.out.println(builder.append(s1).append(s2).append(s3));
		System.out.println(builder.insert(0, s1).insert(s1.length(), s2).insert(s1.length()+s2.length(), s3));
	}
}