public class AstralnoTelo{
	protected String naziv;
	public AstralnoTelo(){
		naziv = "";
	}
	public AstralnoTelo(String naziv){
		this.naziv = naziv;
	}
}
class Zvezda extends AstralnoTelo{
	protected String nazivZvezde;
	protected double radij, oddaljenostOdSonca;
	
	public Zvezda(){
		super();
		radij = 0;
		oddaljenostOdSonca=0;
	}
	public Zvezda(String naziv, double radij, double oddaljenostOdSonca){
		super(naziv);
		this.nazivZvezde = naziv;
		this.radij = radij;
		this.oddaljenostOdSonca = oddaljenostOdSonca;
	}
	public String getNaziv(){
		return nazivZvezde;
	}
	public double getRadij(){
		return radij;
	}
	public double getOddaljenost(){
		return oddaljenostOdSonca;
	}
	public Zvezda vrniSoncuBlizjoZvezdo(Zvezda a){
		if (this.oddaljenostOdSonca> a.getOddaljenost()) {
			return this;
		}
		else return a;
	}
	public double vrniManjsoRazdaljo(Zvezda a){
		if(this.radij >a.getRadij())
			return this.radij;
		else return a.getRadij();
	}
	public double manjsaOdRazdalij(Zvezda a){
		if(this.radij <a.getRadij())
			return this.radij;
		else return a.getRadij();
	}
	public void sestej(Zvezda a){
		if (this.radij == a.getRadij()){
			System.out.println("Ni možno sešteti zvezd.");
		}else{
			double nRadij = 0;
			if(a.getRadij()>this.radij)
				nRadij= a.getRadij() + this.radij*0.1;
			else 
				nRadij = this.radij + a.getRadij()*0.1;
			this.radij = nRadij;
			this.oddaljenostOdSonca = Math.max(this.oddaljenostOdSonca, a.getOddaljenost());
			this.nazivZvezde = a.getNaziv().charAt(0) + ""+this.nazivZvezde.charAt(0);
		}
	}
	public String toString() {
			return nazivZvezde + ": radij = " + radij + ", oddaljenost od Sonca = " + oddaljenostOdSonca;
		}
	public static void main(String[] args) {
			Zvezda[] zvezde = new Zvezda[5];
			zvezde[0] = new Zvezda("Sirius", 1.7, 8.6);
			zvezde[1] = new Zvezda("Betelgeza", 887.0, 548);
			zvezde[2] = new Zvezda("Proxima", 0.1542, 4.24);
			zvezde[3] = new Zvezda("Rigel", 78.9, 860);
			zvezde[4] = new Zvezda("Vega", 2.36, 25.04);
		
			Zvezda najblizja = zvezde[0];
			for (int i = 1; i < zvezde.length; i++) {
				najblizja = zvezde[i].vrniSoncuBlizjoZvezdo(najblizja);
			}
		
			System.out.println("Najblizja soncu: "+ najblizja.nazivZvezde);

			Zvezda novaZvezda = new Zvezda(zvezde[0].nazivZvezde, zvezde[0].radij, zvezde[0].oddaljenostOdSonca);
			for (int i = 1; i < zvezde.length; i++) {
				if (zvezde[i].getRadij() != novaZvezda.getRadij()) {
					novaZvezda.sestej(zvezde[i]);
				}
			}
		
			System.out.println("Sestete zvezde: "+novaZvezda);
		}
}
