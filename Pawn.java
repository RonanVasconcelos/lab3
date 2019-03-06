package CornerstoneClasses.Lab3;

import java.util.Objects;

public class Pawn extends ChessPiece {
    //the Pawn class must contain thow new instance variables
    private boolean hasbenPromoted;
    private ChessPiece newPiece;


    //constructor
    public Pawn(){
        super(1);
        this.hasbenPromoted = false;
    }

    //each of the six subclasses also implements the move() method
    @Override // apenas poe o "mo" de move e da enter para aparecer o cod
    public void move() {
        System.out.println("forward 1");
    }


    //in the game of chess, when a Pawn reaches the far side of the board, it is exchanged
    //for another ChessPiece; for example, a Pawn can become a Rook, or a Queen, etc...
    //it cannot become a King or Pawn though. Enforce these rules in a new method called
    //public void promote(Chess newPiece)
    public void promote(ChessPiece newPiece){
        if(hasbenPromoted == true){
            System.out.println("already been promoted!");
            return;
        }
        if(newPiece.getValue() == 1000 || newPiece.getValue() == 1){
            System.out.println("Invalid promotion!");
            System.out.println("You cannot promote to a King or Pawn.");
            return;
        }
        this.newPiece = newPiece;
        hasbenPromoted = true;
        System.out.println("Promoted to "+ newPiece);
    }


    //override the equals() method of the Pawn class so that Pawns are NOT equal if one
    //has been promoted and another has not. Pawns are also NOT equal if theu have been
    //promoted to different ChessPiece types.
    @Override
    public boolean equals(Object objectInstance) {
        if(this == objectInstance){
            return true;
        }
        if(objectInstance == null || getClass() != objectInstance.getClass()){
            return false;
        }
        if(super.equals(objectInstance)){
            return false;
        }
        Pawn pawn = (Pawn) objectInstance;
        return hasbenPromoted == pawn.hasbenPromoted && Objects.equals(newPiece, pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    //each of ChessPiece subclasses overrides the toString() method.
    @Override
    public String toString() {
        return "Pawn {"+ "has been promoted"+ hasbenPromoted + "to new Piece= " +newPiece +"}";
    }

}

