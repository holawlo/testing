package foo.bar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @ParameterizedTest(name = "Area of triangle({0},{1}) should be {2}")
    @CsvFileSource(resources = "/triangle.csv", numLinesToSkip = 1)
    void areaOfTriangle(int a, int expectedArea) {
        Square square = new Square(a);
        assertEquals(expectedArea, square.area(), "Area of square is different than expected");
    }


}
