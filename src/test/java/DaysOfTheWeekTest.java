import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class DaysOfTheWeekTest extends TestCase {

    public void testNameOfTheWeekDay() {
    String result = DaysOfTheWeek.nameOfTheWeekDay(WeekDays.MONDAY);
    Assertions.assertEquals("MONDAY",result);

    }
}