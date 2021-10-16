package advanced.homework.points;

public class PointMain {
    public static void main(String[] args) {


        Point2D pointOne = new Point2D(2.2f, 5.6f);
        Point2D pointTwo = new Point2D(4.4f, 6.6f);
        pointTwo.setXY(3.3f, 4.4f);
        System.out.println(pointTwo);

        Point3D pointThree = new Point3D(1.1f, 2.2f, 3.3f);
        Point3D pointFour = new Point3D(5.5f, 5.5f, 7.8f);

        System.out.println(pointOne.toString());
        System.out.println(pointThree.toString());


    }
}
