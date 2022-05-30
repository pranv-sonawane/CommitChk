public class FindPivot {

    /*Q: Search the PIVOT in the rotated array*/


    public static void main(String[] args) {
        //FIND THE PIVOT OF THE ROTATED ARRAY
        int [] arr = {4,5,6,7,8,0,1,2};
        System.out.println(findPivot(arr));

    }


        static int findPivot(int[] arr) {
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
