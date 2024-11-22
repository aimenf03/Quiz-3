package com.jwetherell.algorithms.sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    public void testQuickSortEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input));
    }

    @Test
    public void testQuickSortDuplicates() {
        Integer[] input = {2, 3, 2, 1};
        Integer[] expected = {1, 2, 2, 3};
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input));
    }

    @Test
    public void testQuickSortNegativeValues() {
        Integer[] input = {-1, -3, 2, 0, 4};
        Integer[] expected = {-3, -1, 0, 2, 4};
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, input));
    }

    @Test
    public void testQuickSortWithFirstPivot() {
        Integer[] input = {10, 7, 8, 9};
        Integer[] expected = {7, 8, 9, 10};
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, input));
    }

    @Test
    public void testQuickSortWithMiddlePivot() {
        Integer[] input = {10, 7, 8, 9};
        Integer[] expected = {7, 8, 9, 10};
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, input));
    }
}