import java.net.*;

class Naloga3 {
	public static void main(String[] argumenti) {
		int a = Integer.valueOf(argumenti[0]);
		int b = Integer.valueOf(argumenti[1]);
		int vsota = a+b;
		System.out.println("Vsota "+a+" in "+b+" je "+vsota+".");
		
		int produkt = a*b;
		System.out.println("Produkt "+a+" in "+b+" je "+produkt+".");
		
		int razlika;
		if (a<b) {
			razlika = b-a;
			System.out.println("Razlika "+b+" in "+a+" je "+razlika+".");
	} else{
		razlika = a-b;
		System.out.println("Razlika "+a+" in "+b+" je "+razlika+".");
	}
		
		int količnik = (int)a/b;
		int ostanek = a-količnik*b;
		System.out.println("Količnik "+a+" in "+b+" je "+količnik+", in ostane "+ostanek+".");
		
}
}