public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(findInMountainArray(target, arr));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        if (mountainArr.length >= 100){
            return -1;
        }
        int start = 0, end = findPeak(mountainArr);
        int nextStart = end + 1, nextEnd = mountainArr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < mountainArr[mid]){
                end = mid - 1;
            }else if (target > mountainArr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        while (nextStart <= nextEnd){
            int mid = nextStart + (nextEnd - nextStart) / 2;
            if (target > mountainArr[mid]){
                nextEnd = mid - 1;
            }else if (target < mountainArr[mid]){
                nextStart = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //find the peak of the mountain
    static int findPeak(int[] arr){
        int start = 0, end = arr.length - 1;
        while (start < end){
            //find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        //when the start and end comes at the same index just return the start or end
        return start;
    }
}
