import java.util.HashMap;
import java.util.List;

abstract class Piece {
	
	int color;
	boolean lastToMove;
	
	public Piece(int c) {
		this.color = c;
		this.lastToMove = false;
	}
	
	public boolean isValidMove(int row, int col,
			HashMap<Cell, Piece> board) {
		if (row > 0 && row < 9) {
			if (col > 0 && col < 9) {
				Cell c = new Cell(row, col);
				if (board.get(c) == null || board.get(c).color == this.color * -1) {
					return true;
				}
			}
		}
		return false;
	}

	public List<Cell> getMoves(int row, int col,
			HashMap<Cell, Piece> board) {
		return null;
	}

}
