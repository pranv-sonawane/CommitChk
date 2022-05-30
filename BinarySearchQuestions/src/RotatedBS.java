public class RotatedBS {
    public static void main(String[] args) {
        int[] arr= {1};
        System.out.println(searchRBS(arr, 2));
    }

    static int searchRBS (int[] arr, int target){
        int start = 0, end = arr.length, ans;
        if(arr.length == 1){
            if(target == arr[0]){
                return 0;
            }else
                return -1;
        }
        int pivot = findPivot(arr);
        //if the target is == the pivot that we just found
        if (target == arr[pivot]){
            return pivot;
        }
        if (target > arr[start]){       //if the target is greater than the start then ignore all the elements after pivot +1
            ans = binarySearch(arr, target, start, pivot);
        }else if(target == arr[start]){
            return start;
        }else{                          //else search in the pivot + 1 array
            ans = binarySearch(arr, target, pivot + 1, arr.length -1);
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid;
        while (start<=end){
            //get mid
            mid = start + (end - start) / 2;

            if (arr[mid] < target){
                start = mid + 1;
            }

            else if (arr[mid] > target){
                end = mid - 1;
            }
            else
                return mid;
        }
        return -1;  //if the element not found
    }

    static int findPivot(int[] arr){
        int start = 0, end = arr.length -1, mid;
        while (start<=end){
            //find mid
            mid = start + (end - start) / 2;
            //conditions that the element is found
            if (mid < end && arr[mid] > arr[mid + 1]){   //if we do mid + 1 it might be possible that the mid +1 will give the error "out of bounds"
                return mid;                //so we add the condition that the mid < end, so both the conditions should meet
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            if (arr[start] <= arr[mid]){
                start = mid;
            }else{
                end = mid - 1;  //this means that the mid element is somewhere next in the pivot +1
            }
        }
        return -1;
    }
}
