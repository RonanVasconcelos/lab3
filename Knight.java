package CornerstoneClasses.Lab3;

public class Knight extends ChessPiece {
    //constructor
    public Knight(){
        super(2);
    }

    //each of the six subclasses also implements the move() method
    @Override
    public void move() {
        System.out.println("like an L");
    }

    //each of ChessPiece subclasses overrides the toString() method.
    @Override
    public String toString() {
        return "Knight{value=2}";
    }
}
