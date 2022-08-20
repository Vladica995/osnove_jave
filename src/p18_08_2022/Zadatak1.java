package p18_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak (Grananja)
//		Napisati program koji simulira notifikaciju za novu verziju aplikacije. Korisnik unosi verziju aplikacije koju ima instaliranu na svom racunaru a zatim najnoviju verziju, nakon cega se ispisuje notifikacija.
//		Verzija aplikacije se sastoji od major i minor broja. Aplikacije imaju verziju uglavnom u formatu major.minor i primer bi bio Facebook 2.1 gde je major=2 i minor=1
//		Aplikacija je novije verzije ukoliko je:
//		major broj veci ili
//		ukoliko je major isti, tada nova verzija ima veci minor
//
//		Napomena: Smatrati da korisnik za najnoviju verziju unosi vecu ili istu verziju od instalirane, nikako manju.
//		Primer izvrsenja 1:
//			Unesite major verziju instalirane aplikacije: 4
//			Unesite minor verziju instalirane aplikacije: 5
//			(Obasnjenje) Na racunaru je instalirana verzija 4.5
//			Unesite major verziju najnovije aplikacije: 4
//			Unesite minor verziju najnovije aplikacije: 7
//			(Obasnjenje) Najnovija verzija je 4.7. 
//			Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite verziju aplikacije koja je instalirana(major): ");
		int major = s.nextInt();
		System.out.println("Unesite verziju aplikacije koja je instalirana(minor): ");
		int minor = s.nextInt();
		System.out.println("Unesite najnoviju verziju(major) : ");
		int majorNew = s.nextInt();
		System.out.println("Unesite najnoviju verziju(minor) : ");
		int minorNew = s.nextInt();
		if (major < majorNew) {
			System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");
		} else if (major == majorNew && minor == minorNew) {
			System.out.println("Vec imate najnoviju verziju na racunaru. ");
		} else if (major == majorNew && minor < minorNew) {
			System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");
		}

	}

}
