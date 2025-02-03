import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 3. 2. 2025
 */
public class Naloga7 {
	public static void main(String[] args) {
		int[] meritev = {5, 3, 1, 2, 7, 8};
		int n = 6;
		int nova = 9;
		int[] novaMeritev = new int[n + 1];
		System.arraycopy(meritev, 0, novaMeritev, 0, n);
		int i = 2;
		while (i <= n) {
			novaMeritev[i - 1] = novaMeritev[i];
			i++;
		}
		novaMeritev[i - 1] = nova;
		for (int element : novaMeritev) {
			System.out.print(element + " ");
		}
	}
}


