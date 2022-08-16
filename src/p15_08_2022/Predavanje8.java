package p15_08_2022;

public class Predavanje8 {

	public static void main(String[] args) {
//		8. Zadatak
//		Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla.
		// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//		Trougao je pravougli ukoliko je a*a+b*b=c*c
		trougaoPravougli(5, 5, 10);
		boolean pravougli = trougaoPravougli(5, 5, 10);

		if (trougaoPravougli(5, 5, 10) == true) {
			System.out.println("Trougao je pravougli");
		} else {
			System.out.println("Trougao nije pravougli");
		}
	}

	public static boolean trougaoPravougli(int a, int b, int c) {
		if ((a * a) + (b * b) == c * c) {
			return true;

		} else {
			return false;

		}
	}

}