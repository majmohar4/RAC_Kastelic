import java.lang.Math;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int max = 17, min=0,random, high, low;
		int a1 = (int)(Math.random()*(max-min) +min);
		int a2 = (int)(Math.random()*(max-min) +min);
		int a3 = (int)(Math.random()*(max-min) +min);
		int a4 = (int)(Math.random()*(max-min) +min);
		int a5 = (int)(Math.random()*(max-min) +min);
		high = Math.max(Math.max(a1, a2), Math.max(a3, Math.max(a4, a5)));
		low = Math.min(Math.min(a1, a2), Math.min(a3, Math.min(a4, a5)));
		
		System.out.println("Največje generirano število je bilo: "+high);
		System.out.println("Najmanjše generirano število je bilo: "+low);
	}
}