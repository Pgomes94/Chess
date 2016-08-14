import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Queen extends Piece {
	public Queen(int c) {
		super(c);
	}

	public List<Cell> getMoves(int row, int col,
			HashMap<Cell, Piece> board) {
		List<Cell> moves = new ArrayList<>();
		Cell c;
		int possibleRow, possibleCol;

		// BISHOP MOVES
		possibleRow = row + 1;
		possibleCol = col + 1;
		while (possibleRow < 9 && possibleCol < 9) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleRow++;
			possibleCol++;
		}

		possibleRow = row + 1;
		possibleCol = col - 1;
		while (possibleRow < 9 && possibleCol > 0) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleRow++;
			possibleCol--;
		}

		possibleRow = row - 1;
		possibleCol = col + 1;
		while (possibleRow > 0 && possibleCol < 9) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleRow--;
			possibleCol++;
		}

		possibleRow = row - 1;
		possibleCol = col - 1;
		while (possibleRow > 0 && possibleCol > 0) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleRow--;
			possibleCol--;
		}

		// ROOK MOVES
		possibleRow = row + 1;
		possibleCol = col;
		while (possibleRow < 9) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleRow++;
		}

		possibleRow = row - 1;
		possibleCol = col;
		while (possibleRow > 0) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleRow--;
		}

		possibleRow = row;
		possibleCol = col + 1;
		while (possibleCol < 9) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleCol++;
		}

		possibleRow = row;
		possibleCol = col - 1;
		while (possibleCol > 0) {
			if (isValidMove(possibleRow, possibleCol, board)) {
				c = new Cell(possibleRow, possibleCol);
				moves.add(c);
				if (board.get(c) != null)
					break;
			} else
				break;
			possibleCol--;
		}

		return moves;
	}

}
