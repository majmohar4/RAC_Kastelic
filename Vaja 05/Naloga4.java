class Naloga4 {
	public static void main(String[] args) {
				int a=3;
				int rez;
				rez = a << 1;
				System.out.println(rez+" "+Integer.toString(rez,2)+" "+String.format("%x",rez));
				rez = a << 2;
				System.out.println(rez+" "+Integer.toString(rez,2)+" "+String.format("%x",rez));
				rez = a << 3;
				System.out.println(rez+" "+Integer.toString(rez,2)+" "+Integer.toString(rez,16));        
			}
		
	}