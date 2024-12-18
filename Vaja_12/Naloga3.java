import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 18. 12. 2024
 */
public class Naloga3 {
	public static void main(String[] args) {
		int[] tabela = {2,4,5,11,23,25,33,55,88,89,91,93,98,103,110,130};
		int nasli = binarnoIskanje(tabela, 98);
	}
	public static int binarnoIskanje(int[] tab, int iskano){
		int zac = 0, kon = tab.length-1, sre;
		do {
			sre = (zac+kon)/2;
			if (tab[sre] == iskano){
				System.out.println("našli na indexu: "+sre);
				return sre;
			}
			else if (tab[sre]<iskano){
				zac = sre+1;
			}
			else kon = sre-1;
		}while(zac<=kon);
	return -1;
	}
}
