package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
	private double kaucija;
	private boolean platiKauciju;
	private double osnovnaCena;
	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlatiKauciju() {
		return platiKauciju;
	}
	public void setPlatiKauciju(boolean platiKauciju) {
		this.platiKauciju = platiKauciju;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	
	
	public StaklenaAmbalaza() {
		super();
	}

	
	@Override
	public double cenaArtikla() {
		if(this.platiKauciju == true) {
			return (this.osnovnaCena * 1.2 + this.kaucija);
		} else {
			return (this.osnovnaCena * 1.2);
		}
		
	}
	@Override
	public void stampaj() {
		System.out.println("Barkod: " + this.barkod + " Naziv: " + this.naziv + " Cena: " + this.cenaArtikla() );
		
		
	}
	//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
	//ako se ne placa, (osnovna cena) * 1.2
	//metoda stampaj stampa sve podatke iz klase staklena flasa.
}
