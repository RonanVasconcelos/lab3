package CornerstoneClasses.Lab3;

public class Queen extends ChessPiece {
    //constructor
    public Queen(){
        super(9);
    }

    //each of the six subclasses also implements the move() method
    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }

    //each of ChessPiece subclasses overrides the toString() method.
    @Override
    public String toString() {
        return "Queen{value=9}";
    }
}
