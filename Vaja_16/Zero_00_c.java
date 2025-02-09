import java.util.Arrays;
import java.util.*;

/**
 *   Glavna metoda (driver method) razreda v štirih ločenih zaporedih fazah (1)usvari 150 objektov 
 *   vrste (tipa) ZeroTocka. Vsakega naj inicializira s pseudo-naključno vrednostjo ravninske 
 *   koordinate iz obsega [0-200.0,0-200.0]. Nato naj izmed ustvarjenih poišče(2) tisto točko, ki
 *   je najbolj oddaljena od točke(0,0), izpiše(3) koordinate te točke ter njeno oddaljenost od 
 *   točke (0,0). 
 *  Nato najde točko vrste ZeroTocka, ki je najbližje povprečni oddaljenosti vseh takih
 *   točk od točke (0,0), izpiše oddaljenost povpečja, oddaljenost najdene točke in njeno koordinato.
 *   
 *   No ja, ustvarjalcu opisane zamisli se je nekje vmes ustavilo. Pomagajte mu zamisel iz/s/peljati
 *   do konca.
 *
 *   pri realizaciji bodite 'prijazno' in se držite pravila : ena datoteka, en razred.
 */
public class Zero_00_c{
   static ZeroTocka[] tab = new ZeroTocka[150];
    public static void main(String[] args){
        // (1)
        for (int i=0; i<150; i++){
            tab[i] = new ZeroTocka();
            tab[i].x=Math.random()*200.00001; 
            tab[i].y=Math.random()*200.00001;
            System.out.println(tab[i]);
        }
        // (2)
        int tocka = poisciTocko();
        // (3)
        izpisiTocko(tocka);
        // (4)
        izpisiNajblizjoPovprecju();
    }
    static int poisciTocko(){
        double razdalja =0, temp;
        int tocka=-1;
        for (int i=0; i<150; i++){
            temp = Math.sqrt(tab[i].x*tab[i].x+tab[i].y*tab[i].y);
            if(temp>razdalja) {
                tocka =i;
                razdalja = temp;
            }
        }
        System.out.println("Najbolj oddaljena je točka z indexom: "+tocka);
        return tocka;
    }
    static void izpisiTocko(int tocka){
        System.out.println("T("+tab[tocka].x+", "+tab[tocka].y+")");
        System.out.println("Razdalja od (0,0): "+ Math.sqrt(tab[tocka].x*tab[tocka].x+tab[tocka].y*tab[tocka].y));
    }
    static void izpisiNajblizjoPovprecju(){
        double razdalja =0, temp=0, najboljsa=100000;
        int tocka = -1;
        for (int i=0; i<150; i++)
            razdalja += Math.sqrt(tab[i].x*tab[i].x+tab[i].y*tab[i].y);
        double povprecje = razdalja/tab.length;
        for (int i=0; i<150; i++){
            temp = Math.abs(povprecje - Math.sqrt(tab[i].x*tab[i].x+tab[i].y*tab[i].y));
            if (temp<najboljsa){
                najboljsa = temp;
                tocka = i;
            }
        }
        System.out.println("Povprecje razdalje od (0,0) je: "+ povprecje);
        System.out.println("Najblizja tocka povprecju je: "+tocka+", s razdaljo: "+temp+", in koordinatami ("+tab[tocka].x+","+tab[tocka].y+").");
    }
}
