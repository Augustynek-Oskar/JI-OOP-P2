import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class LowerCaseTest extends TestCase {

    public void testFormatTextShouldReturnLowerCaseString() {
        String text = "Text";

        LowerCase lowerCase = new LowerCase();
        String result = lowerCase.formatText(text);
        Assertions.assertEquals("text", result);
    }
}