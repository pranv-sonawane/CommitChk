public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 13, 16, 18};
        int target = 19;
        System.out.println(floorOfNumber(arr, target));
    }
    static int floorOfNumber(int[] arr, int target){
        int start = 0, end = arr.length -1, mid;
        if (end < 0){       //bc we are trying to get the floor, but the floor of that target itself is'nt in the array so return -1;
            return -1;
        }
        while (start<=end){
                //find mid
            mid = start + (end - start) /2;
                //if target is greater than mid search right
            if (arr[mid] < target){     //if arr[mid] < target
                    start = mid + 1;
            }
            else if (arr[mid] > target){    //if arr[mid] > target
                    end = mid -1;
            }
            else
                return mid;     //if arr[mid] == target
        }
        return arr[end];
    }
}
