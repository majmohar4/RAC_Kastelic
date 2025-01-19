package sortiranja;

import java.util.*;

/**
 * Write a description of class Sortiraj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sortiraj
{
    public static int[] navadnoVstavljanje(int[] t){   
        int a=0,b=0;
      int dolzina = t.length;
        int meja    = 1;        // neurejeno na začetku, 1. urejen
        int mesto   = 0;       
        while (meja < dolzina){
         // vizualizacija koraka
        //System.out.println(Arrays.toString(t));               
        // v urejenem delu poiščemo mesto za vstavljanje (1, meja -1)
        for(mesto=0;mesto<meja && t[mesto]<t[meja];mesto++);      
        // premaknemo večje el. urejenega dela
         int temp = t[meja];  // shranimo 1. el. neurejenega dela
         for (int i=meja;i>mesto;i--){
             int tt = t[i];
             t[i]   = t[i-1];
             t[i-1] = tt;
             b++;
            }
        // vstavimo element
        t[mesto] = temp;
        meja++;
        a++;
       }
        return new int[]{a, b};

    }
    
    public static int[] navadnoIzbiranje(int[] t){       
        int a =0;
        int dolzina = t.length;
        int meja    = 0;        // neurejeno na začetku
        int minEl   = 0;
        
      while(meja<dolzina-1)  {          
        //vizualizacija koraka  
        //System.out.println(Arrays.toString(t));            
        // iskanje minEl v intevalu od meja  do dolzina-1
        minEl = meja; //naj bo prvi minimalen
        for (int i=meja+1;i<dolzina;i++){
            if (t[i] < t[minEl]){
               minEl = i;
            }
            a++;
        }
        // zamenjava elementov (minEl, meja)
        int temp = t[minEl];
        t[minEl] = t[meja];
        t[meja] = temp;        
        //prestavimo mejo urejenosti
        meja++;
      }
      return new int[]{a, a};
    }
    
    
    public static int[] kmetSort(int[] t){
        int a =0;
        int N = t.length;
        
        for (int j=0;j<N-1;j++)
          for (int i=0;i<N-1;i++){
            if (t[i+1] < t[i] ){
                int tt=t[i];
                t[i] = t[i+1];
                t[i+1] = tt;
            }
            a++;
        }
        return new int[]{a, a};
    }
    
    public static int[] bubble_1(int[] t){
        int a =0,b=0;
        int N = t.length;
        
        for (int j=0;j<N-1;j++)  {             // gor (j++)
            
            //vizualizacija faze
            //System.out.println( Arrays.toString(t) );
            
          for (int i=N-1;i>0;i--){         // dol (i--)
            if (t[i] < t[i-1] ){
                int tt=t[i];
                t[i] = t[i-1];
                t[i-1] = tt;
                b++;
            }
            a++;
        }
        }
        return new int[]{a, b};
    }
    
    public static int[] bubble_2(int[] t){
        int a =0,b=0;
        int N = t.length;
        
        for (int j=0;j<N-1;j++)  {             // gor (j++)
            
            //vizualizacija faze
            //System.out.println( Arrays.toString(t) );
            
          for (int i=N-1;i>j;i--){              // dol (i--)
            if (t[i] < t[i-1] ){
                int tt=t[i];
                t[i] = t[i-1];
                t[i-1] = tt;
                b++;
            }
            a++;
        }
        }
        return new int[]{a,b};
    }
    
    public static int[] bubbleSort(int[] t){
        int a =0,b=0;
        int N = t.length;
        boolean zamenjava = true;
        
        for (int j=0 ; j<N-1 && zamenjava; j++)  {    // gor (j++)
            
            //vizualizacija faze
            //System.out.println( Arrays.toString(t) );
            
          zamenjava = false;  
          for (int i=N-1;i>j;i--){              // dol (i--)
            if (t[i] < t[i-1] ){
                int tt=t[i];
                t[i] = t[i-1];
                t[i-1] = tt;
                zamenjava = true;
                b++;
            }
            a++;
        }
        }
        return new int[]{a,b};
    }
}
