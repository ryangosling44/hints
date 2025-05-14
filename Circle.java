public class Circle extends Ellipse{
    public Circle(Style gangnam, Point center, double r) {
        super(gangnam, center, r, r);
    }

    public Circle(Point center, double r) {
        super(center, r, r);
    }

    public Circle() {
    }
}
