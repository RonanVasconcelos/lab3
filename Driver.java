package CornerstoneClasses.Lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        //1. Initialize 6 ChessPieces
        ChessPiece cp1 = new Bishop();
        ChessPiece cp2 = new King();
        ChessPiece cp3 = new Knight();
        ChessPiece cp4 = new Pawn();
        ChessPiece cp5 = new Queen();
        ChessPiece cp6 = new Rook();

        //2. Add all pieces to ArrayList
        ArrayList<ChessPiece> pieces = new ArrayList<>();
        pieces.add(cp1);
        pieces.add(cp2);
        pieces.add(cp3);
        pieces.add(cp4);
        pieces.add(cp5);
        pieces.add(cp6);

        //3. Test move() method on every piece.
        for(ChessPiece piece: pieces){
            System.out.println(piece + ": ");
            piece.move();
        }

        //4. Test Pawn promotion
        ((Pawn) cp4).promote(cp2); // cannot be promoted

        Pawn newPawn = new Pawn();
        System.out.println(newPawn.equals(cp4)); // still the same Pawn

        ((Pawn) cp4).promote(cp3); // can be promoted to
        System.out.println(newPawn.equals(cp4)); //should
    }
}
