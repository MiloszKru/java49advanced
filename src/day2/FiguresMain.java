package day2;

import day2.model.*;
import day2.service.PaintSimulator;

public class FiguresMain {
    public static void main(String[] args) {

        Figure circle = new Circle(4);
        Figure rectangle = new Rectangle(4,5);
        Figure square = new Square(6);
        Figure trapeze = new Trapeze(4,5,-1);

        Figure[] figures = new Figure[]{circle, rectangle, square, trapeze};
        System.out.println(PaintSimulator.calculatePaintDemand(10, figures));

    }
}
