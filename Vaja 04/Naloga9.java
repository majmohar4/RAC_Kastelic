import java.util.Random;

public class Naloga9 {
	public static void main(String[] args) {
		int x1 = (int)(Math.random()*29);
		int y1 = (int)(Math.random()*29);
		
		int x2 = (int)(Math.random()*29);
		int y2 = (int)(Math.random()*29);
//		A(x1,y1)
//		B(x1,y2)
//		C(x2,y2)
//		D(x2,y1)
		System.out.println("Točki pravokotnika: A("+x1+", "+y1+"), C("+x2+", "+y2+").");
		int ploščina	 = Math.abs((x1-x2)*(y1-y2));
		int obseg = Math.abs(x1-x2)*2 + Math.abs(y1-y2)*2;
		System.out.println("Ploščina tega pravokotnika je "+ploščina+" in obseg je "+obseg+".");
		
	}
}