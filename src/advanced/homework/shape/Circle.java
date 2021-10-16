package advanced.homework.shape;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        this.color = "unknown";
        this.isFilled = false;
        this.radius = 1;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius =%f which is a subclass of %s", radius, super.toString());
    }
}
