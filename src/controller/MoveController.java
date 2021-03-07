package controller;

import hexlet.xo.model.Field;
import hexlet.xo.model.Figure;
import hexlet.xo.model.exceptions.AlreadyOccupiedException;
import hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException {

        if (field.getFigure(point) != null){
            throw new AlreadyOccupiedException();
        }

        field.setFigure(point, figure);
    }

}
