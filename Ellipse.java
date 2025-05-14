
public class Ellipse implements Shape{
    private Point center;

    private double rx, ry;

    public Ellipse(){}
    public Ellipse(Style gangnam, Point center, double rx, double ry) {
        //super(gangnam);
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    public Ellipse(Point center, double rx, double ry) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String toSvg() {
        return toSvg("");
    }

    @Override
    public String toSvg(String param) {
        return
                "  <ellipse rx=\"" + rx +
                        "\" ry=\"" + ry +
                        "\" cx=\"" + center.getX() +
                        "\" cy=\"" + center.getY() +
                        "\"\n" +
                        "" + param +
                        " />\n";
    }
}
