import java.awt.*;

/**
 * Created by OOussema on 02/10/2016.
 */
public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0,0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    void translate(double dx, double dy)
    {
        this.x += dx;
        this.y += dy;
    }

    boolean isOrigin()
    {
        return this.x == 0 && this.y == 0;
    }

    double distance(Point2D otherP)
    {
        double dx = this.x - otherP.x;
        double dy = this.x - otherP.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString()
    {
        String str = "Point de la class " + this.getClass().getName();
        str += "de coordonnée : (" +this.x+ ", " +this.y + ")";

        return str;
    }

    public void affiche(String str)
    {
        System.out.println(str);
    }

    @Override
    public boolean equals(Object o)
    {
        boolean result = (this.getClass().getName().equals(o.getClass().getName()));
        if(result)
            return (this.x == ((Point2D)o).x && this.y == ((Point2D)o).y);
        else
            return false;
    }

}
