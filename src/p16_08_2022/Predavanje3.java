package p16_08_2022;

public class Predavanje3 {

	public static void main(String[] args) {
//		 Zadatak
//		 Kreirati klasu Auto koja ima:                                                                
//		 ime i prezime vozaca
//		 marku automobila
//		 broj vrata
//		 potrosnju na 100km (npr: 10)
//		 trenutnu brzinu kojom se auto krece
//		 metodu za stampu koja stampa podatke u formatu:
//		 [Vozac]
//		 	[Marka] - [br vrata]-ro vrata
//		 	Sa potrosnjom od [potrosnja] l na 100km
//		 	[Trenutna brzina auta] km/h je trenutna brzina.
//		 	Primer:
//		 	Milan Jovanovic
//		 	BMW - 5-ro vrata
//		 	Sa potrosnjom od 10 l na 100km
//		 	200 km/h je trenutna brzina
//		
		
		//U okviru klase Auto, implementirati jos 2 metode:
//			metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false
		//ako je trenutna brzina veca od ogranicenja.
//			metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//			U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.

		Auto a = new Auto();
		a.imeIprezime = "Vladica Stevanovic";
		a.markaAuta = "Audi";
		a.brojVrata = 5;
		a.potrosnja = 10;
		a.brzina = 100;
		a.mesec = 5;
		a.kubikaza = 2000;
		a.godinaProizvodnje = 1990;
		a.brojReg = 12345;
		a.klimaUkljucena = true;
		a.maxBrzina = 140;
		a.dodajGas();
		a.dodajGas();
		a.dodajGas();
		a.koci();
		a.potrosnjaGoriva();
		
		a.print();
		
		if(a.prekoracenje(50) == true) {
			System.out.println("Desilo se prekoracenje.");
			System.out.println("Kazna " + a.kazna(50));
		} else {
			System.out.println("Nije se desilo.");
		} if(a.oldTimer() == true) {
			System.out.println("Jeste old timer.");
		} else {
			System.out.println("Nije old timer.");
		}
	
	}

}
