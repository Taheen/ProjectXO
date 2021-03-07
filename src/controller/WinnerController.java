package controller;

import hexlet.xo.model.Field;
import hexlet.xo.model.Figure;
import hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class WinnerController {

    public Figure getWinner(final Field field) {

        try {
            for (int i = 0; i < 3; i++)
                if (check(field, new Point(i, 0), new Point(i, 1), new Point(i, 2))) {
                    return field.getFigure(new Point(i, 0));
                }

            for (int i = 0; i < 3; i++)
                if (check(field, new Point(0, i), new Point(i, 1), new Point(2, i))) {
                    return field.getFigure(new Point(i, 0));
                }

            for (int i = 0; i < 3; i++)
                if (check(field, new Point(0, 0), new Point(1, 1), new Point(2, 2))) {
                    return field.getFigure(new Point(0, 0));
                }

            for (int i = 0; i < 3; i++)
                if (check(field, new Point(0, 2), new Point(1, 1), new Point(2, 0))) {
                    return field.getFigure(new Point(1, 1));
                }




            } catch(InvalidPointException e){
                e.printStackTrace();
            }

        return null;


    }

    private boolean check(final Field field, final Point currentPoint, final IPointGenerator pointGenerator){

        final Figure currentFigure;
        final Figure nextFigure;
        try {
            currentFigure = field.getFigure(currentPoint);
        } catch (final InvalidPointException e) {
            return true;
        }

        try {
            if (field.getFigure(p1) == null) return false;
            if (field.getFigure(p1) == field.getFigure(p2) &&
                    field.getFigure(p1) == field.getFigure(p3))
                return true;

        } catch (InvalidPointException e) {
            e.printStackTrace();
        }

        return false;
    }

    private interface IPointGenerator {

        Point next (final Point point);

    }

}
