class Naloga03 {
	public static void main(String[] args) {
		int sx=0, sy=0, r=0, x=0, y=0;
		boolean a =false, b=false;
		while (a==false){
			sx = (int)(Math.random()*300-150);
			sy = (int)(Math.random()*300-150);
			r = (int)(Math.random()*150);
			a = ((sx-r)>-150)&&((sx+r)<150)&&((sy-r)>-150)&&((sy+r)<150);
		}
		System.out.println("Krožnica z središčem ("+sx+", "+sy+") s polmerom "+r+", je v ravnini.");
		while (b==false){
			x = (int)(Math.random()*300-150);
			y = (int)(Math.random()*300-150);
			b = Math.sqrt((sx-x)*(sx-x)+(sy-y)*(sy-y))<=r;
		}
		System.out.println("Točka ("+x+", "+y+") je v določeni krožnici.");
	}
}