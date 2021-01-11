import java.util.Arrays;

public class Problem27 {
    /**
     *
     */
    public Problem27() {
        System.out.println("Problem27: ");
    }

    public static void main(String[] args) {
        Problem27 test = new Problem27();
        int[] t = new int[]{3,2,2,3};
        int res = test.removeElement(t, 3);
        for(int i = 0;i<res;i++){
            System.out.println(t[i]);
        }
    }

    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;

        while (start< end){
            System.out.println(Arrays.toString(nums));
            System.out.println("start: " + start + " end: " + end);
            if(nums[start]==val&& nums[end]!=val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                System.out.println(Arrays.toString(nums));
            }else if(nums[start] == val){
                System.out.println("decrement");
                end--;
            }else{
                System.out.println("increment");
                start++;
            }
        }
        return end;
    }

}