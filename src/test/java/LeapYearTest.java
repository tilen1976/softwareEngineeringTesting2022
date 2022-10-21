import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    public void a_year_is_a_leap_year_when_divisible_by_four_and_not_100() {

        assertTrue(LeapYear.isLeapYear(1704));
        assertTrue(LeapYear.isLeapYear(1896));
        assertTrue(LeapYear.isLeapYear(1944));
        assertTrue(LeapYear.isLeapYear(1988));
        assertTrue(LeapYear.isLeapYear(2008));
        assertTrue(LeapYear.isLeapYear(2032));
        assertTrue(LeapYear.isLeapYear(2196));
        assertTrue(LeapYear.isLeapYear(4024));
    }

    @Test
    public void a_year_is_a_leap_year_when_divisible_by_400(){

        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
        assertTrue(LeapYear.isLeapYear(2800));
        assertTrue(LeapYear.isLeapYear(3200));
        assertTrue(LeapYear.isLeapYear(3600));
        assertTrue(LeapYear.isLeapYear(4000));
    }

    @Test
    public void a_year_is_not_a_leap_year_when_not_divisible_by_four(){

        assertFalse(LeapYear.isLeapYear(1701));
        assertFalse(LeapYear.isLeapYear(1773));
        assertFalse(LeapYear.isLeapYear(1921));
        assertFalse(LeapYear.isLeapYear(1943));
        assertFalse(LeapYear.isLeapYear(1987));
        assertFalse(LeapYear.isLeapYear(2499));
        assertFalse(LeapYear.isLeapYear(5039));
    }

    @Test
    public void a_year_is_not_a_leap_year_when_divisible_by_100_and_not_400() {

        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2100));
        assertFalse(LeapYear.isLeapYear(2200));
        assertFalse(LeapYear.isLeapYear(2300));
        assertFalse(LeapYear.isLeapYear(2500));
        assertFalse(LeapYear.isLeapYear(5100));
    }

    @Test
    public void input_in_isLeapYear_must_have_four_digits(){

        assertFalse(LeapYear.isLeapYear(0));
        assertFalse(LeapYear.isLeapYear(-700));
        assertFalse(LeapYear.isLeapYear(399));
        assertFalse(LeapYear.isLeapYear(167349));
    }

    @Test
    public void leap_year_is_based_on_the_gregorian_calendar_and_input_before_1700_is_not_accepted(){

        assertFalse(LeapYear.isLeapYear(1688));
        assertFalse(LeapYear.isLeapYear(1696));

        assertTrue(LeapYear.isLeapYear(1704));
    }

    @Test
    public void leap_year_is_based_on_the_gregorian_calendar_and_input_before_1700_is_not_acceptedTestAction(){

        assertFalse(LeapYear.isLeapYear(1688));
        assertFalse(LeapYear.isLeapYear(1696));

        assertTrue(LeapYear.isLeapYear(1704));
    }

}
