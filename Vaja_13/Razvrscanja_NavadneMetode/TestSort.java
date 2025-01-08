
/**
 * class NavadnoVstavljanje here.
 * 
 * @author G3ab
 * @version feb2013
 */
import java.util.Arrays;
import sortiranja.*;

public class TestSort
{
    static int tab[]={3,1,5,7,4,9,8,6,2,0};
    //static int tab[]={0,1,2,3,4,5,6,7,8,9};
    


    public static void main(String[] s){
        System.out.println(Arrays.toString(tab));
        int[] primerjave = Sortiraj.bubbleSort(tab);
        System.out.println("Zamenjali smo "+primerjave[0]+"-krat, primerjali smo elemente "+primerjave[1]+"-krat.");
        System.out.println(Arrays.toString(tab));
    }    
}
