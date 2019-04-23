package foo.bar;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Period;

public class MoneySavingCalculatorTest {

    MoneySavingCalculator calc = new MoneySavingCalculator();

    @Test
    @Description("During period of 1 year, when saving is 1000 once a YEAR, total savings should be 1000")
    void saveEachYearDuringYear1000pln() {
        Assertions.assertEquals(
                BigDecimal.valueOf(1000),
                calc.calculateSavings(SavingFrequency.ONCE_A_YEAR,
                        BigDecimal.valueOf(1000), Period.ofYears(1))
        );
    }

    @Test
    @Description("During period of 2 months, when saving is 1000 once a month, total savings should be 2000")
    void saveEachMonth() {
        Assertions.assertEquals(
                BigDecimal.valueOf(2000),
                calc.calculateSavings(SavingFrequency.EACH_MONTH,
                        BigDecimal.valueOf(1000), Period.ofMonths(2))
        );
    }

    @Test
    @Description("During period of 3 weeks, when saving is 1000 once a month, total savings should be 2000")
    void saveEachWeek() {
        Assertions.assertEquals(
                BigDecimal.valueOf(3000),
                calc.calculateSavings(SavingFrequency.EACH_WEEK,
                        BigDecimal.valueOf(1000), Period.ofWeeks(3))
        );
    }

    @Test
    @Description("During period of 138 days, when saving is 1,23 once a day, total savings should be 169,74")
    void saveEachDay() {
        Assertions.assertEquals(
                BigDecimal.valueOf(169.74),
                calc.calculateSavings(SavingFrequency.EACH_DAY,
                        BigDecimal.valueOf(1.23), Period.ofDays(138))
        );
    }

}
