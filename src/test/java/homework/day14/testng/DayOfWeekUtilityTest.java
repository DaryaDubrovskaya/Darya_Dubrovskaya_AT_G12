package homework.day14.testng;

import homework.day14.DayOfWeekUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DayOfWeekUtilityTest {

    @DataProvider(name = "validDays")
    public Object[][] validDays() {
        return new Object[][]{
                {1, "Monday"},
                {2, "Tuesday"},
                {3, "Wednesday"},
                {4, "Thursday"},
                {5, "Friday"},
                {6, "Saturday"},
                {7, "Sunday"},
                {8, "Invalid day number. Please provide a number between 1 and 7."}
        };
    }

    @Test(dataProvider = "validDays")
    public void getDayOfWeekTest(int input, String expected) {
        assertEquals(DayOfWeekUtility.getDayOfWeek(input), expected);
    }
}
