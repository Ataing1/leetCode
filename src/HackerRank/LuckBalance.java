package HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int totalLuck = 0;
        ArrayList<Integer> important = new ArrayList<>();
        for(int i = 0;i<contests.length;i++){
            if(contests[i][1]==0){
                totalLuck+= contests[i][0];
            }else{
                important.add(contests[i][0]);
            }
        }
        Collections.sort(important);
        int i = Math.max(0,important.size()-k);
        while(i<important.size()){
            totalLuck += important.get(i);
            important.remove(i);
        }
        for(Integer x: important){
            totalLuck-= x;
        }
        System.out.println(totalLuck);
        return totalLuck;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);



        scanner.close();
    }
}
