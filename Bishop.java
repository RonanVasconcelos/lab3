package CornerstoneClasses.Lab3;

public class Bishop extends ChessPiece {
    //constructor
    public Bishop(){
        super(3);
    }

    //each of the six subclasses also implements the move() method
    @Override
    public void move() {
        System.out.println("diagonally");
    }
    //each of ChessPiece subclasses overrides the toString() method.
    @Override
    public String toString() {
        return "Bishop{value=3}";
    }
}
