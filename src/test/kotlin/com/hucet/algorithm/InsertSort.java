package com.hucet.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class InsertSort {


    private int[] data = {5, 1, 2, 3, 12};
    private int[] correct = {1, 2, 3, 5, 12};

    @Test
    public void insertSortTest() {
        insertSort(data);
//        Arrays.stream(data).forEach(value -> {
//            System.out.println(value + "");
//        });
//
//        Arrays.stream(correct).forEach(value -> {
//            System.out.println(value + "");
//        });
        Assert.assertArrayEquals(data, correct);
    }

    private void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j;
            for (j = i - 1; j >= 0 && temp < data[j]; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }
    }
}
