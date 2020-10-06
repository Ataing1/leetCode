public class Problem1404 {
    /**
     * Given a number s in their binary representation. Return the number of steps to reduce it to 1 under the following rules:
     * <p>
     * If the current number is even, you have to divide it by 2.
     * <p>
     * If the current number is odd, you have to add 1 to it.
     * <p>
     * It's guaranteed that you can always reach to one for all testcases.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "1101"
     * Output: 6
     * Explanation: "1101" corressponds to number 13 in their decimal representation.
     * Step 1) 13 is odd, add 1 and obtain 14.
     * Step 2) 14 is even, divide by 2 and obtain 7.
     * Step 3) 7 is odd, add 1 and obtain 8.
     * Step 4) 8 is even, divide by 2 and obtain 4.
     * Step 5) 4 is even, divide by 2 and obtain 2.
     * Step 6) 2 is even, divide by 2 and obtain 1.
     * Example 2:
     * <p>
     * Input: s = "10"
     * Output: 1
     * Explanation: "10" corressponds to number 2 in their decimal representation.
     * Step 1) 2 is even, divide by 2 and obtain 1.
     * Example 3:
     * <p>
     * Input: s = "1"
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 500
     * s consists of characters '0' or '1'
     * s[0] == '1'
     */

    public static int numSteps(String s) {
        char[] binary = s.toCharArray();
        int count = 0;
        while (binary[0] == '1'&&binary.length!=1) {

            for(char x: binary){
                System.out.print(x);
            }
            System.out.println();
            if (binary[binary.length - 1] == '0') {
                binary = div2(binary);
            } else {
                binary = add1(binary, binary.length - 1);
            }
            count++;
        }


        return count;
    }

    public static void main(String[] args) {
        //System.out.println(numSteps("1111011110000011100000110001011011110010111001010111110001"));
        System.out.println(numSteps("110001100001"));
    }

    public static char[] add1(char[] binary, int index) {
        if (binary[index] == '0') {
            binary[index] = '1';
            return binary;
        } else {
            binary[index] = '0';
            if(index==0){
                char[] arr = new char[binary.length+1];
                arr[0] = '1';
                for(int i = 1;i<binary.length+1;i++){
                    arr[i] = binary[i-1];
                }
                return arr;
                //copy and add 1 element and return
            }else{
                return add1(binary, index - 1);
            }

        }

    }

    public static char[] div2(char[] binary) {
        int index = binary.length - 1;
        char[] newArr = new char[index];
        for(index = index-1;index>=0;index--){
            newArr[index] = binary[index];
        }

        return newArr;
    }


}
