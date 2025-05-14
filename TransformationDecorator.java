public class TransformationDecorator extends ShapeDecorator {
    private String transformation;

    public TransformationDecorator(Shape decoratedShape, String transformation) {
        super(decoratedShape);
        this.transformation = transformation;
    }
    public String toSvg(){
        return this.toSvg();
    }
    public String toSvg(String param){
        return decoratedShape.toSvg(String.format("transform =\"%s\"", transformation));
    }
    public static class Builder{
        private String transformation = "";
        public Builder translate(Point p){
            transformation += String.format(" translate(%f %f) ", p.getX(),p.getY());
            return this;
        }
        public Builder rotate(float angle, Point center){
            transformation += String.format(" rotate(%f %f %f) ", angle, center.getX(),center.getY());
            return this;
        }
        public Builder scale(Point p){
            transformation += String.format(" scale(%f %f) ", p.getX(),p.getY());
            return this;
        }
        public TransformationDecorator build(Shape shape){
            return new TransformationDecorator(shape,transformation);
        }
    }
}
