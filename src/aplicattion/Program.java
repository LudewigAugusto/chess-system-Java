package aplicattion;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
	
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			System.out.println();
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}

	}

}
