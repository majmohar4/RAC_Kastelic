import java.util.Random;
import java.lang.Integer;

public class Naloga7 {
	public static void main(String[] args) {
		int random = (int)(Math.random() *255);
		String stevilo_2 = Integer.toBinaryString(random);
		System.out.println(stevilo_2);
		int število_enic = stevilo_2.replace("0", "").length();
		System.out.println("Število enic je večje številu ničel v številu "+random+" "+(število_enic>4));
	}
}