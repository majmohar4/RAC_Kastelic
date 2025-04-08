import java.lang.*;
import java.util.*;
/**
 * Opis: 
 * 
 * @author Maj
 * @version 10. 3. 2025
 */
class Drevo {
	private  double visina, obseg;
	private int letnica;
	private String vrsta;
	
	public Drevo(){
		vrsta = "smreka";
		visina = 4000;
		obseg = 250;
		letnica = 1700;
	}
	public Drevo(String vrsta, double visina, double obseg, int letnica){
		this.visina=visina;
		this.obseg = obseg;
		this.letnica = letnica;
		this.vrsta = vrsta;
	}
	public String getVrsta(){
		return this.vrsta;
	}
	public double getObseg(){
		return this.obseg;
	}
	public double povprecniLetniPrirast(){
		return (visina/(2025-letnica));
	}
	public boolean preveriHitrost(Drevo drevo) {
			return this.vrsta.equals(drevo.getVrsta()) && 
					this.povprecniLetniPrirast() == drevo.povprecniLetniPrirast();
		}
	public static double razlikaObsega(Drevo drevesa[], String vrsta){
		double minObseg = drevesa[0].getObseg();
		double maxObseg = minObseg;
		for(Drevo drevo : drevesa){
			if (drevo.getVrsta().equals(vrsta)) {
					if (drevo.getObseg() > maxObseg)
						maxObseg = drevo.getObseg();
					if (drevo.getObseg() < minObseg)
						minObseg = drevo.getObseg();
			}
		}
		return maxObseg-minObseg;
	}
	public static double najvecjaRazlika(Drevo[] drevesa) {
			double minObseg = drevesa[0].getObseg();
			double maxObseg = minObseg;
			for (Drevo drevo : drevesa) {
				if (drevo.obseg > maxObseg)
					maxObseg = drevo.obseg;
				if (drevo.obseg < minObseg)
					minObseg = drevo.obseg;
			}
			return maxObseg - minObseg;
		}
}
	