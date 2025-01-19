
/**
 * class NavadnoVstavljanje here.
 * 
 * @author Maj
 * @version feb2025
 */
import java.util.Arrays;
import sortiranja.*;

public class TestSort
{
    //static int tab[]={3,1,5,7,4,9,8,6,2,0};
    //static int[] tab = {100, 97, 94, 91, 88, 85, 82, 79, 76, 73, 70, 67, 64, 61, 58, 55, 52, 49, 46, 43, 40, 37, 34, 31, 28, 25, 22, 19, 16, 13};
    static int[] tab = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59};

    
    public static void main(String[] s){
        //generiraj tabelo z n številom znakov
        int n= 30;
        //int[] tab = generirajTabelo(n);
        
        int[] tab1 =new int[n];
        int[] tab2 =new int[n];
        int[] tab3 =new int[n];
        int[] tab4 =new int[n];
        int[] tab5 =new int[n];
        System.arraycopy(tab, 0, tab1, 0, n);
        System.arraycopy(tab, 0, tab2, 0, n);
        System.arraycopy(tab, 0, tab3, 0, n);
        System.arraycopy(tab, 0, tab4, 0, n);
        System.arraycopy(tab, 0, tab5, 0, n);
        System.out.println("Navadno vstavljanje");
        //System.out.println(Arrays.toString(tab));
        int[] primerjave = Sortiraj.navadnoVstavljanje(tab);
        System.out.println("Zamenjali smo "+primerjave[0]+"-krat, primerjali smo elemente "+primerjave[1]+"-krat.");
        //System.out.println(Arrays.toString(tab));
        
        System.out.println("Navadno izbiranje");
        //System.out.println(Arrays.toString(tab1));
        primerjave = Sortiraj.navadnoIzbiranje(tab1);
        System.out.println("Zamenjali smo "+primerjave[0]+"-krat, primerjali smo elemente "+primerjave[1]+"-krat.");
        //System.out.println(Arrays.toString(tab1));
        
        System.out.println("Bubble sort brez optimizacije");
        //System.out.println(Arrays.toString(tab2));
        primerjave = Sortiraj.bubble_1(tab2);
        System.out.println("Zamenjali smo "+primerjave[0]+"-krat, primerjali smo elemente "+primerjave[1]+"-krat.");
        //System.out.println(Arrays.toString(tab2));
        
        System.out.println("Bubble sort, ki upošteva že urejeni del");
        //System.out.println(Arrays.toString(tab3));
        primerjave = Sortiraj.bubble_2(tab3);
        System.out.println("Zamenjali smo "+primerjave[0]+"-krat, primerjali smo elemente "+primerjave[1]+"-krat.");
        //System.out.println(Arrays.toString(tab3));
        
        System.out.println("Bubble sort");
        //System.out.println(Arrays.toString(tab4));
        primerjave = Sortiraj.bubbleSort(tab4);
        System.out.println("Zamenjali smo "+primerjave[0]+"-krat, primerjali smo elemente "+primerjave[1]+"-krat.");
        //System.out.println(Arrays.toString(tab4));
        System.out.println(Arrays.toString(tab5));
    }  
    public static int[] generirajTabelo(int velikost){
        int[] tab = new int[velikost];
        for (int i=0; i<velikost; i++)
            tab[i] = (int)(Math.random()*Integer.MAX_VALUE);
        return tab;
    }
}
