public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 34, 55, 78, 99, 102, 226, 245};
        System.out.println(search(nums, 102, 0, nums.length - 1));
    }
    static int search(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            return search(arr, target, s, mid - 1);
        }
        else{
            return search(arr, target, mid + 1, e);
        }
    }
}
