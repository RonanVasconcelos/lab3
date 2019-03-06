package CornerstoneClasses.Lab3;

public class King extends ChessPiece{ //Inheritance (ChessPiece subclass)

    public King(){
        super(1000); //you should put an Integer here because of ChessPiece
    }

    //each of the six subclasses also implements the move() method to print
    @Override
    public void move() {
        System.out.println("one Square");
    }

    //each of ChessPiece subclasses overrides the toString() method.
    @Override
    public String toString() {
        return "King{value=1000}";
    }
}
