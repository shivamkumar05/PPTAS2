public class Q8A2 {
    static int smallestRangeI(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if(min +k >= max - k){
            return 0;
        }
        else {
            return (max - k) - (min + k);
        }
    }

    public static void main(String[] args) {

        int [] nums = {0,10};
        int k = 2;
        System.out.println(smallestRangeI(nums, k));
    }
}
