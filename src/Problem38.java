import java.util.HashMap;

public class Problem38 {
    /**
     *The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
     *
     * countAndSay(1) = "1"
     * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
     * To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.
     *
     * For example, the saying and conversion for digit string "3322251":
     *
     *
     * Given a positive integer n, return the nth term of the count-and-say sequence.
     *
     *
     *
     * Example 1:
     *
     * Input: n = 1
     * Output: "1"
     * Explanation: This is the base case.
     * Example 2:
     *
     * Input: n = 4
     * Output: "1211"
     * Explanation:
     * countAndSay(1) = "1"
     * countAndSay(2) = say "1" = one 1 = "11"
     * countAndSay(3) = say "11" = two 1's = "21"
     * countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
     *
     *
     * Constraints:
     *
     * 1 <= n <= 30
     *
     * Runtime: 18 ms, faster than 22.64% of Java online submissions for Count and Say.
     * Memory Usage: 39.9 MB, less than 6.28% of Java online submissions for Count and Say.
     */
    public Problem38() {
        System.out.println("Problem38: ");
    }

    public static void main(String[] args) {
        Problem38 test = new Problem38();
        System.out.println("output: " + test.countAndSay(4));
    }

    public String countAndSay(int n) {
        String ret = "1";
        for(int i = 1;i<n;i++){
            ret = say(ret);
        }
        return ret;
    }

    public String say(String current){
        char currChar = current.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for(int i = 1;i<current.length();i++){
            if(currChar == current.charAt(i)){
                count++;
            }else{
                System.out.println(count + " quanitiy of " + currChar);
                stringBuilder.append(count).append(currChar);
                count=1;
                currChar = current.charAt(i);
            }
        }
        if(count>0){
            System.out.println(count + " quanitiy of " + currChar);
            stringBuilder.append(count).append(currChar);
        }
        return stringBuilder.toString();
    }



}