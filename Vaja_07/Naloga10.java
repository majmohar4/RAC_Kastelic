import java.lang.*;
/**
* Opis: 
* 
* @author Maj
* @version 18. 11. 2024
*/
public class Naloga10 {
    /**
    * Glavna metoda aplikacije - spisite komentar po svoji meri
    * 
    * @param  arg[0]  - primer parametra glavne funkcije 
    */
    public static void main(String args[]){
    int crke=0;
     for(int i=0; i<25;i++){
        if(crke>14)break;
         int n=(int)(Math.random() * 100); //zato, da dobimo neko število
         for(int j=0; j<80;j++){ //da je šansa 80%
             if(n==j){
                 char randomChar = (char) ('a' + Math.random() * 26);
                 System.out.print(randomChar );
                crke++;
             }
             else{
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
        
    }
    
}