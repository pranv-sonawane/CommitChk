/*Q: Search the pivot in the rotated array*/
public class Questions {
    public static void main(String[] args) {
        int[] arr= {3,4,5,6,1,2};
        System.out.println(search(arr, 4));

    }
    static int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        //if you dont find pivot it means array ios not rotated.
        if (pivot==-1){
            //do simple binary search
            return binarysearch(nums,target,0,nums.length-1);
        }
        //if pivot is found, you have found  2 ascending sorted array.

        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);

    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length -1;
        int mid = start + (end - start) / 2;
        // 4 cases over here
        while (start<=end){
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= start){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarysearch(int[] arr,int target,int start,int end){

        while(start<=end){
            //find the middle element.
            // int mid =(start + end)/2; //might be possible that (start + end) exceeds the range of integer.for very large numbers.

            // BETTER WAY TO FIND MID.
            int mid= start + (end - start) / 2; //its basically the same thing.
            if(target < arr[mid]){
                end=mid-1;

            }
            else if (target > arr[mid]){
                start= mid+1;
            }
            else{
                //ans found
                return mid;
            }


        }
        return -1;
    }
}
