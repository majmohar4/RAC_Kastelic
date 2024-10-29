class Naloga5 {
	public static void main(String[] argumenti) {
		int a = Integer.valueOf(argumenti[0]);
		System.out.println("Devetkratnik števila "+a+" je "+a*9+".");
		
		int b = a+a+a+a+a+a+a+a+a;
		
		int c = a<<3;
		c +=a;
		System.out.println(b+" "+c);
	}
}