package com.hucet.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by taesu on 2017-12-02.
 */
public class BubbleSort {

    private int[] data = {5, 1, 3, 4, 12, 2};
    private int[] correct = {1, 2, 3, 4, 5, 12};

    @Test
    public void SortTest() {
        sort(data);
//        Arrays.stream(data).forEach(value -> {
//            System.out.println(value + "");
//        });
//        System.out.println("");
//        Arrays.stream(correct).forEach(value -> {
//            System.out.println(value + "");
//        });
        Assert.assertArrayEquals(data, correct);
    }

    private void sort(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                print();
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] data, int minIndex, int target) {
        int temp = data[minIndex];
        data[minIndex] = data[target];
        data[target] = temp;
    }

    private void print() {

        Arrays.stream(data).forEach(value -> {
            System.out.print(value + " ");
        });
        System.out.println();
    }
}
