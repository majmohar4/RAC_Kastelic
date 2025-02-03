import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 3. 2. 2025
 */
public class Naloga1 {
	/**
	 * Glavna metoda aplikacije - spisite komentar po svoji meri
	 * 
	 * @param  arg[0]  - primer parametra glavne funkcije 
	 */
	static int[] x = new int[10];
	static int[] y = new int[10];
	static char[] barva= new char[10];
	public static void main(String[] args) {
		generirajTočke();
		
	}
	static void generirajTočke(){
		char[] b = {'b', 'm', 'r', 'z', 'č', 'o'};
		for (int i =0; i<10; i++){
			x[i] = (int)(Math.random()*21-10);
			y[i] = (int)(Math.random()*21-10);
			barva[i] = b[(int)(Math.random()*6)];
		}
	}	
	static double vrniDolzinoPoti(){
		int prva = najboljOddaljena(1);
		int druga = najboljOddaljena(2);
		int tretja = najboljOddaljena(3);
		int cetrta = najboljOddaljena(4);
		double razdalja =0;
		razdalja = razdalja(prva, druga)+razdalja(prva, cetrta)+razdalja(cetrta, tretja)+ razdalja(tretja, druga);	
		return razdalja;
	}
	static double razdalja(int index1, int index2){
		double a = Math.sqrt((x[index1]-x[index2])*(x[index1]-x[index2])- (y[index1]-y[index2])*(y[index1]-y[index2]));
		return a;
	}
	static void izpisiNajboljOddaljene(){
		int i = najboljOddaljena(1);
		System.out.println("1. kvadrant - ("+x[i]+","+y[i]+")   "+barva[i]);
		i = najboljOddaljena(2);
		System.out.println("2. kvadrant - ("+x[i]+","+y[i]+")   "+barva[i]);
		i = najboljOddaljena(3);
		System.out.println("3. kvadrant - ("+x[i]+","+y[i]+")   "+barva[i]);
		i = najboljOddaljena(4);
		System.out.println("4. kvadrant - ("+x[i]+","+y[i]+")   "+barva[i]);
	}
	static int najboljOddaljena(int index){
		double max =0;
		int j=0;
		for (int i=0; i<10; i++){
			if(kvadrant(index)==kvadrant(i)){
				double razdalja = Math.sqrt(x[i]*x[i]+y[i]*y[i]);
				if(razdalja>max){
					max=razdalja;
					j=i;
				}
			}
		}
		return j;
	}
	static int kateriZNajdalj(){
		double max =0;
		int j=0;
		for (int i=0; i<10; i++){
			double razdalja = Math.sqrt(x[i]*x[i]+y[i]*y[i]);
			if(razdalja>max){
				max=razdalja;
				j=i;
			}
		}
		return kvadrant(j);
	}
	static int najdaljVKvadratu(int tocka){
		int t=tocka-1;
		double max =0;
		int j=0;
		for (int i=0; i<10; i++){
			if(kvadrant(tocka)==kvadrant(i)){
				double razdalja = Math.sqrt(x[i]*x[i]+y[i]*y[i]);
				if(razdalja>max){
					max=razdalja;
					j=i;
				}
			}
		}
		return j;
	}
	
	static int kateriNajvec(){
		int[] tab = new int[5];
		for (int i=0; i<10;i++){
			int ret = kvadrant(i+1);
			tab[ret] = tab[ret]+1;
		}
		int max = 1;
			for (int i = 2; i < 5; i++){
				if (tab[i] > tab[max]){
					max = i;
				}
			}
		return max;
		
	}
	static int kvadrant(int tocka){
		int i=tocka-1;
		if(x[i]>0){
			if(y[i]>0)
				return 1;
			if(y[i]==0)
				return 0;
			else return 4;
		}
		if(x[i]==0)
			return 0;
		else{
			if(y[i]>0)
				return 2;
			if (y[i]==0)
				return 0;
			else return 3;
		}
	}
}
