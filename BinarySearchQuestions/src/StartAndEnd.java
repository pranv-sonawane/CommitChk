public class StartAndEnd {
    public static void main(String[] args) {

    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = isFirstIndex(nums, target, true);
        if (ans[0] != -1){
            ans[1] = isFirstIndex(nums, target, false);
        }
        return ans;
    }
    //gives the index value of the target in the LHS or RHS in the array
    static int isFirstIndex (int[] nums, int target, boolean firstIndex){
        int start = 0, end = nums.length -1, mid;
        int ans = -1;

        while (start<=end){
            //get mid
            mid = start + (end - start) /2;

            if (nums[mid] < target){
                start = mid + 1;
            }
            else if (nums[mid] > target){
                end = mid -1;
            }
            else{
                //if potential answer is found
                ans = mid;
                if (firstIndex){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
