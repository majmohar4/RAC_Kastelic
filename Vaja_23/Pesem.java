import java.util.*;

abstract class Izvajalec{
	private String priimek, zvrst;
	public abstract void predstaviSe();
	public Izvajalec(){
		priimek="Žagar";
		zvrst="Hip-hop";
	}
	public Izvajalec(String priimek, String zvrst){
		this.priimek = priimek;
		this.zvrst = zvrst;
	}
	public String getPriimek(){
		return this.priimek;
	}
	public String getZvrst(){
		return this.zvrst;
	}
}
public class Pesem extends Izvajalec{
	private int dolzinaPesmi;
	private String naziv;
	public Pesem(){
		super();
		dolzinaPesmi=180;
		naziv="Baby shark";
	}
	public Pesem(String priimek, String zvrst, String naziv, int dolzinaPesmi){
		super(priimek, zvrst);
		this.naziv = naziv;
		this.dolzinaPesmi=dolzinaPesmi;
	}
	public void predstaviSe(){}
	public static int skupnoTrajanje(Pesem a, Pesem b){
		if(a.getPriimek()==b.getPriimek())
			return a.getDolzina()+b.getDolzina();
		else{
			System.out.println("Izvajalca nista ista.");
			return -1;
		}
	}
	public int getDolzina(){
		return this.dolzinaPesmi;
	}
	public boolean jeKrajsaOd(Pesem b){
		if(this.dolzinaPesmi<=b.getDolzina())
			return true;
		else return false;
	}
	public static void main(String[] args){
		Pesem[] a = new Pesem[4];
		a[0]=new Pesem();
		a[1]=new Pesem("Perry", "pop", "Roar", 156);
		a[2]=new Pesem("Nipke", "pop", "Noben", 143);
		a[3]=new Pesem("Nipke", "pop", "jaz", 155);
		Scanner scan = new Scanner(System.in);
		System.out.println(skupnoTrajanje(a[0], a[1]));
		System.out.println("Napišite priimek izvajalca.");
		String prebrano = scan.nextLine();
		
		boolean nasel = true; int t=-1;
		for(int i=0; i<a.length; i++){
			if(a[i].getPriimek()==prebrano){
				nasel = true; t=i;
				break;
			}
		}
		if(nasel){
			for(int i=0; i<a.length; i++){
				if(!(a[i].jeKrajsaOd(a[t])))
					t=i;
			}
		System.out.println("najkrajsa je pesem stevilka: "+(t+1)+". To je pesem: "+a[t].toString());
		}
		else System.out.println("Tega izvajalca nismo našli.");
	}
	public String toString(){
		return (this.getPriimek()+": "+naziv+", zvrsti: "+this.getZvrst()+", z dolzino "+dolzinaPesmi+".");
	}
}