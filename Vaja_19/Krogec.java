import java.lang.*;
import java.util.*;
/**
 * Opis: Razred Krogec deduje vse lastnosti iz razreda Lik in se specializira za krog
 * 
 * @author Maj
 * @version 17. 3. 2025
 */
class Krogec extends Lik {
	private int centerX, centerY;
	private double radij;
	
	public Krogec(){
		super();
		centerX=x;
		centerY=y;
		radij=1;
	}
	public Krogec(int x, int y, double radij){
		super();
		this.centerX = centerX=x;
		this.centerY = centerY=y;
		this.radij = radij;
			}
	public Krogec(int centerX, int centerY, double radij, int s1, int s2){
		super(centerX, centerY, s1, s2);
		this.centerX=centerX=x;
		this.centerY=centerY=y;
		this.radij = radij;
	}
	public String toString(){
		return ("Center kroga: T("+centerX+", "+centerY+"), radij: "+radij+", smer: S("+super.x+", "+super.y+").");
	}
	public void premakni(){
		super.premakni();
	}
	public void obrniLevo(){
		super.obrniLevo();
	}
	public void obrniDesno(){
		super.obrniDesno();
	}
	public double izracunajObseg(){
		return (Math.PI * 2 * radij);
	}
	public double izracunajPloscino(){
		return (Math.PI * radij * radij);
	}
}

