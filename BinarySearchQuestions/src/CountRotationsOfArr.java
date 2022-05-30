public class CountRotationsOfArr {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {2,2,2,2,3,5,1,2};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] arr){
        int pivot = rbsduplicate(arr);
        return pivot + 1;
    }
    // if the array dosen't have duplicate elements then use this
    static int rbs(int[] arr) {
        //the array is rotated find the pivot
        int start = 0;
        int end = arr.length - 1;
//        // check if the array is rotated or not to save the rest of the code form executing
//        if (arr[0] >= arr[arr.length - 1]){
//
//        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            //checks if the mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
//            checks if the mid is pivot
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            //two major conditions which guides any binary search program
            if (arr[start] < arr[mid]){
                start = mid + 1;
            }else if (arr[mid] < arr[end]){
                end = mid - 1;
            }
        }
        return -1;
    }
    //if the array has duplicate elements then use this to find the pivot
    static int rbsduplicate(int[] arr){
        //the array is rotated find the pivot
        int start = 0;
        int end = arr.length - 1;
//        // check if the array is rotated or not to save the rest of the code form executing
//        if (arr[0] >= arr[arr.length - 1]){
//
//        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            //checks if the mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
//            checks if the mid is pivot
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            //if start==mid==end then just ignore start and end
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                // then skip start++ and end--
                // but before check if the start and end are the pivots
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end --;
            }
            // the below code means search right if one of the condition is met else search left
            if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
