import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Chess {

	public static void main(String args[]) throws IOException {

		Board b = new Board();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Cell c;
		int turn = 1;
		final String WHITE = "White";
		final String BLACK = "Black";
		String side;

		Map<Character, Integer> letterToNum = new HashMap<>();
		letterToNum.put('A', 1);
		letterToNum.put('B', 2);
		letterToNum.put('C', 3);
		letterToNum.put('D', 4);
		letterToNum.put('E', 5);
		letterToNum.put('F', 6);
		letterToNum.put('G', 7);
		letterToNum.put('H', 8);
		letterToNum = Collections.unmodifiableMap(letterToNum);

		Set<Character> validPieces = new HashSet<>();
		validPieces.add('P'); // pawn
		validPieces.add('R'); // rook
		validPieces.add('N'); // knight
		validPieces.add('B'); // bishop
		validPieces.add('Q'); // queen
		validPieces.add('K'); // knight
		validPieces = Collections.unmodifiableSet(validPieces);

		int row, column;
		char piece;

		/*
		 * while loop for the game
		 */
		do {
			if (turn == 1) {
				side = WHITE;
			} else {
				side = BLACK;
			}
			try {
				System.out.format("%s\'s Turn.\n", side);
				System.out.println("Enter what piece you are moving.");
				piece = in.readLine().charAt(0);
				if (!validPieces.contains(piece)) {
					System.out.println("Not a valid piece, try again.");
					continue;
				}
				System.out.println("Enter row to move to (A-H).");
				row = letterToNum.get(in.readLine().charAt(0));
				System.out.println("Enter column to move to (1-8).");
				column = Integer.parseInt(in.readLine());
				if (column < 1 || column > 8) {
					System.out
							.println("Column should be between 1 and 8. Try again.");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("Only enter integers. Try again.");
				continue;
			} catch (NullPointerException e) {
				System.out.println("Only enter letters from A-H. Try again.");
				continue;
			}
			List<Cell> allPieces = b.getAllPositions(turn);
			switch (piece) {
			case 'P': 
				// getPieces();
				break;
			case 'R':
				break;
			case 'N':
				break;
			case 'B':
				break;
			case 'Q':
				break;
			case 'K':
				break;
			}

			turn = turn * -1;
		} while (true);
	}

	private static void helpMenu() {
		// print useful shit
	}

}
