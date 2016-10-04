import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 03/10/2016.
 */
public class ConeTest {


    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
    @Test
    public void testGetHeight() throws Exception {
        Cone cone = new Cone(3,3);
        assertEquals(cone.getHeight(),3,0.0);
    }

    @Test
    public void testSetHeight() throws Exception {
        Cone cone = new Cone(3,3);
        cone.setHeight(9);
        assertEquals(cone.getHeight(),9,0.0);
    }

    @Test
    public void testGetRadius() throws Exception {
        Cone cone = new Cone(3,7);
        assertEquals(cone.getRadius(),7,0.0);
    }

    @Test
    public void testSetRadius() throws Exception {
        Cone cone = new Cone(3,7);
        cone.setRadius(12);
        assertEquals(cone.getRadius(),12,0.0);
    }

    @Test
    public void testVolume() throws Exception {
        Cone c = new Cone(5,5);
        assertEquals(130.9, c.volume(), 0.3);
    }

    @Test
    public void testSurface() throws Exception {
        Cone c = new Cone(5,5);
        assertEquals(111.07207, c.surface(), 0.3);
    }

}