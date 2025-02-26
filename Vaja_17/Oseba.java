
/**
 * Write a description of class Ime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oseba
{
        private String ime;
        private String priimek;
        private String spol;
        private String razred;
        private int stevilka;
        
        String[] spolIzbira = {"fant", "dekle"};
        String[] imena = {
            "Luka", "Matej", "Ana", "Miha", "Tina",
            "Gregor", "Nina", "Blaž", "Eva", "Marko",
            "Maja", "Simon", "Jana", "Rok", "Petra",
            "David", "Anže", "Katarina", "Vid", "Urška"
        };
    
        String[] priimki = {
            "Novak", "Horvat", "Krajnc", "Zupan", "Kovač",
            "Potočnik", "Mlakar", "Vidmar", "Kos", "Turk",
            "Kralj", "Rozman", "Božič", "Kavčič", "Petek",
            "Golob", "Kregar", "Breznik", "Oblak", "Sever"
        };
        String[] razdredi = {
            "g1a", "g1b", "g2a", "g2b", "g3a", "g3b", "g4a", "g4b"
        };
        
        Oseba(){
            ime = imena[(int)(Math.random()*20)];
            priimek = priimki[(int)(Math.random()*20)];
            spol = spolIzbira[(int)(Math.random()*2)];
            razred = razdredi[(int)(Math.random()*8)];
            stevilka = getStevilka();
        }
        Oseba(String ime){
            setIme(ime);
            priimek = priimki[(int)(Math.random()*20)];
            spol = spolIzbira[(int)(Math.random()*2)];
            razred = razdredi[(int)(Math.random()*8)];
            stevilka = getStevilka();
        }
        Oseba(String ime_d, String priimek_d, String spol_d, String razred_d){
            setIme(ime_d);
            setPriimek(priimek_d);
            setSpol(spol_d);
            setRazred(razred_d);
            setStevilka();
        }
        Oseba(String ime_d, String priimek_d, String spol_d, String razred_d, int stevilka_d){
            setIme(ime_d);
            setPriimek(priimek_d);
            setSpol(spol_d);
            setRazred(razred_d);
            setStevilka(stevilka_d);
        }
    
        public String toString(){
            return "oseba:< "+ime+","+priimek+","+spol+">";
        }
        
        public String getIme() {
            return ime;
        }
        public void setIme(String ime) {
            if (ime.length() >= 3 && ime.length() <= 15) {
                this.ime = ime;
            } else if (ime.length() > 15) {
                this.ime = ime.substring(0, 15);
            } else {
                while (ime.length() < 3) {
                    ime += (int) (Math.random() * 10);
                }
                this.ime = ime;
            }
        }
        public String getPriimek() {
            return priimek;
        }
        public void setPriimek(String priimek) {
            if (priimek.length() >= 3 && priimek.length() <= 15) {
                this.priimek = priimek;
            } else if (priimek.length() > 15) {
                this.priimek = priimek.substring(0, 15);
            } else {
                while (priimek.length() < 3) {
                    priimek += (int) (Math.random() * 10);
                }
                this.priimek = priimek;
            }
        }
    
        public boolean siDekle(){
            return this.spol.equals("dekle");
        }
        public boolean biSlaNaZmenek(){
            int s= (int)(Math.random()*2);
            return (s==0)?true:false;
        }
        public boolean grevaNaSok(){
            int s= (int)(Math.random()*2);
            return (s==0)?true:false;
        }
    
        public void predstaviSe(){
            System.out.println("Sem "+this.ime+" "+this.priimek+".");
        }
        
        public String getSpol() {
            return spol;
        }
        public void setSpol(String spol) {
            boolean nasel = false;
            for (int i=0; i<2; i++){
                if(spolIzbira[i]==spol){
                    this.spol = spolIzbira[i];
                    nasel = true;
                    break;
                }
            }
            if(!nasel)
                this.spol = "fant";
        }
        public String getRazred() {
            return razred;
        }
        public void setRazred(String razred) {
            switch (razred) {
                case "g1a":
                case "g1b":
                case "g2a":
                case "g2b":
                case "g3a":
                case "g3b":
                case "g4a":
                case "g4b":
                this.razred = razred;
                    break;
                default: 
                    razred="g1a";
            }
            this.razred = razred;
        }
        public int getStevilka() {
            return stevilka;
        }
        public void setStevilka(int stevilka) {
            int length = String.valueOf(stevilka).length();
            if(length!=5) 
                setStevilka();
            else 
                this.stevilka = stevilka;
        }
        public void setStevilka() {
            stevilka = (int)(Math.random()*110000-10000);
            this.stevilka = stevilka;
        }
    public static void main(String[] args){
        System.out.println("hello world");
    }
}
