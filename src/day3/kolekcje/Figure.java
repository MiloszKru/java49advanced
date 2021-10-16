package day3.kolekcje;

public abstract class Figure implements Comparable<Figure> {


    public abstract double calculateArea();

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.calculateArea(), o.calculateArea());
    }
}
