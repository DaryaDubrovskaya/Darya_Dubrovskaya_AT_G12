package homework.day14.junit;

import homework.day14.DayOfWeekUtility;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfWeekUtilityTest {

    @Test
    public void getDayOfWeekTest() {
        assertEquals("Tuesday", DayOfWeekUtility.getDayOfWeek(2));
    }

    @Test
    public void getDayOfWeekInvalidTest() {
        assertEquals("Invalid day number. Please provide a number between 1 and 7.", DayOfWeekUtility.getDayOfWeek(9));
    }
}
