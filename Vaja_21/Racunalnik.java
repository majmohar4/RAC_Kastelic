public class Racunalnik{
	String vrstaCPE;
	double velikostDiska;
	double velikostPomnilnika;
	double cena;
	public Racunalnik(){
		vrstaCPE = "Ryzen 7 AMD";
		velikostPomnilnika  = 16;
		velikostDiska = 512;
		cena = 1099;
	}
	public Racunalnik(String vrstaCPE, double velikostDiska, double velikostPomnilnika, double cena){
		this.vrstaCPE = vrstaCPE;
		this.velikostDiska = velikostDiska;
		this.velikostPomnilnika = velikostPomnilnika;
		this.cena = cena;
	}
	public String getVrstaCPE(){
		return vrstaCPE;
	}
	public double getVelikostPomnilnika(){
		return velikostPomnilnika;
	}
	public double getVelikostDiska(){
		return velikostDiska;
	}
	public double getCena(){
		return cena;
	}
	public void setVrstaCPE(String vrstaCPE){
		this.vrstaCPE = vrstaCPE;
	}
	public void setVelikostPomnilnika(double velikostPomnilnika){
		this.velikostPomnilnika = velikostPomnilnika;
	}
	public void setVelikostDiska(double velikostDiska){
		this.velikostDiska = velikostDiska;
	}
	public void setCena(double cena){
		this.cena = cena;
	}
	public static void main(String args[]){
		Prenosnik a = new Prenosnik("Intel i9 1300k", 512, 16, 999, 30, 4);
		Prenosnik b = new Prenosnik("Ryzen 7 AMD", 1024, 32, 1299, 30, 5);
		System.out.println(a);
		System.out.println(b);
		a.kateriJeBoljsi(b);
	}
}
class Prenosnik extends Racunalnik{
	double avtonomija;
	int velikostZaslona;
	
	public Prenosnik(){
		super();
	}
	public Prenosnik(String vrstaCPE, double velikostDiska, double velikostPomnilnika, double cena, int velikostZaslona){
			super(vrstaCPE, velikostDiska, velikostPomnilnika, cena);
			avtonomija = 0;
			this.velikostZaslona = velikostZaslona;
		}
	public Prenosnik(String vrstaCPE, double velikostDiska, double velikostPomnilnika, double cena, int velikostZaslona, int avtonomija){
			super(vrstaCPE, velikostDiska, velikostPomnilnika, cena);
			this.avtonomija = avtonomija;
			this.velikostZaslona = velikostZaslona;
		}
	public double getAvtonomija(){
		return avtonomija;
	}
	public int getVelikostZaslona(){
		return velikostZaslona;
	}
	public void setAvtonomija(double avtonomija) {
		this.avtonomija = avtonomija;
	}
	
	public void setVelikostZaslona(int velikostZaslona) {
		this.velikostZaslona = velikostZaslona;
	}
	public String toString(){
		return "Prenosnik "+this.getVrstaCPE()+" z "+this.getVelikostDiska()+"gb spomina, "+this.getVelikostPomnilnika()+"gb pomnilnika, "+this.getVelikostZaslona()+"cm zaslonom, "+this.getAvtonomija()+"h dolgo baterijo in ceno "+this.getCena()+" evrov.";
	}
	public void kateriJeBoljsi(Prenosnik a){
		if(this.avtonomija/cena > a.getAvtonomija()/a.getCena() )
			System.out.println("Boljsi je: "+ this);
		else 
			System.out.println("Boljsi je: "+ a);
	}
	
}