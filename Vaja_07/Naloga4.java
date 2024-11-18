public class Naloga4 {
    public static void main(String[] args){
            int i;
            boolean pogoj;
            for(i=1; i<=15; i++){
                pogoj = (i%4==0) || (i%3==0) && (i%5==0) ;
                //c// pogoj = !pogoj;
                //d// pogoj = (!pogoj)?!pogoj:pogoj;
                if ((!pogoj)?!pogoj:pogoj)
                    System.out.print('*');
                else
                System.out.print('!');
            }
    }
}