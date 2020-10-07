package ru.mirea.lab6;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] arr, int lb, int rb) {
        if (rb <= lb)
            return;
        int middle = lb + (rb - lb) / 2;
        mergeSort(arr, lb, middle);
        mergeSort(arr, middle + 1, rb);
        int[] somearr = Arrays.copyOf(arr, arr.length);
        for (int k = lb; k <= rb; k++)
            somearr[k] = arr[k];
        int i = lb, j = middle + 1;
        for (int k = lb; k <= rb; k++) {
            if (i > middle) {
                arr[k] = somearr[j];
                j++;
            }
            else if (j > rb) {
                arr[k] = somearr[i];
                i++;
            }
            else if (somearr[j] < somearr[i]) {
                arr[k] = somearr[j];
                j++;
            }
            else {
                arr[k] = somearr[i];
                i++;
            }
        }
    }
}