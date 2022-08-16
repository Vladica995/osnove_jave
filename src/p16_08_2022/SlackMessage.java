package p16_08_2022;

public class SlackMessage {
	
//	Krairti klasu SlackMessage koja ima:
//		tekst poruke
//		ime i prezime osobe koja je stavila poruku
//		datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//		U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//		[ime i prezime osobe] - [kad je poslata]
//		[Tekst poruke]
	
	public String tekstPoruke;
	public String imeIPrezime;
	public String datumIVreme;

//	Dopuna:
//		Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu
//		koji je naveden iznad i u mainu pozovite metode nad objektima koje ste kreirali.

	public void stampaj() {
		System.out.println("Ime i prezime: " + this.imeIPrezime + "-" + this.datumIVreme);
		System.out.println(this.tekstPoruke);
	}

}
