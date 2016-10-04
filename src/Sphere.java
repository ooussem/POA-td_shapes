/**
 * Created by OOussema on 04/10/2016.
 */

public class Sphere extends Shape3D {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Sphere() {
        this(0);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double surface() {
        return (4*Math.PI*this.radius*this.radius);
    }

    @Override
    protected double volume() {
        return (Math.PI*4*Math.pow(this.radius,3))/3;
    }
}
