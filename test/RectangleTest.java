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
        Rectangle rect = new Rectangle(2,3);
        double perimeter = rect.perimeter();
        assertEquals(10,perimeter,0.0);

    }

    @Test
    public void testSurface() throws Exception {
        Rectangle rect = new Rectangle(2,3);
        double surface = rect.surface();
        assertEquals(6,surface,0.0);


    }

}