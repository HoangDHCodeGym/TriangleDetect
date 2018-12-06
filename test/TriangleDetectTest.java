import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleDetectTest {

    @Test
    void detectTriangle1() {
        double a = 2;
        double b = 2;
        double c = 2;
        String expected = Constants.EQUILATERAL;
        String result = TriangleDetect.detectTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void detectTriangle2() {
        double a = 2;
        double b = 2;
        double c = 3;
        String expected = Constants.ISOSCELES;
        String result = TriangleDetect.detectTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void detectTriangle3() {
        double a = 3;
        double b = 4;
        double c = 5;
        String expected = Constants.RIGHT;
        String result = TriangleDetect.detectTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void detectTriangle4() {
        double a = 8;
        double b = 2;
        double c = 3;
        String expected = Constants.NOT_A_TRIANGLE;
        String result = TriangleDetect.detectTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void detectTriangle5() {
        double a = -1;
        double b = 2;
        double c = 1;
        String expected = Constants.NOT_A_TRIANGLE;
        String result = TriangleDetect.detectTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void detectTriangle6() {
        double a = 0;
        double b = 1;
        double c = 1;
        String expected = Constants.NOT_A_TRIANGLE;
        String result = TriangleDetect.detectTriangle(a, b, c);
        assertEquals(expected, result);
    }
}