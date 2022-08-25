package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Ispit krivicno = new Ispit("Krivicno pravo" , 10 , "Milan Milic");
		Ispit gradjansko = new Ispit("Gradjansko pravo" , 5 , "Zika Pavlovic");
		Ispit porodicno = new Ispit("Porodicno pravo" , 6 , "Mile Maric");
		Ispit ekonomija = new Ispit("Osnovi ekonomije" , 8 , "Sasa Radulovic");
		Student v = new Student("165/14" , "Vladica Stevanovic" , "osnovne studije");
		v.dodajIspit(krivicno);
		v.dodajIspit(gradjansko);
		v.dodajIspit(porodicno);
		v.dodajIspit(ekonomija);
		v.stampaj();
	}

}
