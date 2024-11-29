import java.util.*;
public class Naloga10 { public static void main(String[] args) {String[] ocene = new String[(int)(Math.random()*10+25)];
		int i = 0, odl=0, pbd=0, db=0, zd=0, nzd=0, neoc=0;
		do{ String ocena = (new Scanner(System.in)).nextLine();
			if (new String("odl").equals(ocena)) {ocene[i] ="5";
				odl++;}
			else if (new String("pbd").equals(ocena)){ocene[i] ="4"; 
					pbd++;}
			else if(new String("db").equals(ocena)){ocene[i] ="3"; 
					db++;}
			else if (new String("zd").equals(ocena)) {ocene[i] ="2"; 
					zd++;}
			else if (new String("nzd").equals(ocena)) {ocene[i] ="1"; 
					nzd++;}
			else if (new String("neoc").equals(ocena))ocene[i] ="neoc";
			else{System.out.println("Ni validna opcija.");
				i--;}
		i++;
		} while (i<ocene.length);
		System.out.print("Uspehi: "+(Arrays.toString(ocene).replace("[","")).replace("]", "")+"\nNezadostni: "+nzd+"\nZadostni: "+zd+"\nDobri: "+db+"\nPravdobri: "+pbd+"\nOdlični: "+odl+"\nNeocenjeni: "+neoc);}}