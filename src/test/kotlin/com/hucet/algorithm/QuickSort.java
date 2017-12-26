package com.hucet.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSort {
    private int[] data = {5, 1, 3, 4, 12, 2};
    private int[] correct = {1, 2, 3, 4, 5, 12};

    @Test
    public void quickSort() {
        quick(0, data.length - 1);
        Assert.assertArrayEquals(data, correct);
    }

    private void quick(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = data[low + (high - low) / 2];

        while (data[i] < pivot) {
            i++;
        }
        while (data[j] > pivot) {
            j--;
        }

        if (i <= j) {
            exchange(i, j);
            i++;
            j--;
        }
        if (low < j)
            quick(low, j);
        if (i < high)
            quick(i, high);
    }

    private void exchange(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private void print() {
        Arrays.stream(data).forEach(value -> {
            System.out.print(value + " ");
        });
        System.out.println();
    }
}
