import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 02/10/2016.
 */
public class Point3DTest {
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetZ() throws Exception {
        Point3D point3D = new Point3D(2,2,8);
        assertEquals(point3D.getZ(),8,0.0);
    }

    @Test
    public void testSetZ() throws Exception {
        Point3D point3D = new Point3D(2,2,8);
        point3D.setZ(10);
        assertEquals(point3D.getZ(),10,0.0);
    }

    @Test
    public void testTranslate() throws Exception {

    }

    @Test(enabled = false)
    public void testIsOrigin() throws Exception {

    }

    @Test(enabled = false)
    public void testDistance() throws Exception {

    }

    @Test
    public void testToString() throws Exception {
        Point3D p1 = new Point3D(3,3,3);
        System.out.println(p1.toString());
    }

    @Test
    public void testAffiche() throws Exception {
        Point3D p1 = new Point3D(3,3,3);
        p1.affiche();
    }

    @Test
    public void testEquals() throws Exception {
        Point3D p1 = new Point3D(3,3,3);
        Point3D p2 = new Point3D(3,3,3);

        assertEquals(true, p1.equals(p2));
    }

}