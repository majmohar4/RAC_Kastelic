import java.lang.Math;
import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

class Untitled {
	public static void main(String[] args) {
		int low = 100;
		int high = 0;
		int max = 17, min=0,random;
		for (int i = 0; i<5; i++){
			random = (int)(Math.random()*(max-min) +min);
			if (random<low){
				low = random;
			}
			if (random>high){
				high=random;
			}
		}
		System.out.println("Največje generirano število je bilo: "+high);
		System.out.println("Najmanjše generirano število je bilo: "+low);
	}
}