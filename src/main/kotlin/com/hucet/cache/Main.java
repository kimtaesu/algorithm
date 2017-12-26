package com.hucet.cache;

import java.util.Scanner;

public class Main {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] A = new int[size];
        int[] tmp = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }

        mergeSort(A, tmp, 0, size - 1);
        printA(A);
    }

    static void mergeSort(int[] a, int[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    static void merge(int[] data, int[] tmp, int left, int right, int rightEnd) {
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

    static void printA(int[] list) {
        for (int a : list) {
            System.out.println("" + a);
        }
    }
}
