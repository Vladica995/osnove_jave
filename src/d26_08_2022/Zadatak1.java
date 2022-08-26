package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Igrac odbrambeni = new Igrac(6, "odbrana", true);
		odbrambeni.setImeIPrezime("Vladica Stevanovic");
		odbrambeni.setJmbg("0206995730054");
		odbrambeni.setGodinaRodjenja(1995);
		odbrambeni.stampaj();
		Igrac napadacki = new Igrac(12, "napad", false);
		napadacki.setImeIPrezime("Cristiano Ronaldo");
		napadacki.setJmbg("060898666426");
		napadacki.setGodinaRodjenja(1986);
		napadacki.stampaj();
		Trener tr = new Trener();
		tr.setGodinaRodjenja(1965);
		tr.setGodineIskustva(25);
		tr.setImeIPrezime("Dragan Stojkovic");
		tr.setJmbg("0204965730065");
		tr.setTipTrenera("glavni trener");
		tr.stampaj();
		Trener kondicioni = new Trener();
		kondicioni.setGodinaRodjenja(1976);
		kondicioni.setGodineIskustva(15);
		kondicioni.setImeIPrezime("Zoran Stankovic");
		kondicioni.setJmbg("0204976735625");
		kondicioni.setTipTrenera("kondicioni trener");
		kondicioni.stampaj();
	}
}
