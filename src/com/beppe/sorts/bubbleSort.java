package com.beppe.sorts;

public class bubbleSort  {

    public static void Sort(int[] arrayToSort, int index, int maxIndex) {
        if(maxIndex == 0) return;
        else if (index == maxIndex) Sort(arrayToSort, 0, maxIndex-1);
        else if (arrayToSort[index] > arrayToSort[index+1]) {
            int first = arrayToSort[index];
            int last = arrayToSort[index+1];
            arrayToSort[index+1] = first;
            arrayToSort[index] = last;
            Sort(arrayToSort, index+1, maxIndex);
        }
    }

    public static void Sort(int[] arrayToSort) {
        Sort(arrayToSort, 0, arrayToSort.length-1);
    }
}
