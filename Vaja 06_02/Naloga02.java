class Naloga02 {
	public static void main(String[] args) {
		int stevilo= (int)(Math.random()*150+1);
		while (stevilo <=50 || stevilo >= 60){
			stevilo = (int)(Math.random()*150+1);
			System.out.println("Število: "+stevilo);
		}
		System.out.println("Našli smo ga "+stevilo);
	}
}