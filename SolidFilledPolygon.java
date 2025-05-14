
import java.util.ArrayList;

public class SolidFilledPolygon extends Polygon{
    private String color;
    public SolidFilledPolygon(ArrayList<Point> points, String color) {
        super(points);
        this.color = color;
    }
    @Override
    public String toSvg(String param) {
        return super.toSvg("style=\"fill:" + color +
                "\"");

//        W klasie SolidFilledPolygon zdefiniuj metodę toSvg, która nadpisze metodę klasy nadrzędnej. Wewnątrz tej metody wywołaj metodę toSvg klasy nadrzędnej, przekazując jej jako parametr napis powstały ze sformatowania:
//"fill=\"%s\" %s "
//kolejno kolorem i parametrem napisowym.
    }
}
