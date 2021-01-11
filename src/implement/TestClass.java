package implement;

import java.util.Arrays;

public class TestClass {



    public static void main (String [] args){
        int[] testArray = new int[] {1,2,4,5,6,56,53,23,7,67,32,675};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(testArray, 0, testArray.length-1);
        System.out.println(Arrays.toString(testArray));
    }

}
