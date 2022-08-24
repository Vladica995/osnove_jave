package d23_08_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
	private int id;
	private Racun uplatilac;
	private Racun primalac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Racun getUplatilac() {
		return uplatilac;
	}

	public void setUplatilac(Racun uplatilac) {
		this.uplatilac = uplatilac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	public Transakcija() {
	}

	public Transakcija(int id, Racun uplatilac, Racun primalac) {
		this.id = id;
		this.uplatilac = uplatilac;
		this.primalac = primalac;

	}

	public void izvrsiTrans(int iznos) {
		this.uplatilac.menjaStanjeRacunaUplatioca(iznos - 45);
		this.primalac.menjajStanjePrimaoca(iznos);
	}

	public void stampaj() {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.uplatilac.getImeIPrezime() + " " + this.uplatilac.getBrojRacuna());
		System.out.println("Racun na: " + this.primalac.getImeIPrezime() + " " + this.primalac.getBrojRacuna());
	}
}

//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).

//metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna
