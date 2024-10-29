import java.util.Random;

class Naloga13 {
    public static void main(String[] argumenti) {
        int x1, y1, x2, y2, xt, yt;

        if (argumenti.length==6) {
            x1 = Integer.parseInt(argumenti[0]);
            y1 = Integer.parseInt(argumenti[1]);
            x2 = Integer.parseInt(argumenti[2]);
            y2 = Integer.parseInt(argumenti[3]);
            xt = Integer.parseInt(argumenti[4]);
            yt = Integer.parseInt(argumenti[5]);
        }
        else {
            Random rand = new Random();
            x1 = rand.nextInt(201) - 100;
            y1 = rand.nextInt(201) - 100;
            x2 = rand.nextInt(201) - 100;
            y2 = rand.nextInt(201) - 100;
            xt = rand.nextInt(201) - 100;
            yt = rand.nextInt(201) - 100;
        }

        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);

        if (xt > minX && xt < maxX && yt > minY && yt < maxY) {
            System.out.println("Točka (" + xt + ", " + yt + ") je znotraj kvadrata.");
        } else if ((xt == minX || xt == maxX) && (yt >= minY && yt <= maxY) || 
                   (yt == minY || yt == maxY) && (xt >= minX && xt <= maxX)) {
            System.out.println("Točka (" +xt + ", " +yt + ") je na robu kvadrata.");
        } else {
            System.out.println("Točka (" + xt+ ", " + yt + ") je zunaj kvadrata.");
        }
    }
}
