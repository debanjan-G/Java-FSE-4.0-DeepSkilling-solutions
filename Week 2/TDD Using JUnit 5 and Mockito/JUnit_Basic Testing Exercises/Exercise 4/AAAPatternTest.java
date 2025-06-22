import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AAAPatternTest {

    private int value;

    @BeforeEach
    public void setUp() {
        // Arrange: Initialize or set up resources before each test
        value = 10;
    }

    @AfterEach
    public void tearDown() {
        // Teardown: Clean up resources after each test
        value = 0;
    }

    @Test
    public void testAddition() {
        // Arrange
        int addend = 5;

        // Act
        int result = value + addend;

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int subtrahend = 3;

        // Act
        int result = value - subtrahend;

        // Assert
        assertEquals(7, result);

    }
}
