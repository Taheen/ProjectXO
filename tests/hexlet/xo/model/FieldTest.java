package hexlet.xo.model;

import hexlet.xo.model.exceptions.AlreadyOccupiedException;
import hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    public void testGetSize() {
        final Field field = new Field(3);

        assertEquals(3 ,field.getSize());
    }

    @Test
    public void testSetFigure() throws AlreadyOccupiedException, InvalidPointException {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0 , 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);
    }


    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0 , 0);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);

    }
    @Test
    public void testGetFigureWhenXIsLessThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(-1 , 0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e){}


    }

    @Test
    public void testGetFigureWhenYIsLessThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0 , -1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e){}


    }

    @Test
    public void testGetFigureWhenXIsMoreThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(field.getSize() + 1, 0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e){}


    }

    @Test
    public void testGetFigureWhenYIsMoreThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0 , field.getSize() + 1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e){}


    }
}