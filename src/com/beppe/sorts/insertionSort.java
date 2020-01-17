package com.beppe.sorts;

public class insertionSort {

    public static void Sort(int[] arrayToSort, int accumulator, int lastIndex) {
        if (accumulator == arrayToSort.length-1) return;
        if (lastIndex != -1) {
            if (arrayToSort[accumulator] > arrayToSort[accumulator+1]) {
                int curr = arrayToSort[accumulator];
                int next = arrayToSort[accumulator+1];
                arrayToSort[accumulator+1] = curr;
                arrayToSort[accumulator] = next;
                if (accumulator != 0) Sort(arrayToSort, accumulator-1, lastIndex);
                else Sort(arrayToSort, lastIndex, -1);
            }
        } else {
            if (arrayToSort[accumulator] <= arrayToSort[accumulator+1]) Sort(arrayToSort, accumulator+1, -1);
            else {
                int curr = arrayToSort[accumulator];
                int next = arrayToSort[accumulator+1];
                arrayToSort[accumulator+1] = curr;
                arrayToSort[accumulator] = next;
                if (accumulator != 0) Sort(arrayToSort, accumulator-1, accumulator);
                else Sort(arrayToSort, accumulator, -1);
            }
        }

    }

    public static void Sort(int[] arrayToSort) {
        Sort(arrayToSort, 0, -1);
    }

}
