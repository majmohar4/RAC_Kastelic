import java.util.Random;

public class Naloga11{
        public static void main(String[] args) {
            int stevilo = (int) (Math.random() * 256);
            
            System.out.println("Naključno generirano 8-bitno število: " + Integer.toBinaryString(stevilo));
            
            boolean a = (stevilo>0);
            System.out.println("Število je pozitivno: "+ a);
        }
    }
    