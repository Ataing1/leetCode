package HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {

        Arrays.sort(arr);
        int smallest = 100000000;
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<=arr.length - k;i++){
            //i to i+ (k - 1)
            System.out.println(arr[i+(k-1)] + "-" +  arr[i]);
            smallest = Math.min(smallest, arr[i+(k-1)] - arr[i]);

        }
        System.out.println(smallest);
        return smallest;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);


        scanner.close();
    }
}
