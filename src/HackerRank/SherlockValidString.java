package HackerRank;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class SherlockValidString  {

    // Complete the isValid function below.
    static String isValid(String s) {
        if(s.isEmpty())return "YES";
        int[] alphabet = new int[26];
        // char - 97 = arr location;
        for(int i = 0;i<s.length();i++){
            int location = (int)s.charAt(i) - 'a';
            alphabet[location] += 1;
        }
        for(Integer x: alphabet){
            System.out.println(x);
        }
        int i = 0;
        while(alphabet[i]==0){
            i++;
        }
        int standard = alphabet[i];
        boolean used = false;
        for(;i<26;i++){
            if(alphabet[i]!=0){
                if(Math.abs(alphabet[i]-standard)==1){
                    if(used){
                        System.out.println("equal 1");
                        return "NO";
                    }else{
                        used = true;
                    }
                }else if(Math.abs(alphabet[i]-standard)>1){

                    System.out.println("gtr then 1");
                    return "NO";
                }
            }
        }
        return "YES";



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scanner.nextLine();

        String result = isValid(s);


        scanner.close();
    }
}
