package d25_08_2022;

import java.util.ArrayList;

import p25_08_2022.Reakcija;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	private String brojIndeksa;
	private String imeIprezimeStudenta;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(String brojIndeksa, String imeIprezimeStudenta, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.imeIprezimeStudenta = imeIprezimeStudenta;
		this.tipStudija = tipStudija;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIprezimeStudenta() {
		return imeIprezimeStudenta;
	}

	public void setImeIprezimeStudenta(String imeIprezimeStudenta) {
		this.imeIprezimeStudenta = imeIprezimeStudenta;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public double prosek() {
		int suma = 0;
		int prosek = 0;
		int broj = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (this.ispiti.get(i).getOcena() < 5) {
				this.ispiti.remove(i);

			} else if (this.ispiti.get(i).getOcena() > 5) {
				broj++;
				suma = suma + ispiti.get(i).getOcena();
				prosek = (suma) / broj;

			}
		}
		return prosek;

	}

	public void stampaj() {
		System.out.println(this.brojIndeksa + " - " + this.imeIprezimeStudenta + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			System.out.println(this.ispiti.get(i).getNazivPredmeta() + " - "
					+ this.ispiti.get(i).getImeIPrezimeProfesora() + " - " + this.ispiti.get(i).getOcena());

		}
		System.out.println("Prosecna ocena: " + this.prosek());

	}
}

//	metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
