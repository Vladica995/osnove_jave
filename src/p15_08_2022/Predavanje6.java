package p15_08_2022;

import java.util.Scanner;

public class Predavanje6 {

	public static void main(String[] args) {
//		Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//		Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		N=5, print je=> * * * * * 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = s.nextInt();
		
		printZvezda(n);
		
		


	}
	public static void printZvezda(int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.print("* ");
		
			
		} 
	}

}
