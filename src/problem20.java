import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class problem20 {
    /**
     *20. Valid Parentheses

     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     *
     *
     * Example 1:
     *
     * Input: s = "()"
     * Output: true
     * Example 2:
     *
     * Input: s = "()[]{}"
     * Output: true
     * Example 3:
     *
     * Input: s = "(]"
     * Output: false
     * Example 4:
     *
     * Input: s = "([)]"
     * Output: false
     * Example 5:
     *
     * Input: s = "{[]}"
     * Output: true
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 104
     * s consists of parentheses only '()[]{}'.
     */
    public problem20() {
        System.out.println("problem20: ");
    }

    public static void main(String[] args) {
        problem20 test = new problem20();
    }

    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                switch(stack.pop()){
                    case '(':
                        if(s.charAt(i)!=')'){
                            return false;
                        }
                        break;
                    case '{':
                        if(s.charAt(i)!='}') {
                            return false;
                        }break;
                    case '[':
                        if(s.charAt(i)!=']'){
                            return false;
                        }break;
                }
            }
        }
        return stack.isEmpty();

    }

}