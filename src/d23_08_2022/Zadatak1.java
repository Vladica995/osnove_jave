package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
		ZeleniKarton ispit = new ZeleniKarton();
		
		for (int i = 0; i < 10; i++) {

			System.out.println("Ime i prezime studenta: ");
			String imePrezime = s.next();
			ispit.setImeIPrezimeStudenta(imePrezime);
			System.out.println("Broj indeksa: ");
			int broj = s.nextInt();
			ispit.setBrojIndeksa(broj);
			System.out.println("Predmet: ");
			String predmet = s.next();
			ispit.setPredmet(predmet);
			System.out.println("Profesor: ");
			String profesor = s.next();
			ispit.setImeIPrezimeProfesora(profesor);
			System.out.println("Ocena: ");
			int ocena = s.nextInt();
			ispit.setOcena(ocena);
			ispiti.add(ispit);

		}
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Ime i prezime studenta: " + ispiti.get(i).getImeIPrezimeStudenta() + " Broj indeksa:  " + ispiti.get(i).getBrojIndeksa() + " Predmet: " + ispiti.get(i).getPredmet() + 
					" Profesor: " + ispiti.get(i).getImeIPrezimeProfesora() + " Ocena: " + ispiti.get(i).getOcena()); 
			

		}

		// String imeIPrezimeStudenta, int brojIndeksa, String predmet, String
		// imeIPrezimeProfesora,
		// int ocena) {

	}

}
