public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 12, 35, 57, 78};
        int target = 7;
        System.out.println(findCeil(arr, target));
    }
    static int findCeil(int[] arr, int target){
        int start = 0, end = arr.length -1, mid;
        if (target > arr[arr.length-1]){
            return -1;
        }
        while (start<=end){
            //get mid
            mid = start + (end - start) /2;
            //if element is greater than mid search right
            if (arr[mid] < target){         //if element < target
                start = mid + 1;
            }
            //if element is less than mid search left
            else if (arr[mid] > target){        //if element > target
                end = mid -1;
            }
            else
                return mid;     //if the element is < or > target that means it is == target so return that element
        }
        return arr[start];      // if the element is not found then return the start which is now mid + 1
    }
}
