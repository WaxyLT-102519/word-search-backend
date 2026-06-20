package com.waxylt.wordsearch.grid;

import java.util.stream.Stream;

public record Ray(Point point, Slope slope) {

    public Stream<Point> next() {
        return Stream.iterate(point, p -> p.move(slope));
    }

    public Stream<Point> next(int many) {
        return this.next().limit(many);
    }
}
