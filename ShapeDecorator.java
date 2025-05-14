
public class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    @Override
    public String toSvg() {
        return decoratedShape.toSvg();
    }

    @Override
    public String toSvg(String param) {
        return decoratedShape.toSvg(param);
    }

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
}
