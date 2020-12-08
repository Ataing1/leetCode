public class Problem13 {
    /**
     *Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     *
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "III"
     * Output: 3
     * Example 2:
     *
     * Input: s = "IV"
     * Output: 4
     * Example 3:
     *
     * Input: s = "IX"
     * Output: 9
     * Example 4:
     *
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 5:
     *
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 15
     * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     *
     * Success
     * Details
     * Runtime: 3 ms, faster than 99.93% of Java online submissions for Roman to Integer.
     * Memory Usage: 39.4 MB, less than 53.24% of Java online submissions for Roman to Integer.
     */
    public Problem13() {
        System.out.println("Problem13: ");
    }

    public static void main(String[] args) {
        Problem13 test = new Problem13();
        String s = "MCM";
        System.out.println(test.romanToInt1(s));
    }

    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){

            if(s.charAt(i) == 'I'){
                if(i+1<s.length()){ //make sure not to go out of bounds
                    if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X'){
                        sum+= (getValue(s.charAt(i+1))- getValue(s.charAt(i)));
                        i++;
                    }else{
                        sum+= getValue(s.charAt(i));
                    }
                }else{
                    sum+= getValue(s.charAt(i));//end of string, just add the value
                }
            }else if(s.charAt(i)=='X'){
                if(i+1<s.length()){ //make sure not to go out of bounds
                    if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C'){
                        sum+= (getValue(s.charAt(i+1))- getValue(s.charAt(i)));
                        i++;
                    }else{
                        sum+= getValue(s.charAt(i));
                    }
                }else{
                    sum+= getValue(s.charAt(i));//end of string, just add the value
                }
            }else if(s.charAt(i)=='C'){
                if(i+1<s.length()){ //make sure not to go out of bounds
                    if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M'){
                        sum+= (getValue(s.charAt(i+1))- getValue(s.charAt(i)));
                        i++;
                    }else{
                        sum+= getValue(s.charAt(i));
                    }
                }else{
                    sum+= getValue(s.charAt(i));//end of string, just add the value
                }
            }else{
                sum += getValue(s.charAt(i));
            }
        }
        return sum;
    }

    public int romanToInt1(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){

            if(s.charAt(i) == 'I'){
                if(i+1<s.length()){ //make sure not to go out of bounds
                    if(s.charAt(i+1)=='V'){
                        sum+= 4;
                        i++;
                    }else if(s.charAt(i+1)=='X'){
                        sum+= 9;
                        i++;
                    }else{
                        sum+= 1;
                    }
                }else{
                    sum+= 1;//end of string, just add the value
                }
            }else if(s.charAt(i)=='X'){
                if(i+1<s.length()){ //make sure not to go out of bounds
                    if(s.charAt(i+1)=='L'){
                        sum+= 40;
                        i++;
                    }else if(s.charAt(i+1)=='C'){
                        sum+= 90;
                        i++;
                    }else{
                        sum+= 10;
                    }
                }else{
                    sum+= 10;//end of string, just add the value
                }
            }else if(s.charAt(i)=='C'){
                if(i+1<s.length()){ //make sure not to go out of bounds
                    if(s.charAt(i+1)=='D'){
                        sum+= 400;
                        i++;
                    }else if(s.charAt(i+1)=='M'){
                        sum+= 900;
                        i++;
                    }else{
                        sum+= 100;
                    }
                }else{
                    sum+= 100;//end of string, just add the value
                }
            }else{
                sum += getValue(s.charAt(i));
            }
        }
        return sum;
    }

    public int getValue(char x){
        return switch (x) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -99999;
        };
    }

}