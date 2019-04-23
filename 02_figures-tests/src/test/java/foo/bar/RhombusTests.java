package foo.bar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RhombusTests {

    @ParameterizedTest(name = "Circumference of rhomb({0}) should be {1}")
    @CsvSource({
            "0, 0",
            "1, 4",
            "10, 40"
    })
    void circumferenceOfRhombus(int a, int expectedCircumference) {
        Rhombus rhombus = new Rhombus(a);
        assertEquals(expectedCircumference, rhombus.circumference(), "Circumference of rhombus is different than expected");
    }

    @ParameterizedTest(name = "Area of rhomb({0}) should be {1}")
    @CsvSource({
            "0, 0, 0",
            "1, 2, 2",
            "10, 100, 1000"
    })
    void areaOfRhombus(int a, int h, int expectedArea) {
        Rhombus rhombus = new Rhombus(a,h);
        assertEquals(expectedArea, rhombus.area(), "Area of rhombus is different than expected");
    }
}
