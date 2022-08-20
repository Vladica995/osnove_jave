package p18_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Zadatak (Nizovi i petlje)
//		Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve a drugi za neparne brojeve. Program
//sa tastature ucitava N brojeva koje unosi korisnik i parne brojeve dodaje u niz parnih brojeva a neparne brojeve u niz neparnih. Na kraju programa odstampati brojeve oba niza. 
//		Nizovi se stampaju koristeci petlje.
//
//		Primer izvrsenja:
//		Unesite N: 9
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 4
//		Unesite broj: 8
//		Unesite broj: 3
//		Unesite broj: 9
//		Unesite broj: 13
//		Unesite broj: 10
//		Unesite broj: 4
//
//		Niz parnih: 2, 4, 8, 10, 4
//		Niz neparnih: 1, 3, 9, 13
		ArrayList<Integer> brojeviParni = new ArrayList<Integer>();
		ArrayList<Integer> brojeviNeparni = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj: ");
			int broj = s.nextInt();
			if (broj % 2 == 0) {
				brojeviParni.add(broj);

			} else {
				brojeviNeparni.add(broj);
			}

		}
		System.out.println("Niz parnih je: " + brojeviParni);
		System.out.println("Niz neparnih je: " + brojeviNeparni);

	}

}
