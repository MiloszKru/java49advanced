package day2.model;

public class Square extends Rectangle {


    public Square(double a) {

        super(a, a);
    }


    @Override
    public double calculateSurface() {
        return Math.pow(a,a);

    }
}

