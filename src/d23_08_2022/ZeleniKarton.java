package d23_08_2022;

public class ZeleniKarton {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

	private String imeIPrezimeStudenta;
	private int brojIndeksa;
	private String predmet;
	private String imeIPrezimeProfesora;
	private int ocena;

	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public ZeleniKarton() {

	}

	public ZeleniKarton(String imeIPrezimeStudenta, int brojIndeksa, String predmet, String imeIPrezimeProfesora,
			int ocena) {

		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.predmet = predmet;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}

	public boolean ispitPolozen() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void stampaj() {
		System.out.println(this.predmet + " - " + this.ocena);
		System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeIPrezimeProfesora);
		
	}

	// metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je
	// ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//

}
