package p19_08_2022;

public class Tacka {
//	1.Zad
//	Za klasu Tacka, koja ima privatne atribute:
//	x - x koordinata
//	y - y koordinata
//	Javne metode:
//	metodu stampaj
//	imamo difoltni konstruktor
//	imamo konstuktor koji prima obe koordinate za kreiranje objekta
//	geter za x
//	geter za y
//	seter za x
//	seter za y
//
//	U glavnom programu kreirati dva objekta:
//	Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//	Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

	private int xKordinata;
	private int yKordinata;

	public void stampaj() {
		System.out.println(xKordinata);
		System.out.println(yKordinata);

	}

	public Tacka() {

	}

	public Tacka(int xKordinata, int yKordinata) {
		this.xKordinata = xKordinata;
		this.yKordinata = yKordinata;
	}

	public int getxKordinata() {
		return this.xKordinata;
	}

	public int getyKordinata() {
		return this.yKordinata;
	}

	public void setxKordinata(int xKordinata) {
		this.xKordinata = xKordinata;
	}

	public void setyKordinata(int yKordinata) {
		this.yKordinata = yKordinata;
	}

}
