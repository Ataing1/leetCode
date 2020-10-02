public class Problem4 {
    /**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * <p>
     * Follow up: The overall run time complexity should be O(log (m+n)).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums1 = [1,3], nums2 = [2]
     * Output: 2.00000
     * Explanation: merged array = [1,2,3] and median is 2.
     * Example 2:
     * <p>
     * Input: nums1 = [1,2], nums2 = [3,4]
     * Output: 2.50000
     * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     * Example 3:
     * <p>
     * Input: nums1 = [0,0], nums2 = [0,0]
     * Output: 0.00000
     * Example 4:
     * <p>
     * Input: nums1 = [], nums2 = [1]
     * Output: 1.00000
     * Example 5:
     * <p>
     * Input: nums1 = [2], nums2 = []
     * Output: 2.00000
     * <p>
     * <p>
     * Constraints:
     * <p>
     * nums1.length == m
     * nums2.length == n
     * 0 <= m <= 1000
     * 0 <= n <= 1000
     * 1 <= m + n <= 2000
     * -106 <= nums1[i], nums2[i] <= 106
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int full = 0;
        int [] fullArr = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i]<nums2[j]){
                fullArr[full] = nums1[i];
                i++;
            }else{
                fullArr[full] = nums2[j];
                j++;
            }
            full++;
        }
        if(i<nums1.length){
            for(;i< nums1.length;i++){
                fullArr[full] = nums1[i];
                full++;
            }
        }
        if(j<nums2.length){
            for(;j<nums2.length;j++){
                fullArr[full] = nums2[j];
                full++;
            }
        }

        /*for(int x: fullArr){
            System.out.println(x);
        }*/

        if(fullArr.length%2==0){
            return (fullArr[fullArr.length/2-1] + fullArr[fullArr.length/2])/2.0;
        }else{
            return fullArr[(int) Math.ceil(fullArr.length/2.0)-1];
        }


    }
    public static void main (String[] args){
        int []arr1 = {};
        int []arr2 = {1};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
