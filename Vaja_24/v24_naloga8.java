import java.lang.*;
import java.util.*;

/**
* Opis: primerjava compareTo() in equals()
* 
* @author Maj
* @version 29/05/2025
*/
public class v24_naloga8 {

	/**
	* Glavna metoda aplikacije - primeri uporabe funkcij
	* 
	* @param  arg[0]
	*/
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hallo";
		String s3 = "hello";
		
		System.out.println("Stringa s1 in s3 sta enaka: "+s1.equals(s3));
		System.out.println("Stinga s1 in s2 sta eneka: "+s1.equals(s2));
		String out = new String("Po abecedi je string aa prej od bb.");
		if(s1.compareTo(s2) < 0) {
			out = out.replace("aa", "s1");
			out = out.replace("bb", "s2");
		} else {
			out = out.replace("bb", "s1");
			out = out.replace("aa", "s2");
		}
		System.out.println(out);
	}
}