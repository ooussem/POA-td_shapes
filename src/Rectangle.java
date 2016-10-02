/**
 * Created by OOussema on 02/10/2016.
 */
public class Rectangle extends Shape2D{

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(0,0);
    }

    @Override
    double perimeter() {
        return (double)((this.length+this.width) * 2);
    }

    @Override
    double surface() {
        return (double)this.length*this.width;
    }
}
