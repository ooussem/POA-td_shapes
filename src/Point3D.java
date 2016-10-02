/**
 * Created by OOussema on 02/10/2016.
 */
public class Point3D extends Point2D {
    protected double z;

    public Point3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public Point3D(){
        this(0,0,0);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    void translate(double dx, double dy, double z) {
        super.translate(dx, dy);
        this.z += z;
    }

    @Override
    boolean isOrigin() {
        return this.z == 0 && super.isOrigin();
    }


    double distance(Point3D otherP) {
        double dx = this.x - otherP.x;
        double dy = this.y - otherP.y;
        double dz = this.z - otherP.z;

        return Math.sqrt(dx*dx+dy*dy+dz*dz);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.z;
    }

    @Override
    public void affiche() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        boolean result = (this.getClass().getName().equals(o.getClass().getName()));
        if(result)
            return (this.x == ((Point3D)o).x && this.y == ((Point3D)o).y && this.z == ((Point3D)o).z);
        else
            return false;
    }
}
