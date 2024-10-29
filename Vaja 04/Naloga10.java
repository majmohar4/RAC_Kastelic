import java.util.Random;

public class Naloga10{
	public static void main(String[] args) {
		int dolz1 = (int)(Math.random()*29+1);
		int dolz2 = (int)(Math.random()*29+1);
		int dolz3 = (int)(Math.random()*29+1);
		boolean rezultat = dolz1>dolz2;
		System.out.println(dolz1+" "+dolz2);
		System.out.println("Ali jee dolžina 1 je vecja od dolzine 2? "+rezultat);
	}
}