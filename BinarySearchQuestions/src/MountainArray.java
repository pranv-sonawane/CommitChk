//Q: https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {18,29,38,59,98,100,99,98,90};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            //find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {     //which means we are in descending array
                //so end = mid
                end = mid;
            }else {
              start = mid + 1;
            }
        }
        return start;
    }
}
