import java.lang.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 12. 11. 2024
 */
public class Naloga6 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	public static void main(String[] args) {
		final int število = Integer.valueOf(args[0]);
		int vsota=0,x, koliko_števk=0;
		
		//vsota števk
		for (int i = število; i>0;){
			x = i%10;
			vsota += x;
			i/=10;
		}
		System.out.println("Vsota števk tega števila je: "+vsota+".");
		
		
		//število števk
		for (int i = število; i>0;){
			x = i%10;
			koliko_števk++;
			i/=10;
		}
		System.out.println("Število števk je: "+koliko_števk+".");
		
		
		//največja števka
		int max=0;
		for (int i = število; i>0;){
			x = i%10;
			if (x>max) max=x;
			i/=10;
		}
		System.out.println("Največja števka je: "+max+".");
		
		
		//ponovitev števk
		int nič=0, ena=0, dva=0, tri=0, štiri=0, pet=0, šest=0, sedem=0, osem=0, devet=0, največkrat_števka=0;
		for (int i = število; i>0;){
			x = i%10;
			switch(x){
				case 0: nič++; break;
				case 1: ena++; break;
				case 2: dva++; break;
				case 3: tri++; break;
				case 4: štiri++; break;
				case 5: pet++; break;
				case 6: šest++; break;
				case 7: sedem++; break;
				case 8: osem++; break;
				case 9: devet++; break;
			}
			i/=10;
		}
		//koliko_števk
		int števke=0;
		if (nič>števke){
			števke=nič;
			največkrat_števka=0;
		}
		if (ena>števke){
			števke=ena;
			največkrat_števka=1;
		}
		if (dva>števke){
			števke=dva;
			največkrat_števka=2;
		}
		if (tri>števke){
			števke=tri;
			največkrat_števka=3;
		}
		if (štiri>števke){
			števke=štiri;
			največkrat_števka=4;
		}
		if (pet>števke){
			števke=pet;
			največkrat_števka=5;
		}
		if (šest>števke){
			števke=šest;
			največkrat_števka=6;
		}
		if (sedem>števke){
			števke=sedem;
			največkrat_števka=7;
		}
		if (osem>števke){
			števke=osem;
			največkrat_števka=8;
		}
		if (devet>števke){
			števke=devet;
			največkrat_števka=9;
		}
		
		System.out.println("Največkrat ponovljena števka je bila: "+največkrat_števka+".");
	}
}
