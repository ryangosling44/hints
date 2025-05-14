public class Style {
    private String fillColor;
    private String strokeColor;
    private double strokeWidth;

    public String getFillColor() {
        return fillColor;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public double getStrokeWidth() {
        return strokeWidth;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public Style(String fillColor, String strokeColor, double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public Style() {
    }
    public String toSvg(){
        return "style=\"fill:" +
                fillColor +
                ";stroke:" +
                strokeColor +
                ";stroke-width:" +
                strokeWidth;
    }
}
