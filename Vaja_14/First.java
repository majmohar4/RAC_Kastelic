/**
 *   razred First
 *     ovojni razred za demonstracijo delovanja Sklada
 *     Sklad je reliziran kot notanji razred razreda First,
 *     dejansko je njegov član, kot sta lahko poljubna razredna
 *     lastnost ali razredna metoda
 * 
 *     naj razredna lastnost 'stevilo' vsebuje število elementov v
 *     skladu
 * 
 *     naj razredna metoda 'main/1' služi demonstraciji delovanja sklada
 */
public class First {

    // stevilo NI del Sklad-a !
    static int stevilo = 0;

    /**
     *  razred Sklad 
     *    je razredna komponenta razreda First
     *    kot taka dosegljiva iz vse vsebine razreda First
     *    - private/public znotraj razreda ne igrajo vloge ....
     * 
     * Opis strukture in delovanja:
     *  sklad je struktura, ki:
     *   - ima definirana 2 kazalca : dno in vrh
     *   - ima dfinirani metodi dajNaSklad(push) in vzemiIzSklada(pop)
     *      - metodi sta izvedba algoritma LIFO (tist' k' zad'n pride, gre prv' v'n)
     * 
     * če kazalca dno in vrh kažeta na isto lokacijo, je skad prazen, vrh kaže
     * na lokacijo, kamor vstavimo nov element v postopku vstavljanja
     * dajNaSklad : na pozicijo kazalca vrh damo nov element, kazalec vrh ustrezno 
     * ažuriramo, da kaže na prvo naslednjo 'prazno' lokacijo
     * vzemiIzSklada : ažuriramo kazalec vrh, da kaže na zadnjo zasedeno lokacijo
     * in vrnemo vrednost s te lokacije
     * 
     * realizacija spodaj vsebuje 3 utility/covenience metode, za
     * simpatičnejše delo (empty,full-diagnostični ter show-ugodna) :
     *              
     * 
     */
    static class Sklad {
        private static Integer[] kontejner = new Integer[30];
        private static int vrh = 0;
        private static int dno = 0; 

        static boolean empty(){ return vrh==dno;}
        static boolean full(){ return vrh==kontejner.length;}

        /**
         *  izriše celoten sklad vrtikalno
         */
        static void show(){
            int lvrh=vrh;
            System.out.println(); 
            System.out.print("vrh--> "); if (vrh!=dno) System.out.println();
            while(--lvrh > dno){
                System.out.println();
                System.out.print("              ");    // 14 presledkov, neinteligentno
                System.out.println( kontejner[lvrh] );
            }
            
            if ( vrh != dno ){
              System.out.print("       dno--> ");
              System.out.println( kontejner[lvrh] );
            }
             else{
              System.out.println("dno--> "); 
             }
             System.out.println("------ ------ ------");
             System.out.println();
        }

        /**
         *  izriše vsebino celotnega sklada brez kazalcev
         */
        static void showSimple(){
            int lvrh=vrh;
            System.out.println();

            while(--lvrh >= dno){
                System.out.println( kontejner[lvrh] );
            }
            
        }

        /**
         *  prijazno ne naredi ničesar, če je sklad pred dodajanjem že poln
         * @param vrednost, ki jo dajemo na vrh sklada
         */
        static void push(int vrednost){
            if ( full() )  return;
            
             kontejner[vrh] = vrednost;
             vrh++;        
             
             stevilo++;
        }

        /**
         *  vrne vrednost  vrha slada
         *  če ni kaj vrniti, sklad prazen, vrne -1, ker pač nekaj mora vrniti
         * @return vrhnja vrednost s sklada
         */
        static Integer pop(){
            if ( Sklad.empty() ) return -1;
            vrh--;
            return kontejner[vrh];
        }
        
        static Integer peek(){
            if ( Sklad.empty() ) return -1;
            return kontejner[vrh-1];
        }
    }

    static class LinearnaVrsta {
        private static Integer[] kontejner = new Integer[30];
        private static int tail = 0;
        private static int head = 0; 
        static void add(int element){
            if(tail<kontejner.length){
                kontejner[tail] = element;
                tail++;
            }
        }
        
        static int remove(){
            if(tail!=head){
                int retEl = kontejner[head];
                head++;
                return retEl;
            }
            return -1;
        }
      static boolean prazna(){return(tail==head);}
      static int peek(){
          if(tail!=head){
              int retEl = kontejner[head];
              return retEl;
          }
          return -1;
      }
      static void kajJeVVrsti(){
        int localHead = head;
        while (tail != localHead){
          System.out.print(kontejner[localHead]+" ");
          localHead++;
        }
        System.out.println();
      }
    }
    static class KroznaVrsta {
      private static Integer[] kontejner = new Integer[30];
      private static int tail = 0;
      private static int head = 0;
      
      static int naslednji(int current) {
        return (current + 1) % kontejner.length;
      }
      
      static void add(int element) {
        if (naslednji(tail) != head) { // Preverimo, ali je prostor za nov element
          kontejner[tail] = element;
          tail = naslednji(tail); // Posodobimo kazalec
        } else {
          System.out.println("Vrsta je polna!");
        }
      }
      
      static boolean prazna() {
        return tail == head;
      }
      
      static int remove() {
        if (tail != head) { // Preverimo, ali je vrsta prazna
          int retEl = kontejner[head]; // Shranimo trenutni element
          kontejner[head] = null; // Počistimo mesto
          head = naslednji(head); // Posodobimo kazalec
          return retEl;
        }
        return -1; // Vrsta je prazna
      }
      
      static int peek() {
        if (tail != head) {
          return kontejner[head];
        }
        return -1; // Vrsta je prazna
      }
      
      static void kajJeVVrsti() {
        int localHead = head;
        while (localHead != tail) {
          System.out.print(kontejner[localHead] + " ");
          localHead = naslednji(localHead);
        }
        System.out.println();
      }
    }
  
    
    /** */
    public static void main(String[] args){
        mainSklad();
    }
    public static void mainKroznaVrsta() {
      System.out.println("Testiranje Krožne Vrste");
      
      // Dodajanje elementov
      KroznaVrsta.add(32);
      KroznaVrsta.add(15);
      KroznaVrsta.add(15);
      KroznaVrsta.add(15);
      KroznaVrsta.add(15);
      KroznaVrsta.kajJeVVrsti(); // Prikaz trenutnih elementov
      
      // Odstranjevanje elementa
      if (!KroznaVrsta.prazna()) {
        System.out.println("  ---> remove-ing: " + KroznaVrsta.remove());
      }
      KroznaVrsta.kajJeVVrsti(); // Prikaz trenutnih elementov po odstranitvi
      
      // Dodajanje več elementov, da testiramo krožno naravo
      KroznaVrsta.add(42);
      KroznaVrsta.add(84);
      KroznaVrsta.kajJeVVrsti(); // Prikaz trenutnih elementov
      
      // Odstranjevanje
      while (!KroznaVrsta.prazna()) {
        System.out.println("  ---> remove-ing: " + KroznaVrsta.remove());
      }
      KroznaVrsta.kajJeVVrsti(); // Prikaz, ko je vrsta prazna
    }
  
    public static void mainLinearnaVrsta() {
      System.out.println("Testiranje Linearne Vrste");
      
      // Dodajanje elementov
      LinearnaVrsta.add(32);
      LinearnaVrsta.add(13);
      LinearnaVrsta.kajJeVVrsti(); // Prikaz trenutnih elementov
      
      // Odstranjevanje elementa
      if (!LinearnaVrsta.prazna()) {
        System.out.println("  ---> remove-ing: " + LinearnaVrsta.remove());
      }
      LinearnaVrsta.kajJeVVrsti(); // Prikaz trenutnih elementov po odstranitvi
      
      // Odstranjevanje še enega elementa
      if (!LinearnaVrsta.prazna()) {
        System.out.println("  ---> remove-ing: " + LinearnaVrsta.remove());
      }
      LinearnaVrsta.kajJeVVrsti(); // Prikaz, ko je vrsta prazna
    }
  
    public static void mainSklad(){
      System.out.println(Sklad.dno);
      Sklad.push(32);
      Sklad.push(61);
      Sklad.show();
      
      System.out.println("size: "+stevilo);
      
      if ( !Sklad.empty() ){
          System.out.println( "  ---> pop-ing :" + Sklad.pop() );
          stevilo--;
      }
      
      Sklad.show();
      
      if ( !Sklad.empty() ){
          System.out.println( "  ---> pop-ing :" + Sklad.pop() );
          stevilo--;
      }
      
      Sklad.show();
      
      System.out.println("size: "+stevilo);
    }
}