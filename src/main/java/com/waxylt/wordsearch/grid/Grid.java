package com.waxylt.wordsearch.grid;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public interface Grid<T> {

    T get(Point point);
    List<T> getLine(Ray ray);
    List<T> getLine(Ray ray, int length);

    int rows();
    int columns();
    default int size() {
        return rows() * columns();
    }
    default boolean isEmpty() { return size() == 0; }

    boolean inBounds(Point point);

    Iterator<T> iterator(Slope vectorSpace);
    Stream<T> stream(Slope vectorSpace);
}
