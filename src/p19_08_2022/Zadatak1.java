package p19_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//1.Zad
//		Za klasu Tacka, koja ima privatne atribute:
//		x - x koordinata
//		y - y koordinata
//		Javne metode:
//		metodu stampaj
//		imamo difoltni konstruktor
//		imamo konstuktor koji prima obe koordinate za kreiranje objekta
//		geter za x
//		geter za y
//		seter za x
//		seter za y
	//
//		U glavnom programu kreirati dva objekta:
//		Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//		Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40
		
		Tacka t = new Tacka();
		t.setxKordinata(10);
		t.setyKordinata(20);
		t.stampaj();
		
		Tacka r = new Tacka(30, 40);{
			r.stampaj();
			
			
			
			
		}
		
	}

}
