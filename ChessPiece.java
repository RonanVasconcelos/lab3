package CornerstoneClasses.Lab3;

import java.util.Objects;

public abstract class ChessPiece {
    private int value; // Instance variable


    // accessor (getter) and a mutator (seter)
    public ChessPiece(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



    //this class also has an abstract method called move()
    public abstract void move(); //abstract classes doesn't have body because children classes implement this

    //the ChessPeice class must override the equals() method(and there also the hashcode() method)
    @Override
    public boolean equals(Object objectInstance) {
        if(this == objectInstance){
            return true;
        }
        if(objectInstance == null || getClass() != objectInstance.getClass()){
            return false;
        }
        ChessPiece that = (ChessPiece) objectInstance;
        return value == that.value;
    }

    //override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    //The ChessPiece class overrides the toString() method.
    @Override // poe "to" to generate the Override toString
    public String toString() {
        return "ChessPiece{value=" + value + "}"; //convention
    }
}
