import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 04/10/2016.
 */
public class SphereTest {


    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    //Test sur Point3D refPoint à faire

    @Test
    public void testGetRadius() throws Exception {
        Sphere sp = new Sphere(5);
        assertEquals(sp.getRadius(),5,0.0);

    }

    @Test
    public void testSetRadius() throws Exception {
        Sphere sp = new Sphere(5);
        sp.setRadius(9);
        assertEquals(sp.getRadius(),9,0.0);
    }
    @Test
    public void testSurface() throws Exception {
        Sphere sp = new Sphere(2);
        assertEquals(sp.surface(),50.24,0.3);
    }

    @Test
    public void testVolume() throws Exception {
        Sphere sp = new Sphere(2);
        assertEquals(sp.volume(),33.5,0.1);

    }

}