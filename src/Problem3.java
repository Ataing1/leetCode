import java.util.ArrayList;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

public class Problem3 {

    public static void main (String[] args){

        System.out.println(lengthOfLongestSubstring("qrsvbspk"));
    }

    public static int lengthOfLongestSubstring(String s) {
        char [] charArray = s.toCharArray();
        int length = 0;
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i = 0;i<charArray.length;i++){
            if(!unique.contains((int)charArray[i])){
                unique.add((int)charArray[i]);
                length =Math.max(unique.size(), length);
            }else{
                length =Math.max(unique.size(), length);
                unique.add((int)charArray[i]);
                for(int j = 0;j<unique.size();j++){
                    if(unique.get(j)!=(int)charArray[i]){
                        unique.remove(j);
                        j--;
                    }else{
                        unique.remove(j);
                        break;
                    }
                }


            }
        }
        return length;
    }

}
