package mini_projekat;

import java.util.ArrayList;

public class XandOfGame extends Player {
//	Kreirati klasu XandOGame koja ima:
//		table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//		nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//		playerX - igrac X
//		playerO - igrac O
//		Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//		Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//		gettere i settere za igrace
//		Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//		x | x | 0 |
//		0 | x | 0 |
//		x | 0 | x |
	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private  Player playerO;
	public XandOfGame() {
		super();
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}
	public XandOfGame(Player playerX, Player playerO) {
		super();
		this.playerX = playerX;
		this.playerO = playerO;
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}
	public Player getPlayerX() {
		return playerX;
	}
	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}
	public Player getPlayerO() {
		return playerO;
	}
	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
	public void stampaj() {
		System.out.println(table.get(0) + " | " + table.get(1) + " | " + table.get(2) + " | ");
		System.out.println(table.get(3) + " | " + table.get(4) + " | " + table.get(5) + " | ");
		System.out.println(table.get(6) + " | " + table.get(7) + " | " + table.get(8) + " | ");
			
		}
//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.
//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x
	public void startGame() {
		table.set(0, " ");
		table.set(1, " ");
		table.set(2, " ");
		table.set(3, " ");
		table.set(4, " ");
		table.set(5, " ");
		table.set(6, " ");
		table.set(7, " ");
		table.set(8, " ");
		this.nextPlayer = "x";
	
		
	}
	public boolean isGameOver() {
		for (int i = 0; i <table.size(); i++) {
			if(table.get(i).equals("x") || table.get(i).equals("o")) {
				return true;
			}
				
			} return false;
			
		}
	
		public boolean isFieldFree(int pozicija) {
			for (int i = 0; i <table.size(); i++) {
				if(table.get(pozicija).equals("x") || table.get(pozicija).equals("o")) {
					return false;
				}
																// 0 1 2 
																// 3 4 5
																// 6 7 8
			} return true;
			
		} //	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
			public void playNext() {
				if(this.nextPlayer.equals("x")) {
					this.nextPlayer = "o";
				} else if(this.nextPlayer.equals("o")) {
					this.nextPlayer = "x";
				}
			} //	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
			public void makeAMove(int pozicija) {
				table.set(pozicija, this.nextPlayer);
			}
			public boolean isWinnerX() {
				if(table.get(0).equals("x") && table.get(1).equals("x") && table.get(2).equals("x")) {
					return true;
				} else if(table.get(0).equals("x") && table.get(3).equals("x") && table.get(6).equals("x")) {
					return true;
				} else if(table.get(3).equals("x") && table.get(4).equals("x") && table.get(5).equals("x")) {
					return true;
				} else if(table.get(6).equals("x") && table.get(7).equals("x") && table.get(8).equals("x")) {
					return true;
				} else if(table.get(0).equals("x") && table.get(4).equals("x") && table.get(8).equals("x")) {
					return true;
				} else if(table.get(6).equals("x") && table.get(4).equals("x") && table.get(2).equals("x")) {
					return true;
				} else {
					return false;
				}
				
					
				}
					public boolean isWinnerO() {
						if(table.get(0).equals("o") && table.get(1).equals("o") && table.get(2).equals("o")) {
							return true;
						} else if(table.get(0).equals("o") && table.get(3).equals("o") && table.get(6).equals("o")) {
							return true;
						} else if(table.get(3).equals("o") && table.get(4).equals("o") && table.get(5).equals("o")) {
							return true;
						} else if(table.get(6).equals("o") && table.get(7).equals("o") && table.get(8).equals("o")) {
							return true;
						} else if(table.get(0).equals("o") && table.get(4).equals("o") && table.get(8).equals("o")) {
							return true;
						} else if(table.get(6).equals("o") && table.get(4).equals("o") && table.get(2).equals("o")) {
							return true;
						} else {
							return false;
						}
						
							
						}
						public boolean isValidMove(int pozicija) {
							if(pozicija >= 0 || pozicija <=8) {
								return true;
							} else {
								return false;
							}
						} public int gameScore() {
							if(this.isWinnerX() == true) {
								return 1;
							} else if(this.isWinnerO() == true) {
								return 2;
							} return 0;
						}
						
					}
			
	

	






//Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz
//i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o





		
			
			
			
			
			
				
			
		
			
			
			
		
	
	
	
	


