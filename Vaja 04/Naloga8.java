import java.util.Random;

public class Naloga8 {
	public static void main(String[] args) {
		int random = (int)(Math.random() *255);
		String stevilo_2 = String.format("%8s", Integer.toBinaryString(random)).replace(" ", "0");
		System.out.println(stevilo_2);
		
		int prvi_del = Integer.parseInt(stevilo_2.substring(0,4), 2);
		int drugi_del = Integer.parseInt(stevilo_2.substring(4,8), 2);
		String p_d = Integer.toBinaryString(prvi_del);
		String d_d = Integer.toBinaryString(drugi_del);
		System.out.println(p_d+" "+ d_d);
		System.out.println("Prvi del je "+prvi_del+", in drugi del je "+drugi_del+".");
		System.out.println("Prvi nibble je večji od drugega: "+(prvi_del>drugi_del));
		
	}
}