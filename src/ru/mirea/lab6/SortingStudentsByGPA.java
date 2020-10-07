package ru.mirea.lab6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    public void quickSort(int[] arr, int lb, int rb) {
        int left = lb;
        int right = rb;
        int mean = arr[(left + right) / 2];
        do {
            while (arr[left] < mean) {
                left++;
            }
            while (arr[right] > mean) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                }
                left++;
                right--;
            }
        }
        while (left <= right);
        if (left < rb) {
            quickSort(arr, left, rb);
        }
        if (lb < right) {
            quickSort(arr, lb, right);
        }
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}