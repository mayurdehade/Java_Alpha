package org.alpha.interfaces;

class Queen implements ChessPlayer{

	@Override
	public void moves() {
		System.out.println("up, down, left, right, diagonal (in all direction)");
	}
	
}

class Rook implements ChessPlayer{

	@Override
	public void moves() {
		System.out.println("up, down, left, right");
	}
	
}

class King implements ChessPlayer{

	@Override
	public void moves() {
		System.out.println("up, down, left, right, diagonal (by one step)");
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		Queen q = new Queen();
		q.moves();
		
		King k = new King();
		k.moves();
	}
}
