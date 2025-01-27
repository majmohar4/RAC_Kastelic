import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import org.junit.jupiter.api.Test;

public class LanternaDemo_2 {
    // stevilo NI del Sklad-a !
    static int stevilo = 0;
    static int stevec = 0;

    static class Sklad {
        public static Integer[] kontejner = new Integer[30];
        public static int vrh = 0;
        public static int dno = 0; 

        static boolean empty(){ return vrh==dno;}

        static boolean full(){ return vrh==kontejner.length;}

        /**
         *  izriše celoten sklad vrtikalno
         */
        public static void show(Screen screen) throws Exception {             
            try {
                var text = screen.newTextGraphics();
                text.setForegroundColor(TextColor.ANSI.RED);
                text.setBackgroundColor(TextColor.ANSI.YELLOW_BRIGHT);

                int lvrh=vrh;
                stevec++; 
                text.putString(11, stevec,"vrh--> ");

                screen.refresh();
                Thread.sleep(1500);
                
                if (vrh!=dno) stevec++;
                while(--lvrh > dno){
                    stevec++;
                    //text.putString(11, stevec,"              ");    // 14 presledkov, neinteligentno
                    text.putString(26, stevec, ""+kontejner[lvrh] );
                    screen.refresh();
                    Thread.sleep(1500);
                
                    stevec++;
                }

                if ( vrh != dno ){
                    text.putString(11, stevec,"       dno--> ");
                    screen.refresh();
                    Thread.sleep(1500);
                    text.putString(26, stevec, ""+kontejner[lvrh] );
                    stevec++;
                }
                else{
                    text.putString(18, stevec,"dno--> "); 
                    screen.refresh();
                    Thread.sleep(1500);
                    stevec++;
                }
                text.putString(11, stevec,"------ ------ ------");
                screen.refresh();
                Thread.sleep(1500);
                stevec++;
                stevec++;
            }    
            catch(Exception e){}
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
        static void push(Integer vrednost){
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

        public static Integer peek(){
            if ( Sklad.empty() ) return -1;
            int a = vrh;
            a--;
            return kontejner[a];
        }
    }

    /** rdeč klicaj na rumenem ozadju*/
    public static void testChar() throws Exception {
        try (Screen screen = new DefaultTerminalFactory().createScreen()) {
            screen.startScreen();
            screen.setCharacter(5, 5,
                new TextCharacter('!',
                    TextColor.ANSI.RED, TextColor.ANSI.YELLOW_BRIGHT,
                    SGR.UNDERLINE, SGR.BOLD));
            screen.refresh();
            Thread.sleep(5000);
        }
    }

    public static void main(String[] args) throws Exception {
        testChar(); 
        try (Screen screen = new DefaultTerminalFactory().createScreen()) {
            screen.startScreen();
            var text = screen.newTextGraphics();
            text.setForegroundColor(TextColor.ANSI.RED);
            text.setBackgroundColor(TextColor.ANSI.YELLOW_BRIGHT);

            //System.out.println(Sklad.dno);
            Sklad.push(32);
            Sklad.push(61);
            Sklad.show(screen);

            text.putString(11, stevec, "size: "+stevilo);
            stevec++;
            screen.refresh();
            Thread.sleep(1500);

            if ( !Sklad.empty() ){
                text.putString(11, stevec, "  ---> pop-ing :" + Sklad.pop() );
                stevec++;
                stevilo--;
                screen.refresh();
                Thread.sleep(1500);
            }

            Sklad.show(screen);

            if ( !Sklad.empty() ){
                text.putString(11, stevec, "  ---> pop-ing :" + Sklad.pop() );
                stevec++;
                stevilo--;
                screen.refresh();
                Thread.sleep(1500);
            }

            Sklad.show(screen);

            text.putString(11, stevec,"size: "+stevilo);
            stevec++;
            screen.refresh();
            Thread.sleep(1500);

            Thread.sleep(5000);
        }
    }

}