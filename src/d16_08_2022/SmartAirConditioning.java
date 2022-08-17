package d16_08_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu 
//		atribut za mod (hladi/greje) - string
//		metodu za stampu (proizvoljno)
//		metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
	String marka;
	double temperatura;
	String funkcija;
	
	
	public void stampa() {
		System.out.println(marka + ", " + temperatura + ", " + funkcija + ".");
	} public boolean spoljnaTemp (double spoljnaTemperatura) {
		if(this.temperatura < spoljnaTemperatura) {
			return true;
			
			
		} else {
			return false;
			
		} 
	}


}
