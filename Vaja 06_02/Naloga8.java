import java.util.Random;

public class Naloga8 {
	public static void main(String[] args) {
		int random = (int)(Math.random() *255);
		System.out.println("Število: "+Integer.toBinaryString(random));
		int nibble1 = (random>>4)&0xF;
		int nibble2 = random &0xF;
		System.out.println("prvi: "+nibble1+" in drugi "+nibble2);
		boolean odgovor = (nibble1>nibble2);
		System.out.println("Nibble 1 je večji od 2: "+odgovor);
	}
}