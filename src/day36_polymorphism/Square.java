package day36_polymorphism;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) { // since there's one equals m in the Object class, parameter here is Object, you acn assign any obj to the var aobj
        if (!(obj instanceof Square)) {
            System.err.println("Invalid");
            System.exit(1);
        }

        if (side == ((Square)obj).side){ // downcasting from Obj to Square
            return true;
        }
        return false;
    }
}

