package com.waxylt.wordsearch.grid;

public record Point(int row, int col) {

    public Point move(Slope slope) {
        return new Point(this.row + slope.vertical(), this.col + slope.horizontal());
    }
}
