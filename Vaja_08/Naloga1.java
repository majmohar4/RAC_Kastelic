import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga1 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		System.out.println("Začetek:");
		//pravokotnik(60,'-',10,'|');
		kvadrat(10, '-', '|');
		//kvadrat(10,'+');
		System.out.println("konec");
	}
	public static void kvadrat(int širina, char a, char b){
		podčrtaj(širina, a);
		izpišiRobove(b, širina-2, širina);
		podčrtaj(širina, a);
	}
	public static void kvadrat(int širina, char a){
		podčrtaj(širina, a);
		izpišiRobove(a, širina-2, širina);
		podčrtaj(širina, a);
	}
	
	public static void pravokotnik(int širina, char a, int višina, char b){
		podčrtaj(širina, a);
		izpišiRobove(b, širina-2, višina);
		podčrtaj(širina, a);
	}
	public static void podčrtaj(int koliko, char a){
		System.out.println((""+a).repeat(koliko));
	}
	public static void podčrtaj(char a, int koliko){
		System.out.println((""+a).repeat(koliko));
	}
	
	public static void izpišiRobove(char a, int koliko, int količnik){
		int I=količnik;
		while(I>0){
		System.out.printf(a+"%"+koliko+"c"+a+"\n",' ');
		I--;
	}
		}
}
