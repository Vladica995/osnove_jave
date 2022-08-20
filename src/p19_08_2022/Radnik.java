package p19_08_2022;

public class Radnik {
//	2.Zad Kreirati klasu Radnik koja ima:
//		jmbg radnika
//		ime i prezime
//		broj dece (1,2,3,... ili 0 ako nema dece)
//		stepen strucne spreme (od 1 do 8)
//		godine radnog staza
//		konstuktor koji postavlja samo jmbg
//		konstuktor koji postavlja sve atribute
//		getere i setere
//		metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//		metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//		metodu koja racuna platu radnika, plata se racuna po formuli:
//		25000 + (koeficijent slozenosti + minuli rad) * 10000
//		metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
	private String jmbg;
	private String imeIPrezime;
	private int brojDece;
	private int stepenStrucneSpreme;
	private int godineRadnogStaza;
	
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza) {
		this.jmbg = jmbg;
		this.imeIPrezime = imeIPrezime;
		this.brojDece = brojDece;
		this.stepenStrucneSpreme = stepenStrucneSpreme;
		this.godineRadnogStaza = godineRadnogStaza;
	}
	public void setjmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public void setimeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public void setbrojDece(int brojDece) {
		this.brojDece = brojDece; 
	}
	public void setstepenStrucneSpreme(int stepenStrucneSpreme) {
		this.stepenStrucneSpreme = stepenStrucneSpreme; 
	}
	public void setgodineRadnogStaza(int godineRadnogStaza) {
		this.godineRadnogStaza = godineRadnogStaza; 
	}
	public String getjmbg() {
		return this.jmbg;
	}
	public String getimeIPrezime() {
		return this.imeIPrezime; 
		} 
	public int getbrojDece() {
		return this.brojDece;
	}
	public int getstepenStrucneSpreme() {
		return this.stepenStrucneSpreme;
	}
	public int getgodineRadnogStaza() {
		return this.godineRadnogStaza; }
	
//	Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//		- do 10 godina 0.05
//		- od 10-20 godina 0.075
//		- preko 20 godina 0.1
	
	public double minuliRad () {
		if(this.godineRadnogStaza < 10) {
			 return  0.05;
		} else if(this.godineRadnogStaza >= 10 && this.godineRadnogStaza < 20) {
			return 0.075;
		}	else if(this.godineRadnogStaza >= 20) {
			return 0.1;
		} return 0;
	}	public double koeficijent() {
		if(this.stepenStrucneSpreme == 1) {
			return 1.03;
		} else if(this.stepenStrucneSpreme == 2) {
			return 1.65;
		} else if(this.stepenStrucneSpreme == 3) {
			return 2.00;
		} else if(this.stepenStrucneSpreme == 4) {
			return 2.27;
			
		} else if(this.stepenStrucneSpreme == 5) {
			return 2.88;
		}else if(this.stepenStrucneSpreme == 6) {
			return 3.09;
			
		}else if(this.stepenStrucneSpreme == 7) {
			return 3.40;
			
		}else if(this.stepenStrucneSpreme == 8) {
			return 4.12;
			
		} return 0;
		
		
	}  public double plataRadnika() {
		return 25000 + (this.koeficijent() + this.minuliRad()) * 10000;
		
	
		
	} public boolean kreditnoSposoban() {
		if(this.plataRadnika() > 50000 ) {
			return true;
		} else {
			return false;
		}
	}
			
			
			
		
	//metodu koja racuna platu radnika, plata se racuna po formuli:
//		25000 + (koeficijent slozenosti + minuli rad) * 10000

	//metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
	
	
		



}