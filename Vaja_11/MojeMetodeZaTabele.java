import java.util.*;
public class MojeMetodeZaTabele{
    public static void main(String[] args){
        int[] ti = {12,3,5,9,-2,4,3,6,9,2,-2,-14};
        System.out.println(vrniVsoto(ti, 4, 3));
        System.out.println(Arrays.toString(getIntTab(15)));
    }
    public static int vrniPrvega(int[] tab){
        return tab[0];
    }
    public static int vrniZadnjega(int[] tab){
        return tab[tab.length-1];
    }
    public static char vrniPrvega(char[] tab){
        return tab[0];
    }
    public static char vrniZadnjega(char[] tab){
        return tab[tab.length-1];
    }
    public static int vrniVsoto(int[] tab){
        int vsota =0;
        for (int i =0; i<tab.length-1; i++)vsota+=tab[i];
        return vsota;
    }
    public static int vrniVsoto(int[] tab, int stevilo){
        int vsota =0;
        if (stevilo>0){
            stevilo=(stevilo>tab.length-1)?tab.length-1:stevilo;
            for (int i = 0; i<stevilo; i++) vsota+=tab[i];
        }
        else if(stevilo<0){
            stevilo=(stevilo<-tab.length+1)?-tab.length+1:stevilo;
            for (int i = tab.length-1; i>stevilo;i--)vsota+=tab[i];
        }
        return vsota;
    }
    public static int vrniVsoto(int[] tab, int stevilo, int zacetek){
        int vsota =0;
        try{
            if (zacetek>tab.length);
            else{
                if (stevilo>0){
                    stevilo=(stevilo>tab.length-1)?tab.length-1:stevilo;
                    for (int i = zacetek; i<stevilo; i++) vsota+=tab[i];
            }
                else if(stevilo<0){
                    stevilo=(stevilo<-tab.length+1)?-tab.length+1:stevilo;
                    for (int i = zacetek; i>stevilo;i--)vsota+=tab[i];
            }
            }
        }catch(ArrayIndexOutOfBoundsException exception){}
        return vsota;
    }
    public static int[] getIntTab(int dolzina){
        int[] tab = new int[dolzina];
        for (int i =0; i<dolzina; i++)tab[i]=(int)(Math.random()*Integer.MAX_VALUE);
        return tab;
    }
    public static char[] getCharTab(int dolzina){
        char[] tab = new char[dolzina];
        char[] abeceda = {'a','b','c','č','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','š','t','u','v','z','ž','A','B','C','Č','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','Š','T','U','V','Z','Ž'};
        for (int i=0;i<dolzina;i++) tab[i]=abeceda[(int)(Math.random()*abeceda.length-1)];
        return tab;
    }
    public static boolean aliJeVTabeli(int[] tab, int iskano){
        boolean a = false;
        for (int i = 0; i<tab.length-1;i++)
            if (tab[i] == iskano){
                a=true;
                break;
            }
        return a;
    }
    public static boolean aliJeVTabeli(char[] tab, char iskano){
        boolean a = false;
        for (int i = 0; i<tab.length-1;i++)
            if (tab[i] == iskano){
                a=true;
                break;
            }
        return a;
    }
    public static boolean aliJeVTabeliTest(int[] tab, int iskano){
        boolean a = false;
        int b =0;
        for (int i = 0; i<tab.length-1;i++){
            if (tab[i] == iskano){
                a=true;
                break;
            }
            b++;
        }
        return a;
    }
    public static boolean aliJeVTabeliTest(char[] tab, char iskano){
        boolean a = false;
        int b=0;
        for (int i = 0; i<tab.length-1;i++){
            if (tab[i] == iskano){
                a=true;
                break;
            }
            b++;
        }
        return a;
    }
}