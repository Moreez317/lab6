package ru.mirea.lab6;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        int[] mass = arr;
        System.out.println(Arrays.toString(mass));
        for (int left = 0; left < mass.length; left++) {
            int val = mass[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (val < mass[i]) {
                    mass[i + 1] = mass[i];
                }
                else {
                    break;
                }
            }
            mass[i + 1] = val;
        }
        System.out.println(Arrays.toString(mass));
    }
}
