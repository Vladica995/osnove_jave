package d19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//			   ime i prezime korisnika koji je objavio post
//			   ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			   tekst objave
//			   broj lajkova
//			   broj deljenja
//			    Konstruktore:
//			   difoltni konstuktor
//			   konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//			     Od metoda:
//			   like(), koja povecava broj lajkova za 1.
//			   dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			   share(), koja povecava broj deljenja za 1
//			   print(), koja stampa objavu u formatu:
//			   (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			   (tekst objave)
//			   Likes (broj lajkova) | Shares (broj deljenja)
		//
//			   U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

		FacebookPost objava = new FacebookPost("Vladica Stevanovic", "Zoran Zoric", "Pozdrav!");
		objava.setbrojLajkova(100);
		objava.setbrojDeljenja(20);
		objava.like();
		objava.dislike();
		objava.share();
		objava.print();
		FacebookPost face = new FacebookPost("Stevan Stevanovic", "Nenad Nedic", "Samo zdravo!");
		face.setbrojLajkova(2);
		face.setbrojDeljenja(33);
		face.like();
		face.dislike();
		face.share();
		face.print();

	}

}
