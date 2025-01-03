import java.util.Arrays;

public class Naloga8 {
    public static void main(String[] args) {
        int[] tabela = generirajUrejenoTab(15);
        int stevilo = (int)(Math.random()*90);
        System.out.println("Iscemo stevilo "+stevilo);
        poisciBinarno(tabela, 23);
    }
    public static void izpisiTab(int[] tab){
        System.out.println(Arrays.toString(tab).replace("[", "").replace(",","").replace("]",""));
    }

    public static int[] generirajUrejenoTab(int dolzina) {
        int[] tabela = new int[dolzina];
        tabela[0] = (int) (Math.random() * 10);
        for (int i = 1; i < dolzina; i++) {
            tabela[i] = tabela[i - 1] + (int) (Math.random() * 10) + 1;
        }
        return tabela;
    }
    public static void izpisiPredPrvoVrsticoTabele(int spod, int zgor, int dolzina) {
        for (int i = 0; i < dolzina; i++) {
            if (i == spod && spod == zgor) {
                System.out.print(" v ");
            } else if (i == spod) {
                System.out.print(" < ");
            } else if (i == zgor) {
                System.out.print(" > ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    public static void poisciBinarno(int[] tabela, int iskano) {
        int zac = 0, kon = tabela.length - 1, sred, p = 0;
        while (zac <= kon) {
            izpisiPredPrvoVrsticoTabele(zac, kon, tabela.length);
            izpisiTab(tabela);

            sred = (zac +kon)/2;
            p++;
            System.out.println("Sredinski element (" + sred + "): " + tabela[sred]);
            if (tabela[sred] == iskano) {
                System.out.println("Najdeno na indeksu "+sred);
                System.out.println("Primerjave: "+p);
                return;
            } else if (tabela[sred] < iskano) {
                zac = sred + 1;
                System.out.println("Iskanje v zgornji polovici.");
            } else {
                kon = sred - 1;
                System.out.println("Iskanje v spodnji polovici.");
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Število ni v tabeli.");
        System.out.println("Število primerjav: " + p);
    }
}
