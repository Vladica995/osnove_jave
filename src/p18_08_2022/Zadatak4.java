package p18_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Zadatak (Metode)
//		Napisati metodu koja vrsi konverziju metara u centimetre, decimetre i kilometre. Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju a vraca konvertovanu vrednost.
//
//		Podsetnik za konverziju jedinica:
//		1m = 100 cm
//		1m = 10 dm
//		1m = 0.001 km
//
//		Primer poziva metode
//		Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//		Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//
//		U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
//
//		Primer izvrsenja programa:
//		3.5m je 350cm
//		3.5m je 35dm
//		3.5m je 0.0035km
		double vrednost = 1;
		double x = konvertuj(vrednost, "cm");
		System.out.println("Vrednost: " + vrednost + "m je " + x + "cm");
		double y = konvertuj(vrednost, "km");
		System.out.println("Vrednost: " + vrednost + "m je " + y + "km");
		double z = konvertuj(vrednost, "dm");
		System.out.println("Vrednost: " + vrednost + "m je " + z + "dm");

	}

	public static double konvertuj(double m, String jedinica) {
		if (jedinica.equals("cm")) {
			return m * 100;
		} else if (jedinica.equals("dm")) {
			return m * 10;
		} else if (jedinica.equals("km")) {
			return m / 1000;
		}
		return 0;
	}

}
