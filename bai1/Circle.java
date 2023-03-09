package bai1;
public class Circle {
    private double radius;
    private String color;
    private double areaCircle;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAreaCircle() {
        return areaCircle;
    }

    public void setAreaCircle(double areaCircle) {
        this.areaCircle = areaCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", areaCircle=" + areaCircle +
                '}';
    }
}
