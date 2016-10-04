import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 02/10/2016.
 */
public class Point2DTest {
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetX() throws Exception {
        Point2D point2D = new Point2D(1,2);
        assertEquals(point2D.getX(),1,0.0);
    }

    @Test
    public void testGetY() throws Exception {
        Point2D point2D = new Point2D(1,2);
        assertEquals(point2D.getY(),2,0.0);
    }

    @Test
    public void testSetX() throws Exception {
        Point2D point2D = new Point2D(2,3);
        point2D.setX(0);
        assertEquals(point2D.getX(),0,0.0);
    }


    @Test
    public void testSetY() throws Exception {
        Point2D point2D = new Point2D(2,3);
        point2D.setY(9);
        assertEquals(point2D.getY(),9,0.0);
    }

    @Test
    public void testTranslate() throws Exception {
        Point2D point = new Point2D(2,3);
        point.translate(1,2);
    }

    @Test
    public void testIsOrigin() throws Exception {
        Point2D point = new Point2D(2,3);
        assertEquals(false, point.isOrigin());
    }

    @Test
    public void testDistance() throws Exception {
        Point2D point = new Point2D(2,3);
        Point2D point2 = new Point2D(4,5);

        assertEquals(2.8284271247461903,point2.distance(point));
    }

    @Test
    public void testToString() throws Exception {
        Point2D point = new Point2D(2,3);
        System.out.println(point.toString());
    }

    @Test
    public void testAffiche() throws Exception {
        Point2D point = new Point2D(2,3);
        point.affiche();
    }

    @Test
    public void testEquals() throws Exception {
        Point2D point = new Point2D(2,3);
        Point2D point2 = new Point2D(4,5);

        assertEquals(false, point.equals(point2));
    }

}