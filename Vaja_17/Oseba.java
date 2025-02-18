
/**
 * Write a description of class Ime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oseba
{
        String ime;
        String priimek;
        String spol;
        String razred;
        int stevilka;
        
        String[] spolIzbira = {"fant", "dekle"};
        
        Oseba(){
            ime = "Sizif";
            priimek = "Novak";
            spol = "fant";
            razred = "g3a";
            stevilka = getStevilka();
        }
        Oseba(String ime_d, String priimel_d, String spol_d, String razdred_d){
            setIme(ime_d);
            setPriimek(priimel_d);
            setSpol(spol_d);
            setRazred(razdred_d);
            setStevilka();
        }
        Oseba(String ime_d, String priimel_d, String spol_d, String razdred_d, int stevilka_d){
            setIme(ime_d);
            setPriimek(priimel_d);
            setSpol(spol_d);
            setRazred(razdred_d);
            setStevilka(stevilka_d);
        }
        
        public String getIme() {
            return ime;
        }
        public void setIme(String ime) {
            System.out.println("Dolzina: " + ime.length());
            
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
        public String getSpol() {
            return spol;
        }
        public void setSpol(String spol) {
            boolean nasel = false;
            for (int i=0; i<2; i++){
                if(spolIzbira[i]==spol){
                    spol = spolIzbira[i];
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
            
            this.razred = razred;
        }
        public int getStevilka() {
            return stevilka;
        }
        public void setStevilka(int stevilka) {
            this.stevilka = stevilka;
        }
        public void setStevilka() {
            stevilka = (int)(Math.random()*110000-10000);
            this.stevilka = stevilka;
        }
}
