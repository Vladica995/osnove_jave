package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Sektor izvoz = new Sektor();
		izvoz.setNaziv("Izvoz");
		izvoz.setPlata(35000);
		Sektor uvoz = new Sektor();
		uvoz.setNaziv("Uvoz");
		uvoz.setPlata(40000);
		Magacioner m = new Magacioner();
		m.setImeIPrezime("Milan Maric");
		m.zaposli(izvoz);
		m.zaposli(uvoz);
		m.plata();

		Sektor hr = new Sektor();
		hr.setNaziv("Ljudski resursi");
		hr.setPlata(100000);
		Sektor pr = new Sektor();
		pr.setNaziv("Odnosi sa javnoscu");
		pr.setPlata(75000);
		Menadzer men = new Menadzer();
		men.setImeIPrezime("Vladica Stevanovic");
		men.zaposli(pr);
		men.zaposli(hr);
		men.plata();

		System.out.println("Magacioner: " + m.getImeIPrezime() + " , Plata: " + m.plata());
		System.out.println("Menadzer: " + men.getImeIPrezime() + " , Plata: " + men.plata());
	}

}
