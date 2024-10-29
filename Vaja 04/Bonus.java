import java.lang.Math;
import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

class Untitled {
	public static void main(String[] args) {
		int low = 0;
		int high = 17;
		ArrayList<Integer> stevila = new ArrayList<Integer>();
		
		for (int i=5; i>0;i--){
			int random = (int)(Math.random()*(high-low) +low);
			stevila.add(random);
		}
		Collections.sort(stevila);
		System.out.println(stevila);
	}
}