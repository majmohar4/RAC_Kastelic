import java.lang.Math;

public class Naloga4 {
	public static void main(String[] args) {
		int max = 7;
		int min = 0;
		double stevilka = (Math.random() * (max-min)+min);
		System.out.println("Random število [0,7): "+stevilka);
		float stevilo = (float) (Math.random() * (6) + 1);
		int kocka = (int) stevilo;
		System.out.println("Nakljucno stevilo kocke: "+kocka);
	}
}