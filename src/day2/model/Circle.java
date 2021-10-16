package day2.model;

public class Circle extends Figure {

    protected double radius;
    protected final double PI = Math.PI;

    public Circle(double radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Nie da się stworzyć okręgu z ujemnym promieniem");
        }

        this.radius = radius;
    }


    @Override
    public double calculateSurface() {
        return PI * Math.pow(radius,radius);
    }
}
