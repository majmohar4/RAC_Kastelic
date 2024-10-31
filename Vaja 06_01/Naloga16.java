import java.lang.*;

/**
 * Opis: Naloga 16 - Ustvarjanje simetričnega diamanta z razmaki
 * 
 * @author Maj
 * @version 27. 10. 2024
 */
public class Naloga16 {

    /**
     * Glavna metoda aplikacije
     * 
     * @param args[0] - vrednost parametra za višino diamanta
     */
    public static void main(String[] args) {
        int število = Integer.valueOf(args[0]) - 1;

        // Zgornja polovica diamanta
        for (int i = 0; i <= število; i++) {
            for (int k = število; k > i; k--) {
                System.out.print("  ");
            }
            System.out.print(i);
            if (i > 0) {
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print("  ");
                }
                System.out.print(" " + i);
            }
            System.out.println();
        }

        // Spodnja polovica diamanta
        for (int i = število - 1; i >= 0; i--) {
            for (int k = število; k > i; k--) {
                System.out.print("  ");
            }
            System.out.print(i);
            if (i > 0) {
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print("  ");
                }
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
