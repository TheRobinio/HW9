import com.github.therobinio.Calendar;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalendarTest {

    GregorianCalendar gregorianCalendar = new GregorianCalendar();


    @ParameterizedTest
    @ValueSource(ints = {1996,1992,1988,1984,1972})
    public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        Calendar calendar = new Calendar(year);
        assertEquals(gregorianCalendar.isLeapYear(year),calendar.isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {200,300,600,1000,3231,2000,1992})
    public void Should_check_if_input_is_filtered(int year) {
        Calendar calendar = new Calendar(year);
        if(year <= 1900 || year > 2000) {
            assertFalse(calendar.isLeapYear());
        } else {
            Should_check_if_year_is_leap_also_in_gregorian(year);
        }
    }
}
