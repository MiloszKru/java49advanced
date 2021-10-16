package advanced.homework.shape;

public class ShapeMain {

    public static void main(String[] args) {

        Shape circle1 = new Circle("blue",false,1.21);
        System.out.println(circle1);

        Shape rectangle1 = new Rectangle("green",true,2.2,4.5 );
        System.out.println(rectangle1);

        Shape square1 = new Square("yellow", false, 2.1);
        System.out.println(square1);

        System.out.println("-------------------------------------------");

        Shape[] shapesEx4 = {
                new Circle("yellow", true,1.3),
                new Rectangle("black", false, 21.2,25.6),
                new Square("pink", true,20)
        };
        for (Shape shape : shapesEx4) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());

        }
    }
}
