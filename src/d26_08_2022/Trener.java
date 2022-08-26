package d26_08_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	private int godineIskustva;
	private String tipTrenera;

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;

	}

	public Trener() {
		super();
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godineIskustva + " Tip trenera: " + this.tipTrenera);

	}

}
