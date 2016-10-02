/**
 * Created by OOussema on 02/10/2016.
 */
public abstract class Shape3D extends Shape{
    protected Point3D refPoint;

    protected abstract double volume();
    protected Point3D getRefPoint()
    {
        return new Point3D();
    }



}
