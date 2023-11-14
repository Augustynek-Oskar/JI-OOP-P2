import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class UpperCaseTest extends TestCase {

    public void testFormatTextShouldReturnUpperCaseString() {
        String text = "Text";
        UpperCase upperCase = new UpperCase();

        String result = upperCase.formatText(text);
        Assertions.assertEquals("TEXT", result);

    }
}