import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Knight extends Piece {
	public Knight(int c) {
		super(c);
	}

	public List<Cell> getMoves(int row, int col, int color,
			HashMap<Cell, Piece> board) {
		List<Cell> moves = new ArrayList<>();
		int possibleRow, possibleCol;

		possibleRow = row + 2;
		possibleCol = col + 1;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		possibleRow = row + 2;
		possibleCol = col - 1;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		possibleRow = row - 2;
		possibleCol = col + 1;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		possibleRow = row - 2;
		possibleCol = col - 1;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		possibleRow = row + 1;
		possibleCol = col + 2;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		possibleRow = row - 1;
		possibleCol = col + 2;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		possibleRow = row + 1;
		possibleCol = col - 2;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		possibleRow = row - 1;
		possibleCol = col - 2;
		if (isValidMove(possibleRow, possibleCol, board)) {
			moves.add(new Cell(possibleRow, possibleCol));
		}

		return moves;

	}

}
