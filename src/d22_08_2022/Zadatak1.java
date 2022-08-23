package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Knjiga koji ima:
//			-ISBN
//			-naziv
//			-godina izdanja
//			-autor
//			-konstuktore koje mislite da su vam potrebni
//			-gettere i settere za atribute
//			-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//			(ISBN)
//			(naziv) - (godina izdanja)
//			autor: (ime autora) (prezime autora) 
		Autor autor = new Autor("Rene", "Gijo");
		Knjiga knjiga = new Knjiga(125, "Bela Griva", 2007, autor);
		knjiga.stampaj();
		Autor pisac = new Autor("Vladica", "Stevanovic");
		Knjiga pravo = new Knjiga(111, "Krivicno pravo", 2019, pisac);
		pravo.stampaj();

	}

}
