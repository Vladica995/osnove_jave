package p16_08_2022;

public class Predavanje2 {

	public static void main(String[] args) {
//		Krairti klasu SlackMessage koja ima:
//			tekst poruke
//			ime i prezime osobe koja je stavila poruku
//			datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//			U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//			[ime i prezime osobe] - [kad je poslata]
//			[Tekst poruke]
		SlackMessage sm = new SlackMessage();
		sm.tekstPoruke = "Cao svima!";
		sm.imeIPrezime = "Vladica Stevanovic";
		sm.datumIVreme = "16.08.2022";
		sm.stampaj();

		SlackMessage sm1 = new SlackMessage();
		sm1.tekstPoruke = "Cao svete! ";
		sm1.imeIPrezime = "Milan Maric";
		sm1.datumIVreme = "13.08.2022";
		sm1.stampaj();

	}

}
