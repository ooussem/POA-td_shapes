import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 04/10/2016.
 */
public class CuboidTest {
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetLength() throws Exception {
        Cuboid cubo = new Cuboid(2,9,1);
        assertEquals(cubo.getLength(),2,0.0);
    }

    @Test
    public void testSetLength() throws Exception {
        Cuboid cubo = new Cuboid(2,9,1);
        cubo.setLength(5);
        assertEquals(cubo.getLength(),5,0.0);
    }

    @Test
    public void testGetWidth() throws Exception {
        Cuboid cubo = new Cuboid(2,9,1);
        assertEquals(cubo.getWidth(),9,0.0);
    }

    @Test
    public void testSetWidth() throws Exception {
        Cuboid cubo = new Cuboid(2,9,1);
        cubo.setWidth(0);
        assertEquals(cubo.getWidth(),0,0.0);
    }

    @Test
    public void testGetHeight() throws Exception {
        Cuboid cubo = new Cuboid(2,9,1);
        assertEquals(cubo.getHeight(),1,0.0);
    }

    @Test
    public void testSetHeight() throws Exception {
        Cuboid cubo = new Cuboid(2,9,1);
        cubo.setHeight(3);
        assertEquals(cubo.getHeight(),3,0.0);
    }

    @Test
    public void testSurface() throws Exception {
        Cuboid cubo = new Cuboid(2,2,1);
        assertEquals(cubo.surface(),16 ,0.0);
    }

    @Test
    public void testVolume() throws Exception {
        Cuboid cubo = new Cuboid(2,2,1);
        assertEquals(cubo.volume(),4,0.0);
    }

}