package temperature;

import java.math.BigDecimal;

public class Kelvin implements TemperatureUnit {

    private final BigDecimal value;

    public Kelvin(BigDecimal value) {
        if (value.intValue() < -273) {
            throw new IllegalArgumentException("Temperature in Celsius can't be lower than -273!");
        }
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }
}
