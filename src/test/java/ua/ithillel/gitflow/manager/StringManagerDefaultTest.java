package ua.ithillel.gitflow.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManagerDefaultTest {
    private final StringManager stringManager = new StringManagerDefault();

    @Test
    public void stringLength() {
        String testString = "Hello";
        int expectedLength = testString.length();

        int actualLength = stringManager.stringLength(testString);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void stringUpper() {
        String testString = "Hello";
        String expectedString = "HELLO";

        String actualString = stringManager.stringUpper(testString);

        assertEquals(expectedString, actualString);
    }
}
