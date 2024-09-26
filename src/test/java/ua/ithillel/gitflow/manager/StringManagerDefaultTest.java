package ua.ithillel.gitflow.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManagerDefaultTest {
    private StringManager stringManager;

    @Test
    public void stringLength() {
        String testString = "Hello";
        int expectedLength = testString.length();

        int actualLength = stringManager.stringLength(testString);

        assertEquals(expectedLength, actualLength);
    }
}
