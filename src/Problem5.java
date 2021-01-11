import java.sql.SQLSyntaxErrorException;

public class Problem5 {
    /**
     *
     */
    public Problem5() {
        System.out.println("Problem5: ");
    }

    public static void main(String[] args) {
        Problem5 test = new Problem5();
        System.out.println(test.longestPalindrome("a"));
    }

    public String longestPalindrome(String s) {
        String ret = "";
        for(int i = 1;i<=s.length();i++){
            for(int j = 0;j<=s.length()-i;j++){
                final String substring = s.substring(j, j +i);
                System.out.println(substring);
                if(isPalindrome(substring)){
                    System.out.println(ret.length() + " or "  + substring.length());
                    if(ret.length()<substring.length()){
                        ret = substring;
                    }
                }
            }
        }
        return ret;

    }

    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}