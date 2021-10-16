package advanced.homework.shape;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double width) {
        super(color, isFilled, width, width);
    }

    @Override
    public String toString() {
        return String.format("Square with width =%f which is a subclass of %s", width, super.toString());
    }
}
