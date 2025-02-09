/**
 *   razred;
 *     celoten kontekst je razredne vrste
 *     ( vsi člani so razredni člani /static/ )
 */
class Zero_01_ra{    
    // class variables - replace the example below with your own
    static int x;
    static int y;   
}

public class Zero_01 {

 public static void main(String[] args){
     
     //--------- a
     Zero_01_ra.x = 3; 
     Zero_01_ra.y = 4;
     System.out.println("----------------------------- vsebina: class members  --");
     System.out.println(Zero_01_ra.x+" "+Zero_01_ra.y);
         
     Zero_01_ra ra1 = new Zero_01_ra();     // naredimo 2 objekta vrste 'ra'
     Zero_01_ra ra2 = new Zero_01_ra();
     
     //malo preglejmo
     System.out.println("----------------------------- vsebina iz obeh objektov  --");
     System.out.println(ra1.x+" "+ra1.y);
     System.out.println(ra2.x+" "+ra2.y);
     // še malo manipulacije
     Zero_01_ra.x = 131; 
     ra2.y = 898;
     // in preglejmo:
     System.out.println("----------------------------- vsi 'trije'  --");
     System.out.println(Zero_01_ra.x+" "+Zero_01_ra.y);
     System.out.println(ra1.x+" "+ra1.y);
     System.out.println(ra2.x+" "+ra2.y);
     
 }

}