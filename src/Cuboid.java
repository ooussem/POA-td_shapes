/**
 * Created by OOussema on 04/10/2016.
 */

public class Cuboid extends Shape3D{
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cuboid() {
        this(0,0,0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double surface() {
        return 2*(this.length*this.height+this.length*this.width
        +this.height*this.width);
    }

    @Override
    protected double volume() {
        return (this.length*this.height*this.width);
    }
}
