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

    @Test(enabled = false)
    public void testGetX() throws Exception {

    }

    @Test
    public void testSetX() throws Exception {
        Point2D point = new Point2D(2,3);
        point.setX(3); point.setX(4);


    }

    @Test(enabled = false)
    public void testGetY() throws Exception {

    }

    @Test(enabled = false)
    public void testSetY() throws Exception {

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

    @Test(enabled = false)
    public void testToString() throws Exception {

    }

    @Test(enabled = false)
    public void testAffiche() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {
        Point2D point = new Point2D(2,3);
        Point2D point2 = new Point2D(4,5);

        assertEquals(false, point.equals(point2));
    }

}