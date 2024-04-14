public class E10_3 {
    public static void main(String[] args){
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10,30.5);
        System.out.printf("%.2f",MyPoint.distance(a,b));
    }
}

//二维点类
class MyPoint {
    private final double x, y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this(0, 0);
    }


    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static double distance(MyPoint point1, MyPoint point2) {
        return distance(point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }

    public double distance(MyPoint point) {
        return distance(this.getX(), this.getY(), point.getX(), point.getY());
    }

    public double distance(double x, double y) {
        return distance(this.getX(), this.getY(), x, y);
    }

}