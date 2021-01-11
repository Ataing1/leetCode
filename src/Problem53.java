public class Problem53 {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     * <p>
     * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * Example 2:
     * <p>
     * Input: nums = [1]
     * Output: 1
     * Example 3:
     * <p>
     * Input: nums = [0]
     * Output: 0
     * Example 4:
     * <p>
     * Input: nums = [-1]
     * Output: -1
     * Example 5:
     * <p>
     * Input: nums = [-2147483647]
     * Output: -2147483647
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 2 * 104
     * -231 <= nums[i] <= 231 - 1
     */
    public Problem53() {
        System.out.println("Problem53: ");
    }

    public static void main(String[] args) {
        Problem53 test = new Problem53();
        System.out.println(test.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int endFromHere = nums[0];
        int start = 0;
        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (start == j) {
                    System.out.print("[");
                }
                System.out.print(nums[j]);
                if (end == j) {
                    System.out.print("]");
                }
                System.out.print(", ");
            }
            System.out.println();
            if (endFromHere + nums[i] >= nums[i]) {
                endFromHere = endFromHere + nums[i];
                end=i;
            } else {
                endFromHere = nums[i];
                start = i;

            }


            result = Math.max(result, endFromHere);
        }
        return result;
    }

}