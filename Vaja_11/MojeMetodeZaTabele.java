import java.util.*;
public class MojeMetodeZaTabele{
    public static void main(String[] args){
        int[] ti = {12,3,5,9,-2,4,3,6,9,2,-2,-14,2};
        char[] ti2 = {'a', 'b','c','g','f','a','a'};
        System.out.println(Arrays.toString(vrniLiheElemente(ti)));
        System.out.println(Arrays.toString(vrniSodeElemente(ti)));
        System.out.println(Arrays.toString(prestejCrke(ti2)));
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
        System.out.println("Primerjanih je bilo: "+b);
        return a;
    }
    public static boolean aliJeVTabeliTestRand(char[] tab, char iskano){
        boolean a = false;
        int b=0;
        for (int i = 0; i<1000;i++){
            int rand = (int)(Math.random()*tab.length-1);
            if (tab[rand] == iskano){
                a=true;
                break;
            }
            b++;
        }
        System.out.println("Primerjanih je bilo: "+b);
        return a;
    }
    public static boolean aliJeVTabeliTestRand(int[] tab, int iskano){
        boolean a = false;
        int b=0;
        for (int i = 0; i<1000;i++){
            int rand = (int)(Math.random()*tab.length-1);
            if (tab[rand] == iskano){
                a=true;
                break;
            }
            b++;
        }
        System.out.println("Primerjanih je bilo: "+b);
        return a;
    }
    public static int kjeVTabeliJe(char[] tab, char iskano){
        int b=0,c=-1;
        for (int i = 0; i<tab.length-1;i++){
            if (tab[i] == iskano){
                c=i;
                break;
            }
            b++;
        }
        return tab[0];
    }
    public static int kjeVTabeliJe(int[] tab, int iskano){
        int b=0,c=-1;
        for (int i = 0; i<1000;i++){
            int rand = (int)(Math.random()*tab.length-1);
            if (tab[rand] == iskano){
                c=i;
                break;
            }
            b++;
        }
        System.out.println("Primerjanih je bilo: "+b);
        return c;
    }
    public static int[] skrajsajTabeloNa(int[] tab, int dolzina){
        int[] n_tab = new int[dolzina];
        for (int i =0; i<dolzina-1; i++){
            n_tab[i]=tab[i];
        }
        return n_tab;
    }
    public static char[] skrajsajTabeloNa(char[] tab, char dolzina){
        char[] n_tab = new char[dolzina];
        for (int i =0; i<dolzina-1; i++){
            n_tab[i]=tab[i];
        }
        return n_tab;
    }
    public static char[] zanemariPrviZadnji(char[] tab){
        int x=0;
        char[] n_tab = new char[tab.length-2];
        for (int i =1; i<n_tab.length; i++){
            n_tab[x]=tab[i];
            x++;
        }
        return n_tab;
    }
    public static int[] zanemariPrviZadnji(int[] tab){
        int[] n_tab = new int[tab.length-2];
        int x=0;
        for (int i =1; i<n_tab.length; i++){
            n_tab[x]=tab[i];
            x++;
        }
        return n_tab;
    }
    public static int[] tableLeftTrim(int[] tab, int dolzina){
        int[] n_tab = new int[dolzina];
        int x= tab.length-dolzina;
        for (int i =0; i<n_tab.length; i++){
            n_tab[i] = tab[x];
            x++;
        }
        return n_tab;
    }
    public static char[] tableLeftTrim(char[] tab, int dolzina){
        char[] n_tab = new char[dolzina];
        int x= tab.length-dolzina;
        for (int i =0; i<n_tab.length; i++){
            n_tab[i] = tab[x];
            x++;
        }
        return n_tab;
    }
    public static int[] tableRightTrim(int[] tab, int dolzina){
        int[] n_tab = new int[dolzina];
        for (int i= 0; i<dolzina; i++) n_tab[i] = tab[i];
        return n_tab;
    }
    public static char[] tableRightTrim(char[] tab, int dolzina){
        char[] n_tab = new char[dolzina];
        for (int i= 0; i<dolzina; i++) n_tab[i] = tab[i];
        return n_tab;
    }
    public static int[] tableMidTrim(int[] tab, int dolzina, int k){
        int[] n_tab=new int[dolzina];
        int a=k;
        for (int i=0; i<dolzina; i++){
            n_tab[i] = tab[k];
            k++;
        }
        return n_tab;
    }
    public static char[] tableMidTrim(char[] tab, int dolzina, int k){
        char[] n_tab=new char[dolzina];
        int a=k;
        for (int i=0; i<dolzina; i++){
            n_tab[i] = tab[k];
            k++;
        }
        return n_tab;
    }
    public static int[] vrniLiheElemente(int[] tab){
        int dolzina=0, a=0;
        for (int i=0;i<tab.length; i++){
            if (i%2==1 || tab[i]%2==1) dolzina++;
        }
        int[] n_tab = new int[dolzina];
        int x=0;
        for (int i=0;i<tab.length; i++){
            if (i%2==1 || tab[i]%2==1){
                n_tab[x] = tab[i];
                x++;
            }
        }
        return n_tab;
    }
    public static int[] vrniSodeElemente(int[] tab){
        int dolzina=0, a=0;
        for (int i=0;i<tab.length; i++){
            if (i%2==0 || tab[i]%2==0) dolzina++;
        }
        int[] n_tab = new int[dolzina];
        int x=0;
        for (int i=0;i<tab.length; i++){
            if (i%2==0 || tab[i]%2==0){
                n_tab[x] = tab[i];
                x++;
            }
        }
        return n_tab;
    }
    public static char[] vrniLiheElemente(char[] tab){
        int dolzina = (int)tab.length/2;
        if (tab.length%2 == 1) dolzina++;
        char[] n_tab = new char[dolzina];
        int j=0;
        for (int i =0; i<tab.length; i+=2){
            n_tab[j] = tab[i];
            j++;
        }
        return n_tab;
    }
    public static char[] vrniBrezSamoglasnikov(char[] tab) {
        char[] samoglasniki = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int a = tab.length;
        
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < samoglasniki.length; j++) {
                if (tab[i] == samoglasniki[j]) {
                    a--;
                    break;
                }
            }
        }
        
        char[] n_tab = new char[a];
        int k = 0;
        
        for (int i = 0; i < tab.length; i++) {
            boolean jeSamoglasnik = false;
            for (int j = 0; j < samoglasniki.length; j++) {
                if (tab[i] == samoglasniki[j]) {
                    jeSamoglasnik = true;
                    break;
                }
            }
            if (!jeSamoglasnik) {
                n_tab[k] = tab[i];
                k++;
            }
        }
        return n_tab;
    }
    public static int[] prestejCrke(char[] tab){
        char[] crke = {
            'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 
            'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 
            'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 
            'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 
            'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 
            'z', 'Z'
        };
        int[] n_tab = new int[crke.length];
        for (int i=0; i<tab.length; i++){
            for (int j=0; j<crke.length; j+=2){
                if(tab[i] == crke[j]){
                    n_tab[i]+=1;
                    break;
                }
                else if (tab[i] == crke[j+1]){
                    n_tab[i+1]+=1;
                    break;
                }
            }
        }
        return n_tab;
    }
}