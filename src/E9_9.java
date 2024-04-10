public class E9_9 {
    public static void main(String[] args) {
        RegularPolygon a = new RegularPolygon(114, 514);
        System.out.println(a.getArea());
    }
}

//正n边形类
class RegularPolygon {

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
}