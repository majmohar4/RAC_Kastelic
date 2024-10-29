class Naloga12 {
	public static void main(String[] args) {
				int kocka1 = (int)(Math.random()*6+1);
				int kocka2 = (int)(Math.random()*6+1);
				
				String[][] vzorci = {
					{"|     |", "|  *  |", "|     |"},
					{"|   * |", "|     |", "| *   |"},
					{"|   * |", "|  *  |", "| *   |"},
					{"| * * |", "|     |", "| * * |"},
					{"| * * |", "|  *  |", "| * * |"},
					{"| * * |", "| * * |", "| * * |"}
				};
				System.out.println(" -------     ------- ");
				
				for (int i = 0; i < 3; i++) {
					System.out.println(vzorci[kocka1 - 1][i] + "     " + vzorci[kocka2 - 1][i]);
				}
				
				System.out.println(" -------     ------- ");
			}
}