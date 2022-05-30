public class RBSDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2, 2, 2};
        System.out.println(findPivot(arr));
    }
//    static int ans (int[] arr, int target){
//
//    }
    //this method will find the pivot in the rotated array with duplicate elements
    static int findPivot(int[] arr){
        int start = 0, end = arr.length - 1, mid;
        while (start<=end){
            mid = start + (end - start) / 2;
            if (mid < arr.length -1 && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){        //if mid start and end are the same then do this
                //if the start is the pivot bc there might be the possiblity of start being pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;        //if not then ignore the duplicate elements
                //there also might be possible that end is the pivot
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;          //if not then ignore the duplicate elements
            }
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
