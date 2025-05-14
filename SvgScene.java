import java.util.ArrayList;

public class SvgScene {
    private double width, height;
    private ArrayList<Shape> shapes;

    public SvgScene(double width, double height) {
        this.width = width;
        this.height = height;
        shapes = new ArrayList<>();
    }

    public SvgScene() {
        shapes = new ArrayList<>();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String toSvg(){
        String beginning = "<svg height=\"" + height +
                "\" width=\"" + width +
                "\" xmlns=\"http://www.w3.org/2000/svg\">\n";
        String middle = "";
        for(Shape s : shapes){
            middle +="\t" + s.toSvg() + "\n";
        }

        String ending = "</svg>\n";
        return beginning + middle + ending;
    }
}
