import java.util.Random;

public class Naloga2 {
    public static double Random() {
        float max = 109.99f;
        float min = -9.99f;
        double stevilo = (Math.random() * (max + min) - min);
        return stevilo;
    }

    public static void main(String[] args) {
        double temperatura = Random();
        double vrelisce = 100;
        double ledisce = 0;
        System.out.println("Temperatura: " + temperatura + "°C");

        double fahrenheit = temperatura * 9 / 5 + 32;
        double fahrenheit_v = vrelisce * 9 / 5 + 32;
        double fahrenheit_l = ledisce * 9 / 5 + 32;
        System.out.println(fahrenheit + "°F");
        System.out.println("Voda zavre pri " + fahrenheit_v + "°F");
        System.out.println("Voda zamrzne pri " + fahrenheit_l + "°F");

        double kelvin = temperatura + 273.15;
        double kelvin_v = vrelisce + 273.15;
        double kelvin_l = ledisce + 273.15;
        System.out.println(kelvin + "K");
        System.out.println("Voda zavre pri " + kelvin_v + "K");
        System.out.println("Voda zamrzne pri " + kelvin_l + "K");

        double romer = temperatura * 21 / 40 + 7.5;
        double romer_v = vrelisce * 21 / 40 + 7.5;
        double romer_l = ledisce * 21 / 40 + 7.5;
        System.out.println(romer + "°Rø");
        System.out.println("Voda zavre pri " + romer_v + "°Rø");
        System.out.println("Voda zamrzne pri " + romer_l + "°Rø");

        double delisle = (100 - temperatura) * 3 / 2;
        double delisle_v = (100 - vrelisce) * 3 / 2;
        double delisle_l = (100 - ledisce) * 3 / 2;
        System.out.println(delisle + "°De");
        System.out.println("Voda zavre pri " + delisle_v + "°De");
        System.out.println("Voda zamrzne pri " + delisle_l + "°De");

        double rankine = (temperatura + 273.15) * 9 / 5;
        double rankine_v = (vrelisce + 273.15) * 9 / 5;
        double rankine_l = (ledisce + 273.15) * 9 / 5;
        System.out.println(rankine + "°R");
        System.out.println("Voda zavre pri " + rankine_v + "°R");
        System.out.println("Voda zamrzne pri " + rankine_l + "°R");

        double newton = temperatura * 33 / 100;
        double newton_v = vrelisce * 33 / 100;
        double newton_l = ledisce * 33 / 100;
        System.out.println(newton + "°N");
        System.out.println("Voda zavre pri " + newton_v + "°N");
        System.out.println("Voda zamrzne pri " + newton_l + "°N");
    }
}
