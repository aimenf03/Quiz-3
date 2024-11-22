package com.jwetherell.algorithms.sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testBubbleSortRegularCase() {
        Integer[] input = {4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testBubbleSortEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testBubbleSortSingleElement() {
        Integer[] input = {5};
        Integer[] expected = {5};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testBubbleSortAlreadySorted() {
        Integer[] input = {1, 2, 3, 4};
        Integer[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testBubbleSortDuplicates() {
        Integer[] input = {2, 3, 2, 1};
        Integer[] expected = {1, 2, 2, 3};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testBubbleSortNegativeValues() {
        Integer[] input = {-1, -3, 2, 0, 4};
        Integer[] expected = {-3, -1, 0, 2, 4};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }
}