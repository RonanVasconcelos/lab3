package CornerstoneClasses.Lab3;

public class Rook extends ChessPiece {
    //constructor
    public Rook(){
        super(5);
    }

    //each of the six subclasses also implements the move() method
    @Override
    public void move() {
        System.out.println("horizontally or vertically");
    }

    //each of ChessPiece subclasses overrides the toString() method.
    @Override
    public String toString() {
        return "Rook{value=5}";
    }
}
