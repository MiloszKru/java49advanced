package advanced.homework.points;

public class Line {

    public static void main(String[] args) {

        Line line = new Line(1,2,5,6);
        System.out.println(line.getineLength());
        System.out.println(line.getLineMiddle());
    }

    private Point2D point1;
    private Point2D point2;

    public Line(Point2D point, Point2D point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Line(float point1Start, float point1End, float point2Start, float point2End){
        this.point1 = new Point2D(point1Start, point1End);
        this.point2 = new Point2D(point2Start, point2End);
    }

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public float getineLength(){
        return (float) Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
    }

    public Point2D getLineMiddle(){
        float xMiddle = (point1.x + point2.x) / 2;
        float yMiddle = (point1.y + point2.y) / 2;
        return new Point2D(xMiddle, yMiddle);
    }
}
