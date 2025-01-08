class Naloga12 {
    public static void main(String[] args) {
        int k1 = (int)(Math.random() * 6 + 1);
        int k2 = (int)(Math.random() * 6 + 1);
        System.out.println(" -------     ------- ");
        izpisVrsta(kocka1, k2, 0);
        izpisVrsta(k1, k2, 1);
        izpisVrsta(k1, k2, 2);
        System.out.println(" -------     ------- ");
    }
    public static void izpisVrsta(int k1, int k2, int vrstica) {
        String k1Vrsta = getVrsta(k1, vrstica);
        String k2Vrsta = getVrsta(k2, vrstica);
        System.out.println(k1Vrsta + "     " + k2Vrsta);
    }
    public static String getVrsta(int k, int vrstica) {
        if (k == 1) {
            if (vrstica == 0) return "|     |";
            if (vrstica == 1) return "|  *  |";
            if (vrstica == 2) return "|     |";
        } else if (k == 2) {
            if (vrstica == 0) return "|   * |";
            if (vrstica == 1) return "|     |";
            if (vrstica == 2) return "| *   |";
        } else if (k == 3) {
            if (vrstica == 0) return "|   * |";
            if (vrstica == 1) return "|  *  |";
            if (vrstica == 2) return "| *   |";
        } else if (k == 4) {
            if (vrstica == 0) return "| * * |";
            if (vrstica == 1) return "|     |";
            if (vrstica == 2) return "| * * |";
        } else if (k == 5) {
            if (vrstica == 0) return "| * * |";
            if (vrstica == 1) return "|  *  |";
            if (vrstica == 2) return "| * * |";
        } else if (k == 6) {
            if (vrstica == 0) return "| * * |";
            if (vrstica == 1) return "| * * |";
            if (vrstica == 2) return "| * * |";
        }
        return "";
    }
}
