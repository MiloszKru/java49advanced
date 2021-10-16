package day2.model;

public class Rectangle extends Figure {

    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Nie da się stworzyć prostokąta z ujemnym bokiem");
        }
        this.a = a;
        this.b = b;
    }


    @Override
    public double calculateSurface() {
        return a * b;
    }
}
