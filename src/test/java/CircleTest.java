import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class CircleTest extends TestCase {

    public void testGetAreaShouldReturnFiftyPointTwentyFour() {
        Circle circle = new Circle();
        float result = circle.getArea();
        Assertions.assertEquals(result, 50.2400016784668);
    }

    public void testGetPerimeterShouldReturnTwentyFivePointTwelve() {
        Circle circle = new Circle();
        float result = circle.getPerimeter();
        Assertions.assertEquals(result, 25.1200008392334);
    }
}