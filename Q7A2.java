public class Q7A2 {
    static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                increasing = false;
            }
            if(nums[i] < nums[i+1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;

    }
    public static void main(String[] args) {

        int [] nums = {1,2,2,4};
        System.out.println(isMonotonic(nums));

    }
}
