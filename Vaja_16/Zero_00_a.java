import java.util.Scanner;import java.util.*;


/**
 *   dekalracija in kreiranje objekta
 */
public class Zero_00_a{
   
    public static void main(String[] args){
        
        Integer oi; // deklaracija reference 
                oi = new Integer(121);       // ustvarjanje objekta (z rezervacijo prostora v pomnilniku)
        
        int[] oa;                            // deklaracija oz. najava
              oa = new int[10];              // kreiranje objekta
        // ---- vstavi izpis objektov      
        System.out.println(Arrays.toString(oa));
        System.out.println(oi);
        System.out.println("zaključite z ENTER");
        Scanner scan;                               //deklaracija
               scan = new Scanner("System.in");    //kreiranje objekta
               
        scan.next();       
    }
}
