package p15_08_2022;

public class Predavanje9 {

	public static void main(String[] args) {
		//9.Zadatak
		//Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int). 
		//1 - I
		//2 - II
		///3 - III
		//4 - IV
		//5 - V
		//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
		//Ako se unese V vraca se 5.

		int x = konvertuj("II");
		System.out.println(x);
	
	
	
	
	
	
	
	
	} public static int konvertuj (String rimski) {
		if(rimski.equals("I")) {
			return 1;
		} else if(rimski.equals("II")) {
			return 2;
		} else {
			return 0;
		}
			
	}

}
