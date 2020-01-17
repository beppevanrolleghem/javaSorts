package com.beppe.sorts;

public class insertionSort {

    public static void Sort(int[] arrayToSort, int accumulator) {
        if (accumulator == arrayToSort.length-1) return;
        if (arrayToSort[accumulator] <= arrayToSort[accumulator+1]) Sort(arrayToSort, accumulator+1);
        else {
            int curr = arrayToSort[accumulator];
            int next = arrayToSort[accumulator+1];
            arrayToSort[accumulator+1] = curr;
            arrayToSort[accumulator] = next;
            if (accumulator != 0) Sort(arrayToSort, accumulator-1);
            else Sort(arrayToSort, accumulator);
        }
    }

    public static void Sort(int[] arrayToSort) {
        Sort(arrayToSort, 0);
    }

}
