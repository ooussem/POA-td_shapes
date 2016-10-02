import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 02/10/2016.
 */
public class RectangleTest {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testPerimeter() throws Exception {
        Rectangle rect = new Rectangle(2.0,3.0);
        assertEquals(10.0, rect.perimeter());

    }

    @Test
    public void testSurface() throws Exception {
        Rectangle rect = new Rectangle(2,3);
        assertEquals(6.0,rect.surface());

    }

}