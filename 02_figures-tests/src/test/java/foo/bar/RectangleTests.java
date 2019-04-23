package foo.bar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTests {

    @ParameterizedTest(name = "Area of rectangle({0},{1}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 2, 2",
            "10, 11, 110"
    })
    void areaOfSquare(int a, int b, int expectedArea) {
        Rectangle rectangle = new Rectangle(a,b);
        assertEquals(expectedArea, rectangle.area(), "Area of rectangle is different than expected");
    }

    @ParameterizedTest(name = "Circumference of rectangle({0},{1}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 4, 10",
            "5, 6, 22"
    })
    void circumferenceOfSquare(int a, int b, int expectedCircumference) {
        Rectangle rectangle = new Rectangle(a,b);
        assertEquals(expectedCircumference, rectangle.circumference(), "Circumference of rectangle is different than expected");
    }
}
