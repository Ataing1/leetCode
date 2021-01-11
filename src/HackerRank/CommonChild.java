package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CommonChild {

    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
        HashMap<Character, ArrayList<Integer>> frequency = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            if(frequency.containsKey(s1.charAt(i))){
                frequency.get(s1.charAt(i)).add(i);
            }else{
                ArrayList<Integer> x = new ArrayList<>();
                x.add(i);
                frequency.put(s1.charAt(i), x );
            }
        }
        System.out.println(frequency);
        int count = 0;
        for(int i = 0;i<s2.length();i++){
            System.out.println("current char: " + s2.charAt(i));

            if(frequency.containsKey(s2.charAt(i))){
                ArrayList<Integer> temp = frequency.get(s2.charAt(i));
                System.out.println("possible positions: " + temp);
                for(int j = 0;j<temp.size();j++){
                    if(temp.get(j)>=i){
                        count++;
                        temp.remove(j);
                        break;
                    }
                }
            }
        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);


        scanner.close();
    }
}

