import java.util.Scanner;
import java.util.Arrays;

/**
 *   več objektov istega tipa
 *     na osnovi razreda je moč ustvariti poljubno števil objektov tega tipa
 */
public class Zero_00_b{
   
    public static void main(String[] args){
        
        Integer oi1; // deklaracija(najava) reference 
                oi1 = new Integer(121);       // ustvarjanje objekta (z rezervacijo prostora v pomnilniku)
        Integer oi2; // deklaracija reference 
                oi2 = new Integer(321);
                
        Integer[] toi;                  // deklaracija oz. najava
              toi = new Integer[10];    // kreiranje objekta /tabele)
              
        for (int i=0;i<toi.length;i++) 
           toi[i] = new Integer(i);
           
        System.out.println(Arrays.toString(toi));
              
        System.out.println("zaključite z ENTER");
        Scanner scan;                              //deklaracija
               scan = new Scanner("System.in");    //kreiranje objekta
               
        scan.next();       
    }
}
