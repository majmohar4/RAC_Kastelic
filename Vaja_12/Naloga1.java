/**
 * Opis: štetje mest števila long
 * 
 * @author Maj
 * @version 27. 11. 2024
 */
public class Naloga1 {
	public static void main(String[] args) {
		long cifra = 435345334500344534L;
		System.out.println(x_32_v4(cifra));
	}
	public static int x_32_v4(long abc){
			int ll=1;
			for(;(abc/=10)!=0;ll++);
			return Math.max(1,ll);
		}
	
}
