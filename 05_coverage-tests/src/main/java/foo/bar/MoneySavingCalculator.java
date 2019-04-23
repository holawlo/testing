package foo.bar;

import java.math.BigDecimal;
import java.time.Period;

public class MoneySavingCalculator {

    public BigDecimal calculateSavings(
            SavingFrequency frequency,
            BigDecimal singleAmount,
            Period duration
    ) {

        switch (frequency){
            case EACH_MONTH:
                return singleAmount.multiply(BigDecimal.valueOf(duration.getMonths()));
            case EACH_DAY:
                return singleAmount.multiply((BigDecimal.valueOf(duration.getDays())));
            case EACH_SECOND_DAY:
                return singleAmount.multiply(BigDecimal.valueOf(duration.getDays())); //todo
            case EACH_WEEK:
                return singleAmount.multiply(BigDecimal.valueOf(duration.getDays() / 7));
            case ONCE_A_YEAR:
                return singleAmount.multiply(BigDecimal.valueOf(duration.getYears()));
            case TWICE_A_WEEK:
                break;
        }



        return singleAmount;
    }
}
