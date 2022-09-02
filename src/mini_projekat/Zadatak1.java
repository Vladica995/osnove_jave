package mini_projekat;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		Player x = new Player("Vladica Stevanovic");
		Player o = new Player("Petar Petrovic");
		XandOfGame xo = new XandOfGame(x, o);
		System.out.println("Pocinje partija XO izmedju igraca: ");
		System.out.print("X: ");
		x.print();
		System.out.print("O: ");
		o.print();

		while (xo.isWinnerX() == false && xo.isWinnerO() == false && xo.isGameOver() == false) {
			xo.startGame();
			xo.makeAMove(0);
			xo.playNext();
			xo.makeAMove(3);
			xo.playNext();
			xo.makeAMove(1);
			xo.playNext();
			xo.makeAMove(4);
			xo.playNext();
			xo.makeAMove(6);
			xo.playNext();
			xo.makeAMove(5);

			xo.stampaj();

		} if(xo.isWinnerX() == true) {
		System.out.println("Pobednik je igrac: ");
		x.print();
		
		} else if(xo.isWinnerO() == true) {
			System.out.println("Pobednik je igrac: ");
			o.print();
			
		} xo.gameScore();
		System.out.println(xo.gameScore());
		System.out.println();
		System.out.println("Pocinje partija XO izmedju igraca: ");
		System.out.print("X: ");
		x.print();
		System.out.print("O: ");
		o.print();
		xo.startGame();
		while (xo.isGameOver() == false) {
			xo.startGame();
			xo.makeAMove(3);
			xo.playNext();
			xo.makeAMove(8);
			xo.playNext();
			xo.makeAMove(1);
			xo.playNext();
			xo.makeAMove(6);
			xo.playNext();
			xo.makeAMove(2);
			xo.playNext();
			xo.makeAMove(0);
			xo.playNext();
			xo.makeAMove(4);
			xo.playNext();
			xo.makeAMove(5);
			xo.playNext();
			xo.makeAMove(7);
			xo.stampaj();
		} if(xo.isWinnerX() == true) {
			System.out.println("Pobednik je igrac: ");
			x.print();
			
			} else if(xo.isWinnerO() == true) {
				System.out.println("Pobednik je igrac: ");
				o.print();
		

	} else {
		System.out.println("Rezultat je neresen.");
	}

	}
}
