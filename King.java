import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class King extends Piece {

	boolean moved;
	boolean rightCastle;
	boolean leftCastle;
	
	public King(int c) {
		super(c);
		this.moved = false;
		this.rightCastle = false;
		this.leftCastle = false;
	}

	int color; 
	
	/*
	 * TODO: Castling added, make sure that when the king moves two squares the rook is also moved.
	 */
	public List<Cell> getMoves(int row, int col,
			HashMap<Cell, Piece> board) {
		List<Cell> moves = new ArrayList<>();

		for (int i = row - 1; i < row + 2; i++) {
			for (int j = col - 1; j < col + 2; j++) {
				if (isValidMove(i, j, board)) {
					moves.add(new Cell(i, j));
				}
			}
		}
		
		if (!moved) {
			// Check if long castle is available.
			Cell q = new Cell(row, col - 1);
			Cell b = new Cell(row, col - 2);
			Cell k = new Cell(row, col - 3);
			if (!board.containsKey(q) && !board.containsKey(b) 
					&& !board.containsKey(k)) {
				try {
					Rook rook = (Rook) board.get(new Cell(row, col - 4));
					if(!rook.moved) 
						moves.add(new Cell(row, col - 2));
				} catch(Exception e) { } // pass
			}
			
			// Check if short castle is available.
			b = new Cell(row, col + 1);
			k = new Cell(row, col + 2);
			if (!board.containsKey(b) && !board.containsKey(k)) {
				try {
					Rook rook = (Rook) board.get(new Cell(row, col + 3));
					if(!rook.moved)
						moves.add(new Cell(row, col + 2));
				} catch(Exception e) { } // pass
			}
		}
		
		return moves;
	}

}
