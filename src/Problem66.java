public class Problem66 {
    /**
     *Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
     *
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
     *
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     *
     *
     *
     * Example 1:
     *
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Example 2:
     *
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Example 3:
     *
     * Input: digits = [0]
     * Output: [1]
     *
     *
     * Constraints:
     *
     * 1 <= digits.length <= 100
     * 0 <= digits[i] <= 9
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
     * Memory Usage: 37.4 MB, less than 62.52% of Java online submissions for Plus One.
     */
    public Problem66() {
        System.out.println("Problem66: ");
    }

    public static void main(String[] args) {
        Problem66 test = new Problem66();
        int[] result = test.plusOne(new int[]{8,9,9,9});
        for(int x: result){
            System.out.println(x);
        }
    }

    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        boolean carryOne;
        do{
            if(digits[index]==9){
                carryOne = true;
                digits[index] =0;
            }else{
                digits[index]++;
                carryOne = false;
            }
            index--;
        }while(index >=0 && carryOne);
        if(carryOne){
            int[] ret = new int[digits.length+1];
            ret[0] = 1;
            for(int i = 1;i<ret.length;i++){
                ret[i] = digits[i-1];
            }
            return ret;
        }
        return digits;
    }

}