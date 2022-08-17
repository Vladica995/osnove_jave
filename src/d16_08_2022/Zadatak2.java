package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
		
		SmartAirConditioning klima = new SmartAirConditioning();
		klima.marka = "Samsung";
		klima.temperatura = 22.5;
		klima.funkcija = "hladi";
		klima.stampa();
		klima.spoljnaTemp(25);
		if(klima.spoljnaTemp(25) == true) {
			System.out.println("Napolju je veca temperatura.");
		} else {
			System.out.println("Napolju je manja temperatura.");
		}


	}

}
