package ex18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_fahrenheit_to_celsius () {
        App myApp = new App();

        String converter = "c";
        double result = myApp.calculateResult("c", 32);

        String expectedOutput = "The temperature in Celsius is 0.00.";
        String actualOutput = myApp.generateOutput(converter, result);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_string_includes_conversions () {
        App myApp = new App();

        String converter = "f";
        double result = myApp.calculateResult("f", 0);

        String expectedOutput = "The temperature in Fahrenheit is 32.00.";
        String actualOutput = myApp.generateOutput(converter, result);

        assertEquals(expectedOutput, actualOutput);
    }
}