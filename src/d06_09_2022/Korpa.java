package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		ambalaze.add(ambalaza);
	}

	public void izbaci(String barkod) {
		for (int i = 0; i < ambalaze.size(); i++) {
			if (barkod.equals(ambalaze.get(i).getBarkod())) {
				ambalaze.remove(i);
			}
		}
	}

	private double cenaSvih(double popust) {
		double suma = 0;
		
		for (int i = 0; i < ambalaze.size(); i++) {
			suma = suma + ambalaze.get(i).cenaArtikla();
		}
		return suma / ((100 + popust) / 100);
	}

	public double cenaKorpe(SuperKartica sk) {
		double suma = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			suma = suma + ambalaze.get(i).cenaArtikla();

		}
		return suma / ((100 + sk.getPopust()) / 100);
	}

}
