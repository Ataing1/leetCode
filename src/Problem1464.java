public class Problem1464 {
    /**
     *Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
     *
     *
     * Example 1:
     *
     * Input: nums = [3,4,5,2]
     * Output: 12
     * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
     * Example 2:
     *
     * Input: nums = [1,5,4,5]
     * Output: 16
     * Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
     * Example 3:
     *
     * Input: nums = [3,7]
     * Output: 12
     *
     *
     * Constraints:
     *
     * 2 <= nums.length <= 500
     * 1 <= nums[i] <= 10^3
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Product of Two Elements in an Array.
     * Memory Usage: 38.9 MB, less than 41.46% of Java online submissions for Maximum Product of Two Elements in an Array.
     */
    public Problem1464() {
        System.out.println("Problem1464: ");
    }

    public static void main(String[] args) {
        Problem1464 test = new Problem1464();
    }

    public int maxProduct(int[] nums) {
        int i = 0;
        int j = 1;
        for(int k = 2;k<nums.length;k++){
            if(nums[j]<=nums[k]||nums[i]<nums[k]){
                if(nums[j]==Math.min(nums[j], nums[i])){
                    j = k;
                }else{
                    i = k;
                }
            }

        }
        return (nums[i]-1)*(nums[j]-1);

    }

}