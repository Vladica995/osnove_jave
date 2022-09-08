package d06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
		Korpa k = new Korpa();
		Tetrapak tk = new Tetrapak("123456", "mleko", 100, 150, true, 95);
		StaklenaAmbalaza pivo = new StaklenaAmbalaza();
		pivo.setBarkod("123456");
		pivo.setNaziv("zajecarsko");
		pivo.setOsnovnaCena(65);
		pivo.setKaucija(30);
		pivo.setPlatiKauciju(true);
		
		SuperKartica sk = new SuperKartica();
		sk.setBrojKartice("124-55");
		sk.setImeIPrezime("Vladica Stevanovic");
		sk.setPopust(20);
		k.dodajAmbalazu(tk);
		k.dodajAmbalazu(pivo);
		tk.cenaArtikla();
		System.out.println(tk.cenaArtikla());
		pivo.cenaArtikla();
		System.out.println(pivo.cenaArtikla());
		k.cenaKorpe(sk);
		pivo.stampaj();
		tk.stampaj();
		System.out.println("Ukupna cena sa popustom je: " + k.cenaKorpe(sk));
	
	
	//Tetrapak tka = new Tetrapak(barkod, naziv, netoTezina, brutoTezina, reciklaza, osnovnaCena)
	//StaklenaAmbalaza as = new StaklenaAmbalaza(barkod, naziv, netoTezina, brutoTezina, kaucija, platiKauciju, osnovnaCena)
	
	
	
	}

}
