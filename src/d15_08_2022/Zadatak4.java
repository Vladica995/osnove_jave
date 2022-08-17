package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {

//Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

		podaci("0206995730054", "Vladica", "Stevanovic", 1995, true);

	}

	public static void podaci(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Godina rodjenja: " + godinaRodjenja);
		System.out.println("AKtivan: " + aktivan);

	}

}
