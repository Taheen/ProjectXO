package hexlet.xo.model;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @org.junit.jupiter.api.Test
    void getName() {

        final String inputValue = "Denis";
        final String expectedValue = inputValue;
        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @org.junit.jupiter.api.Test
    void getFigure() {

        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;
        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);

    }
}