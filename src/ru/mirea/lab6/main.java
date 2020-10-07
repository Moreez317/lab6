package ru.mirea.lab6;

import java.util.Arrays;

public class main {
    private static void arrayCompound(int[] a, int[] b, int[] c){
        int count = 0;
        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            c[count++] = b[j];
        }
    }
    public static void main(String[] args) {

        System.out.println("Insertion Sort:");
        int[] arr1 = new int[] {3, 4, 5, 15, 6, 22, 7, 2, 0, 20};
        int[] arr2 = new int[] {5, 3, 1, 01, 67, 43, 45, 15, 11, 2};
        int[] arr3 = new int[20];

        InsertionSort INSsort = new InsertionSort();
        INSsort.insertionSort(arr1);

        System.out.println();
        System.out.println("Quick Sort:");

        SortingStudentsByGPA QUICKsort = new SortingStudentsByGPA();
        System.out.println(Arrays.toString(arr2));
        QUICKsort.quickSort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        System.out.println("Merge Sort:");

        arrayCompound(arr1, arr2, arr3);

        MergeSort MERGEsort = new MergeSort();
        System.out.println(Arrays.toString(arr3));
        MERGEsort.mergeSort(arr3, 0, arr3.length-1);
        System.out.println(Arrays.toString(arr3));
    }
}