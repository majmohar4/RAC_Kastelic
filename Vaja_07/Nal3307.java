public class Nal3307{
    public static void main(String[] args){
        long stevilo=0,pom,i;
        int prvo=0;
        long mnozitelj;
        stevilo=Long.valueOf(args[0]);
        while(stevilo>0){
            /* poiščemo prvo števko in določimo potenco kofaktorja 10 */
            pom=stevilo;
            mnozitelj = 1;
            while (pom != 0 ){
                prvo = (int)(pom % 10);
                mnozitelj = mnozitelj * 10;
                pom = pom / 10 ;
                System.out.print(pom+" ");
            }
            mnozitelj = mnozitelj / 10;
            System.out.print(prvo); /* izpis števke */
            /* izpis zvezdic, kot jih določa velikost števke */
            for (pom = 1 ; pom<= prvo ;pom++)
                System.out.print('*');
            System.out.println(prvo); /* izpis števke */
            stevilo = stevilo % mnozitelj; /* odrežemo št. prvo števko */
        }
    }
}