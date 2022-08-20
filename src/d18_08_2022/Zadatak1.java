package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Proizvod zvucnik = new Proizvod();
		zvucnik.naziv = "BT ZVUCNIK";
		zvucnik.cena = 2000;
		zvucnik.tezina = 600;
		zvucnik.stampaj();
		zvucnik.povecajCenu(500);
		System.out.println(zvucnik.cena);
		zvucnik.vratiCenuSaPopustom(300);
		System.out.println(zvucnik.cena);
		System.out.println(zvucnik.vratiCenuSaPopustom(300));
		zvucnik.racunajPostarinu();
		System.out.println(zvucnik.racunajPostarinu());
		Proizvod tastatura = new Proizvod();
		tastatura.naziv = "BT TASTATURA";
		tastatura.cena = 3000;
		tastatura.tezina = 150;
		tastatura.stampaj();
		tastatura.povecajCenu(300);
		System.out.println(tastatura.cena);
		tastatura.vratiCenuSaPopustom(300);
		System.out.println(tastatura.cena);
		System.out.println(tastatura.vratiCenuSaPopustom(300));
		tastatura.racunajPostarinu();
		System.out.println(tastatura.racunajPostarinu());

	}

}
