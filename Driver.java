package CornerstoneClasses.Lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ChessPiece king = new King();
        ChessPiece queen = new Queen();
        ChessPiece knight = new Knight();
        ChessPiece bishop = new Bishop(); 
        ChessPiece rook = new Rook();
        ChessPiece pawn = new Pawn();        

        ArrayList<ChessPiece> pieces = new ArrayList<>();
        pieces.add(king);
        pieces.add(queen);
        pieces.add(knight);
        pieces.add(bishop);
        pieces.add(rook);
        pieces.add(pawn);

        for(ChessPiece piece: pieces){
            System.out.println(piece + ": ");
            piece.move();
        }

        ((Pawn) pawn).promote(rook); 

        Pawn newPawn = new Pawn();
        System.out.println(newPawn.equals(rook)); 

        ((Pawn) bishop).promote(rook); 
        System.out.println(newPawn.equals(queen));
    }
}
