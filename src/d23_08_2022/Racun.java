package d23_08_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.
	private String brojRacuna;
	private String imeIPrezime;
	private int stanje;

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getStanje() {
		return stanje;
	}

	public Racun(String brojRacuna, String imeIPrezime, int stanje) {
		this.brojRacuna = brojRacuna;
		this.imeIPrezime = imeIPrezime;
		this.stanje = stanje;
	}

	public void menjaStanjeRacunaUplatioca(int vrednost) {
		this.stanje = this.stanje - vrednost;

		if (this.stanje < 0) {
			this.stanje = 0;
		}
	}

	public void stampaj() {
		System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.stanje + " rsd");
	}

	public void menjajStanjePrimaoca(int vrednost) {
		this.stanje = this.stanje + vrednost;
	}

}
