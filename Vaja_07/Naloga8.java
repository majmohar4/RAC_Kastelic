import java.lang.*;
/**
 * Program to generate random numbers and count how many contribute to a cumulative bitwise OR operation.
 * 
 * @author Maj
 * @version 13. 11. 2024
 */
public class Naloga8 {
    /**
     * Main application method.
     * 
     * @param args - Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int konec = 0, random = 0, uspešno = 0, število = 0;

        while ((konec & 0b1111111111111111) != 65535) {
            število++;
            random = (int)(Math.random()*Integer.MAX_VALUE);
            //random = (int)(Math.random()*33000);

            int temp1 = konec;
            konec = konec | random;
            if (konec != temp1) {
                uspešno++; // število uspešnih
                System.out.println(random);
            }
        }

        System.out.printf("Vseh generiranih števil: %d, ustreznih: %d, = %.2f%%%n",
                          število, uspešno, ((double) uspešno / število) * 100);
    }
}
9