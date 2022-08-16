package p16_08_2022;

import java.util.Scanner;

public class Predavanje1 {

	public static void main(String[] args) {
		// Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima
		// i ostampati podatke za svaki objekat.

		Racun r = new Racun();
		r.brojRacuna = "21321315";
		r.imeIPrezime = "Vladica Stevanovic";
		r.stanjeNaRacunu = 10000.12;
		Racun n = new Racun();
		n.brojRacuna = "213123135566";
		n.imeIPrezime = "Zoran Zoric";
		n.stanjeNaRacunu = 2135.32;

		System.out.println("Posaljilac: " + r.imeIPrezime + ", " + r.brojRacuna + ", " + "stanje: " + r.stanjeNaRacunu);
		System.out.println("Primalac: " + n.imeIPrezime + ", " + n.brojRacuna + ", " + "stanje: " + n.stanjeNaRacunu);

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite transkakciju: ");
		int broj = s.nextInt();
		r.stanjeNaRacunu = r.stanjeNaRacunu - broj;
		n.stanjeNaRacunu = n.stanjeNaRacunu + broj;
		System.out.println("Posaljilac: " + r.imeIPrezime + ", " + r.brojRacuna + ", " + "stanje: " + r.stanjeNaRacunu);
		System.out.println("Primalac: " + n.imeIPrezime + ", " + n.brojRacuna + ", " + "stanje: " + n.stanjeNaRacunu);

	}

}
//Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700
