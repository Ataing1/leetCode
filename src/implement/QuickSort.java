package implement;

import java.util.ArrayList;

public class QuickSort {

    public void quickSort(int[] array, int left, int right){

        if(left<right){
            int partition = partition(array, left, right);
            quickSort(array, left, partition-1);
            quickSort(array, partition+1 , right);

        }


    }

    private int partition(int[] array, int left, int right){
        int i = left-1;
        int partition = array[right];
        for(int j = left;j<right;j++){
            if(array[j]<partition){
                i++;
                swap (array, i, j);
            }
        }
        swap(array, i+1, right);
        return i+1;
    }


    private void swap(int[] array, int one, int two){
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }


}
