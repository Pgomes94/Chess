import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Board {
	
	HashMap<Cell, Piece> board;
	
	public Board() {
		this.board = initBoard();
	}
	
	private HashMap<Cell, Piece> initBoard() {
		HashMap<Cell, Piece> board = new HashMap<>();
		
		for(int i=1; i < 9; i++) {
			board.put(new Cell(2,i), new Pawn(1));
			board.put(new Cell(7,i), new Pawn(-1));
		}
		
		// init white pieces
		board.put(new Cell(1,1), new Rook(1));
		board.put(new Cell(1,8), new Rook(1));
		
		board.put(new Cell(1,2), new Knight(1));
		board.put(new Cell(1,7), new Knight(1));
		
		board.put(new Cell(1,3), new Bishop(1));
		board.put(new Cell(1,6), new Bishop(1));
		
		board.put(new Cell(1,4), new Queen(1));
		board.put(new Cell(1,5), new King(1));
		
		// init black pieces
		board.put(new Cell(1,1), new Rook(-1));
		board.put(new Cell(1,8), new Rook(-1));
		
		board.put(new Cell(1,2), new Knight(-1));
		board.put(new Cell(1,7), new Knight(-1));
		
		board.put(new Cell(1,3), new Bishop(-1));
		board.put(new Cell(1,6), new Bishop(-1));
		
		board.put(new Cell(1,4), new Queen(-1));
		board.put(new Cell(1,5), new King(-1));
		
		return board;
	}
	
	/*
	 * Returns the position of all pieces for a player
	 */
	public List<Cell> getAllPositions(int player) {
		List<Cell> allPieces = new ArrayList<>();
		Set<Cell> cells = this.board.keySet();
		for (Cell c : cells) {
			Piece p = this.board.get(c);
			if (p.color == player) {
				allPieces.add(c);
			}
		}
		return allPieces;
	}
	
	/*
	 * Returns all the moves of the piece located in spot C
	 */
	public List<Cell> getMoves(Cell c) {
		if (!this.board.containsKey(c)) {
			return null;
		}
		int row = c.row;
		int col = c.column;
		Piece p = this.board.get(c);
		return p.getMoves(row, col, board);
	}
}
