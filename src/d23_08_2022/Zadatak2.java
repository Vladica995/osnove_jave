package d23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Racun uplatilac = new Racun("170-12345-23", "Vladica Stevanovic", 10000);
		Racun primalac = new Racun("170-32234-24", "Pera Peric", 500);
		Transakcija tr = new Transakcija(100, uplatilac, primalac);
		tr.izvrsiTrans(500);
		System.out.println(uplatilac.getStanje());
		System.out.println(primalac.getStanje());
		uplatilac.stampaj();
		primalac.stampaj();
		tr.stampaj();
	}

}
