import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    }

    @Test
    public void testSetX() throws Exception {

    }

    @Test
    public void testGetY() throws Exception {

    }

    @Test
    public void testSetY() throws Exception {

    }

    @Test
    public void testTranslate() throws Exception {
        /*Point2D point = new Point2D(2,3);
        Point2D point2 = new Point2D(4,5);

        assertEquals(point2,point.translate(2,2));
*/
    }



    @Test
    public void testIsOrigin() throws Exception {

    }

    @Test
    public void testDistance() throws Exception {
        Point2D point = new Point2D(2,3);
        Point2D point2 = new Point2D(4,5);

        assertEquals(point.distance(point2),4);
    }

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void testAffiche() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {

    }

}