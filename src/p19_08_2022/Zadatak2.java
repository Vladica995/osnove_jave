package p19_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Radnik r = new Radnik("0206995730054" ,"Vladica Stevanovic" , 0 , 8, 5 );
		r.plataRadnika();
		r.kreditnoSposoban();
		r.getbrojDece();
		System.out.println(r.plataRadnika());
		System.out.println(r.kreditnoSposoban());
		System.out.println(r.getbrojDece());
		r.getgodineRadnogStaza();
		System.out.println(r.getgodineRadnogStaza());
	}

}
