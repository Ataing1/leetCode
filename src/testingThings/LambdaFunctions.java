package testingThings;

import java.util.*;

public class LambdaFunctions {

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[][] arr = new int[500][4];
        Random random = new Random();
        for(int i = 0;i<500;i++){
            arrayList.add(random.nextInt(500));
            map.put(i, random.nextInt(5000));
            arr[i][0] = random.nextInt(400);
            arr[i][1] = random.nextInt(400);
            arr[i][2] = random.nextInt(400);
            arr[i][3] = random.nextInt(400);
        }
        arrayList.forEach((n)-> {System.out.println(n + " doubled =  " + (n*2));});
        map.forEach((i, n)-> {
            System.out.print(i + " ");
            if(n>2500){
                System.out.println("fizz");

            }else{
                System.out.println("Buzz");
            }
        });
        Arrays.sort(arr, Comparator.comparingInt(n -> n[3]));
        for(int[] x: arr){
            System.out.println(Arrays.toString(x));
        }
    }

}
