package com.hucet.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * Created by taesu on 2017-12-02.
 */
public class SelectSort {


    private int[] data = {5, 1, 2, 3, 12};
    private int[] correct = {1, 2, 3, 5, 12};

    @Test
    public void selectSortTest() {
        selectSort(data);
//        Arrays.stream(data).forEach(value -> {
//            System.out.println(value + "");
//        });
//
//        Arrays.stream(correct).forEach(value -> {
//            System.out.println(value + "");
//        });
        Assert.assertArrayEquals(data, correct);
    }

    private void selectSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[minIndex] > data[j]) {
                    minIndex = j;
                }
            }
            swap(data, minIndex, i);
        }
    }

    private void swap(int[] data, int minIndex, int target) {
        int temp = data[minIndex];
        data[minIndex] = data[target];
        data[target] = temp;
    }
}
