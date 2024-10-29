class Naloga9 {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		if (a>b){
			if (a>c) {
				System.out.print(a+" ");
				if (b>c) System.out.print(b+" "+c);
				else System.out.print(c+" "+ b);
			}
			else System.out.print(c+" "+a+" "+b);
		}
		else{
			if (b>c) {
				if (c>a) System.out.print(b+" "+c+" "+a);
				else System.out.print(b+" "+a+" "+c);
			}
			else System.out.println(c+" "+b+" "+a);
		}
	}
}