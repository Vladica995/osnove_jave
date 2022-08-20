package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		FacebookPost fb = new FacebookPost();
		fb.imeIPrezime = "Vladica Stevanovic";
		fb.profilImeIPrezime = "Aleksandar Vucic";
		fb.tekst = "Pozdrav predsednice!";
		fb.brojLajkova = 252;
		fb.brojDeljenja = 22;
		fb.like();
		fb.dislike();
		fb.share();
		fb.print();
		FacebookPost ig = new FacebookPost();
		ig.imeIPrezime = "Miroljub Petrovic";
		ig.profilImeIPrezime = "Tesa Tesanovic";
		ig.tekst = "Mladi sve vise piju.";
		ig.brojLajkova = 44;
		ig.brojDeljenja = 36;
		ig.like();
		ig.dislike();
		ig.share();
		ig.print();

	}

}
