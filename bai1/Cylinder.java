package bai1;
public class Cylinder extends Circle{
    private double high;

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public void getVolumeCylinder() {
        double area = 2*Math.PI*getRadius()*(getRadius()+high);
        System.out.println("Dien tich hinh tru la: "+area);
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString()+
                "high=" + high +
                '}';
    }
}
