/**
 * Created by OOussema on 04/10/2016.
 */

public class Sphere extends Shape3D {

    private double radius;

    public Sphere() {
        this(0);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double surface() {
        return 0;
    }

    @Override
    protected double volume() {
        return (Math.PI*4*Math.pow(this.radius,3))/3;
    }
}
