package model;

import model.Figure;

public class Player {

    private final String name;

    private final String figure;

    public Player(final String name, final String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }
}
