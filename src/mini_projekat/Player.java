package mini_projekat;

public class Player {

//Kreirati klasu Player koja ima:
//ime i prezime
//gettere i settere
//konstuktore
//metodu print, koja stampa ime i prezime igraca
protected String imeIPrezime;

public String getImeIPrezime() {
	return imeIPrezime;
}

public void setImeIPrezime(String imeIPrezime) {
	this.imeIPrezime = imeIPrezime;
}

public Player() {
	super();
}

public Player(String imeIPrezime) {
	super();
	this.imeIPrezime = imeIPrezime;
}
public void print() {
	System.out.println(this.imeIPrezime);
}


}
