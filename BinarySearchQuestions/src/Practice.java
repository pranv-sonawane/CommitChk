public class Practice {
    public static void main(String[] args) {
//        int[] arr= {6,7,1,2,3,4,5};
        int[] arr= {1,1,1,1,2,2,2,2,2,2,3,3,4};
        System.out.println(rbs(arr));
    }

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
            //if the mid start and end is same then just ignore them
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
