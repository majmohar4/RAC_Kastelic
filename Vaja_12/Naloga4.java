import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 18. 12. 2024
 */
public class Naloga4 {
	public static void main(String[] args) {
		char[] t = {'B','D','F','G','L','M','P','S','T','V','Y','Z'};
		char crka = generirajCrko();
		int index = poisciCrkoLinearno(crka, t);
		if(index==-1)System.out.println("Črke "+crka+" nismo našli v tabeli.");
		else System.out.println("Črko "+crka+" smo v tebeli našli na indexu "+index+".");
	}
	public static char generirajCrko(){
		char[] crke = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char a = crke[(int)(Math.random()*26)];
		return a;
	}
	public static int poisciCrkoBinarno(char iskano, char[] tab){
		int zac = 0, kon = tab.length-1, sre,a=0, ret=-1;
		do {
			sre = (zac+kon)/2;
			if (tab[sre] == iskano){
				ret=sre;
				break;
			}
			else if (tab[sre]<iskano){
				zac = sre+1;
			}
			else kon = sre-1;
			a++;
		}while(zac<=kon);
	System.out.println("primerjali smo "+a+"-krat");
	return ret;
	}
	public static int poisciCrkoLinearno(char crka, char[] tab){
		int a =0, ret=-1;
		for (int i =0; i<tab.length; i++){
			a++;
			if (tab[i] == crka){
				ret= i;
				break;
			}
		}
		System.out.println("primerjali smo "+a+"-krat");
		return ret;
	}
}
