public class Naloga5 {
	public static void main(String[] args) {
		int r1 = (int)(Math.random()*6 +1);
		int r2 = (int)(Math.random()*6 +1);
		
		int y1 = (int)(Math.random()*6 +1);
		int y2 = (int)(Math.random()*6 +1);
		
		int x1 = (int)(Math.random()*6+1);
		int x2 = (int)(Math.random()*6 +1);
		
		int radiji = r1+r2;
		
		//če je razdalja med njima manjša od seštevka polmerov se sekata
		double razdalja = Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
		System.out.println(razdalja+"  "+radiji);
		
		boolean andrej = razdalja<radiji;
		System.out.println("Kroznica 1 ima polmer "+r1+" in ima sredisce v ("+x1+","+y1+").");
		System.out.println("Kroznica 2 ima polmer "+r2+" in ima sredisce v ("+x2+","+y2+").");
		System.out.println("Kroznici se sekata: "+andrej);
		
	}
}