import java.util.Arrays;

public class Problem14 {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * If there is no common prefix, return an empty string "".
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * <p>
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] consists of only lower-case English letters.
     *
     * Runtime: 1 ms, faster than 52.60% of Java online submissions for Longest Common Prefix.
     * Memory Usage: 37.4 MB, less than 30.82% of Java online submissions for Longest Common Prefix.
     */
    public Problem14() {
        System.out.println("Problem14: ");
    }

    public static void main(String[] args) {
        Problem14 test = new Problem14();
        String[] s = new String[]{"flower", "flow", "flight"};
        System.out.println(test.longestCommonPrefix(s));

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        for (int index = 0; index < strs[0].length(); index++) {
            for(int i = 0;i<strs.length-1;i++){
                if(strs[i].charAt(index)!=strs[i+1].charAt(index)){
                    return strs[0].substring(0, index);
                }
            }
        }
        return strs[0];
    }


}