public abstract class GeometricObject implements Comparable<GeometricObject>{
    private boolean filled;
    private String color;

    public GeometricObject(boolean filled, String color) {
        this.color = color;
        this.filled = filled;
    }

    public GeometricObject() {
        this(false, "black");
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public int compareTo(GeometricObject geometricObject){
        return Double.compare(this.getArea(), geometricObject.getArea());
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Triangle extends GeometricObject implements Cloneable {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, boolean filled, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setFilled(filled);
        this.setColor(color);
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        this(1, 1, 1);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2d;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public String toString() {
        return "Triangle:\nside1:" + side1 +
                "\nside2:" + side2 +
                "\nside3:" + side3;
    }
}

//正n边形类
class RegularPolygon extends GeometricObject implements Cloneable{

    //n:边数 side:边长 x:中心点x坐标 y:中心点y坐标
    public int n;
    double side, x, y;

    //构造方法
    public RegularPolygon(int n, double side, double x, double y) {
        this.setN(n);
        this.setSide(side);
        this.setX(x);
        this.setY(y);
    }

    public RegularPolygon() {
        this(3, 1, 0, 0);
    }

    public RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n >= 3) {
            this.n = n;
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //返回周长
    public double getPerimeter() {
        return side * n;
    }

    //返回面积
    public double getArea() {
        return (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass()) {
            return false;
        } else {
            return this.getN() == ((RegularPolygon) o).getN()
                    & this.getSide() == ((RegularPolygon) o).getSide()
                    & this.getX() == ((RegularPolygon) o).getX()
                    & this.getY() == ((RegularPolygon) o).getY();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
