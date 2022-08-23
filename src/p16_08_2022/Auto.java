package p16_08_2022;

public class Auto {
//	 Zadatak
//	 Kreirati klasu Auto koja ima:
//	 ime i prezime vozaca
//	 marku automobila
//	 broj vrata
//	 potrosnju na 100km (npr: 10)
//	 trenutnu brzinu kojom se auto krece
//	 metodu za stampu koja stampa podatke u formatu:
//	 [Vozac]
//	 	[Marka] - [br vrata]-ro vrata
//	 	Sa potrosnjom od [potrosnja] l na 100km
//	 	[Trenutna brzina auta] km/h je trenutna brzina.
//	 	Primer:
//	 	Milan Jovanovic
//	 	BMW - 5-ro vrata
//	 	Sa potrosnjom od 10 l na 100km
//	 	200 km/h je trenutna brzina

	// U okviru klase Auto, implementirati jos 2 metode:
	// metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar
	// metode se prima ogranicenje (kao broj) a metoda vraca true ili false
	// ako je trenutna brzina veca od ogranicenja.
	// metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu
	// prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
	// U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu
	// informacija koje dobijete od njih.
//
//	Dopuniti klasu Auto tako da ima:
//		● atribut godinu proizvodnje
//		● atribut mesec do kad je registrovan auto (int)
//		● atribut kubikaza auta (npr: 1600 - 5000)
//		● metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je
//		oldtimer.
//		● metodu koja vraca da li je istekla registracije. Metoda kao parametar prima
//		trenutni mesec i na osnovu toga vraca true ili false.
//		● metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000
//		kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika
//		dodatno se uracunava 30% na cenu.

	public String imeIprezime;
	public String markaAuta;
	public int brojVrata;
	public double potrosnja;
	public int brzina;
	public int godinaProizvodnje;
	public int mesec;
	public int kubikaza;
	public int brojReg;
	public boolean klimaUkljucena;
	public int maxBrzina;
	public void print() {
		System.out.println("Ime i prezime: " + this.imeIprezime);
		System.out.println("Marka: " + this.markaAuta + " - " + this.brojVrata + "ro vrata");
		System.out.println("Sa potrosnjom od: " + this.potrosnja + " l na 100km");
		System.out.println(this.brzina + "km/h je trenutna brzina.");
	}

	public boolean prekoracenje(int ogranicenje) {
		if (this.brzina > ogranicenje) {
			return true;

		} else {
			return false;
		}

	}

	public int kazna(int ogranicenje) {
		if (this.brzina > ogranicenje) {
			return (this.brzina - ogranicenje) * 1000;
		} else {
			return 0;
		}
	}

	public boolean oldTimer() {
		if (this.godinaProizvodnje <= 1950) {
			return true;
		} else {
			return false;
		}
	}

	public boolean registracija(int mesecTrenutni) {
		if (this.mesec < mesecTrenutni) {
			return true;
		} else {
			return false;
		}

	}

	public double cenaReg() {
		if (this.kubikaza <= 2000) {
			return this.kubikaza * 100;
		} else {
			return this.kubikaza * 100 * 1.3;
		}
	}

	public void dodajGas() {
		this.brzina = this.brzina + 10;
		if(this.brzina > this.maxBrzina) {
			this.brzina = this.maxBrzina;
		}
	}

	public void koci() {
		if (this.brzina > 0) {
			this.brzina = this.brzina - 10;
		} else {
			this.brzina = 0;
		}

	}

	public double potrosnjaGoriva() {
		if (this.klimaUkljucena == true) {
			return (this.brzina / 100) * this.potrosnja * 1.2;
		} else {
			return (this.brzina/ 100)* this.potrosnja;
		}
	} 
}

//Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
