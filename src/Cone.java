/**
 * Created by OOussema on 03/10/2016.
 */
public class Cone extends Shape3D {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }



    public Cone() {
        this(0,0);
    }

    @Override
    protected double volume(){
        return ((Math.PI*this.radius*this.radius*this.height)/3);
    }

    @Override
    double surface() {
        return ((Math.PI*this.radius)*Math.sqrt(this.height*this.height + this.radius*this.radius));
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
