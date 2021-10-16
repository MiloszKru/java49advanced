package day2.model;

public class Trapeze extends Figure {
    private double a, b, h;


    public Trapeze(double a, double b, double h) {
        if (a < 0 || b < 0 || h < 0) {
            throw new IllegalArgumentException("Nie da się utworzyć trapezu z ujemnym bokiem lub wysokością");
        }
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double calculateSurface() {
        return 0.5 * (a + b) * h;
    }


}
