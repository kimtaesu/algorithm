package com.hucet.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by taesu on 2017-12-02.
 */
public class MergeSort {

    private int[] data = {5, 1, 3, 4, 12, 2};
    private int[] correct = {1, 2, 3, 4, 5, 12};

    @Test
    public void SortTest() {
        int[] tmp = new int[data.length];
        sort(data, tmp, 0, data.length - 1);
        Assert.assertArrayEquals(data, correct);
    }

    private void sort(int[] data, int[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            sort(data, tmp, left, center);
            sort(data, tmp, center + 1, right);
            merge(data, tmp, left, center + 1, right);
        }
    }

    private void merge(int[] data, int[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd)
            if (data[left] < data[right])
                tmp[k++] = data[left++];
            else
                tmp[k++] = data[right++];

        while (left <= leftEnd)    // Copy rest of first half
            tmp[k++] = data[left++];

        while (right <= rightEnd)  // Copy rest of right half
            tmp[k++] = data[right++];

        for (int i = 0; i < num; i++, rightEnd--)
            data[rightEnd] = tmp[rightEnd];
    }

    private void print(int[] data) {

        Arrays.stream(data).forEach(value -> {
            System.out.print(value + " ");
        });
        System.out.println();
    }
}
