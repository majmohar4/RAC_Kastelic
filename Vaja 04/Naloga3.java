public class Naloga3 {
	public static void main(String[] args) {
		double a = 1234.5678;
		int b =(int)a;
		int c = (int)((a-b)*10000);
		System.out.println(c + " " +b+ " ");
		System.out.println("Ali je celi del večji od manjšega celega dela: "+ (c<b));
	}
}