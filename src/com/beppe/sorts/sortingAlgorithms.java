package com.beppe.sorts;
import com.beppe.utils.*;

public class sortingAlgorithms {
    public static int arrSize = 100;
    public static void main(String[] args) {
        int[] intArray = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            intArray[i] = (int) (Math.random() * 10000);
        }
        System.out.println("Generated the list to sort");
        System.out.println(Static.timeFunction(() -> insertionSort.Sort(intArray.clone())).toString());
        /*for (int i = 0; i < arrSize; i++) {
            intArray[i] = (int) Math.random();
        }
        System.out.println("Generated list to sort again");*/
        System.out.println(Static.timeFunction(() -> bubbleSort.Sort(intArray.clone())).toString());

    }

}
