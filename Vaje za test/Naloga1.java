public class Naloga1{

	public static void main(String[] args){
		int n = 4;
		int[][] tab = new int[n][n];
		System.out.println("Stevilo 0-el na diagonalah je: "+kolikoNaDiagonalah(tab));
		int tab2[] = new int[0];
		}
	static int kolikoNaDiagonalah(int[][] tab){
		int stevec = 0;
		for(int i=0; i<tab.length; i++){
			if(tab[i][i] == 0)
				stevec++;
			}
		int j=tab.length-1;
		for(int i=0; i<tab.length; i++){
			if(tab[i][j] == 0)
			stevec++;
			j--;
			}
		int srednji = (int)(tab.length/2);
		if(tab.length%2!=0)
			if(tab[srednji][srednji] == 0)
				stevec--;
		return stevec;
	}
}