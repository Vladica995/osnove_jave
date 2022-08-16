package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena
		// vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite
		// vrednosti.
		int x = stampajVrednostZa10Vecu(10);

		System.out.println("Vracena vrednost je: " + x);

	}

	public static int stampajVrednostZa10Vecu(int a) {
		return a + 10;
	}

}
