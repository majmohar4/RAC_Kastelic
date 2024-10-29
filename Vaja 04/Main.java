import java.lang.Math;
public class Main {
	public static void main(String ar[]) {
		double deg = 90;
		System.out.println("Stopinje: " + deg);
		
		double radians = Math.toRadians(deg);
		System.out.println("Stopinje v radianih: " + radians);
		
		double gradians = deg * (200.0 / 180.0);
		System.out.println("Stopinje v grandianih: " + gradians);
	}
}