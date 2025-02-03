import java.util.Arrays;

/**
 *   Glavna metoda (driver method) razreda v štirih ločenih zaporedih fazah (1)usvari 150 objektov 
 *   vrste (tipa) ZeroTocka. Vsakega naj inicializira s pseudo-naključno vrednostjo ravninske 
 *   koordinate iz obsega [0-200.0,0-200.0]. Nato naj izmed ustvarjenih poišče(2) tisto točko, ki
 *   je najbolj oddaljena od točke(0,0), izpiše(3) koordinate te točke ter njeno oddaljenost od 
 *   točke (0,0). Nato najde točko vrste ZeroTocka, ki je najbližje povprečni oddaljenosti vseh takih
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
        }
        // (2)
        poisciTocko();
        // (3)
        
        // (4)
    }
    static poisciTocko(){
        
    }
}
