/**
 * Created by OOussema on 02/10/2016.
 */
public abstract class Shape2D extends Shape implements Translatable2D {

    protected Point2D refPoint;

    abstract double perimeter();

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }
}
