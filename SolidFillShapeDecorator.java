public class SolidFillShapeDecorator extends ShapeDecorator{

    String color;


    public SolidFillShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    public String toSvg()    {
        return decoratedShape.toSvg("style=\"fill:" + color +
                "\"");
    }
}
