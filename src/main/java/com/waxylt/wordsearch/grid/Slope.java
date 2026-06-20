package com.waxylt.wordsearch.grid;

public record Slope(int vertical, int horizontal) {
    public static Slope N = new Slope(-1, 0);
    public static Slope NE = new Slope(-1, 1);
    public static Slope E = new Slope(0, 1);
    public static Slope SE = new Slope(1, 1);
    public static Slope S = new Slope(1, 0);
    public static Slope SW = new Slope(1, -1);
    public static Slope W = new Slope(0, -1);
    public static Slope NW = new Slope(-1, -1);
}
