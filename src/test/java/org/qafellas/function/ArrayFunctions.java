package org.qafellas.function;

public class ArrayFunctions {

    /**
     * Add all elements in an array
     * @param arr
     * @return int
     */
    public int sumOfElements(int[] arr){
        int sum = 0;
        for(int el : arr){
            sum += el;
        }
        return sum;
    }

    public int maxNum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
