package p15_08_2022;

public class Predavanje5 {

	public static void main(String[] args) {
		// Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost
		// prosledjene vrednosti.
		stampajApsolutnuVrednost(-5);

	}

	public static void stampajApsolutnuVrednost(int a) {
		if (a >= 0) {
			int apsolutna = a;
			System.out.println("Apsolutna vrednost je: " + apsolutna);

		} else if (a < 0) {
			int apsolutna = a * (-1);
			System.out.println("Apsolutna vrednost je: " + apsolutna);
		}

	}
}