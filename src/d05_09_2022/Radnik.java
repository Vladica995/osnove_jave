package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	private String imeIPrezime;
	private ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public abstract double plata();

	public void zaposli(Sektor sektor) {
		sektori.add(sektor);
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}

}
