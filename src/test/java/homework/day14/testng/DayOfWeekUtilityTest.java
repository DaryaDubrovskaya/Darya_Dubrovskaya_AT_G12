package homework.day14.testng;

import homework.day14.DayOfWeekUtility;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DayOfWeekUtilityTest {

    @Test
    public void getDayOfWeekTest() {
        assertEquals(DayOfWeekUtility.getDayOfWeek(1), "Monday");
    }

    @Test
    public void getDayOfWeekInvalidTest() {
        assertEquals(DayOfWeekUtility.getDayOfWeek(9), "Invalid day number. Please provide a number between 1 and 7.");
    }
}
