import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 10. 3. 2025
 */
public class Naloga3 {
	static int prejsnjiX=0; 
	static int prejsnjiY=0;
	
	public static Lik[] vrsta = new Lik[15];
	public static void main(String[] args) {
		generirajVrsto();
		narediKorake(10);
		
		
	}
	static void narediKorake(int koraki){
		for(int i=0; i<koraki; i++){
			add(new Lik(prejsnjiX+1, prejsnjiY+1));
			prejsnjiX++;
			prejsnjiY++;
		}
	}
	
	static void generirajVrsto(){
		//naključno v ravnini (obseg naj bo [-50,50][-50,50]). 
		int x = (int)(Math.random()*101-50);
		int y = (int)(Math.random()*101-50);
		add(new Lik(x, y));
		for (int i=1; i<15; i++){
			add(new Lik(prejsnjiX+3, prejsnjiY+3));
			prejsnjiX+=3;
			prejsnjiY+=3;
		}
	}
	static int head = 0, tail =1;
	static int naslednji(int current){
		return ((current+1)% vrsta.length);
	}
	static void add(Lik element){
		if(head != tail){
			vrsta[tail] = element;
			tail = naslednji(tail);
		}
	}
	static void remove(){
		if(tail!=naslednji(head)){
			head=naslednji(head);
		}
	}
}
