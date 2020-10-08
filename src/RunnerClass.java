import java.util.Arrays;

public class RunnerClass {
    public static void main (String [] args){
        int[] intArray;
        String[] stringArray;
        Problem942 problem942 = new Problem942();
        System.out.println(Arrays.toString(problem942.diStringMatch("DIDIDIDIDI")));
        Problem1578 problem1578 = new Problem1578();
        intArray = new int[]{3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(problem1578.minCost("aaabbbabbbb", intArray));


        stringArray = new String[]{"word","good","best","good"};
        Problem30 problem30 = new Problem30();
        System.out.println(problem30.findSubstring("wordgoodgoodgoodbestword", stringArray));
    }
}
