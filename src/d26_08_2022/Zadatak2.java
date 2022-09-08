package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		
		
			for (int i = 0; i < 2; i++) {
				Igrac igrac = new Igrac();
			
			System.out.println("Unesite ime i prezime igraca: ");
			String imeIPrezime = s.next();
			imeIPrezime +=s.nextLine();
			
			igrac.setImeIPrezime(imeIPrezime);
			
			
			System.out.println("Unesite jmbg:");
			String jmbg = s.next();
			igrac.setJmbg(jmbg);
			System.out.println("Unesite godinu rodjenja: ");
			int godinaRodjenja = s.nextInt();
			igrac.setGodinaRodjenja(godinaRodjenja);
			System.out.println("Broj: ");
			int broj = s.nextInt();
			igrac.setBroj(broj);
			System.out.println("Pozicija: ");
			String pozicija = s.next();
			igrac.setPozicija(pozicija);
			System.out.println("Kapiten: ");
			boolean kapiten = s.nextBoolean();
			
			igrac.setKapiten(kapiten);
			
			 igraci.add(igrac);
			 
			} 	for (int i = 0; i < 2; i++) {
				Trener trener = new Trener();
				System.out.println("Unesite ime i prezime trenera: ");
				String imeIPrezime = s.next();
				imeIPrezime += s.nextLine();
				trener.setImeIPrezime(imeIPrezime);;
				
				
				System.out.println("Unesite jmbg:");
				String jmbg = s.next();
				trener.setJmbg(jmbg);
				System.out.println("Unesite godinu rodjenja: ");
				int godinaRodjenja = s.nextInt();
				trener.setGodinaRodjenja(godinaRodjenja);;
				System.out.println("Godine iskustva: ");
				int godineIskustva = s.nextInt();
				trener.setGodineIskustva(godineIskustva);
				System.out.println("Tip trenera: ");
				String tipTrenera = s.next();
				trener.setTipTrenera(tipTrenera);
				treneri.add(trener);
				
		
				


			} for (int i = 0; i < 2; i++) {
				System.out.println(igraci.get(i).getImeIPrezime() + ", " + igraci.get(i).getGodinaRodjenja() + ", " + igraci.get(i).getPozicija());
			
				
			} for (int i = 0; i < 2; i++) {
			
			System.out.println(treneri.get(i).getImeIPrezime() + ", " + treneri.get(i).getGodinaRodjenja() + ", " + treneri.get(i).getTipTrenera());
		}
		
		
		
		
		
	}
}


