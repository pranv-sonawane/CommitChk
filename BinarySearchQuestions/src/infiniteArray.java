/*Q: Search in an infinite number of array which is in ascending order, return the index of the number,
if element not found return the next element*/
public class infiniteArray    {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 12, 24, 67, 78, 90, 121, 123, 134, 168, 179, 183, 200, 230, 240, 260, 261, 300, 350};
        int target = 168;
        System.out.println(arr.length-1);
        ans(arr, target);
    }

    static void ans(int[] arr, int target) {
        int start = 0;
        int end = 2;
        //increase the size of the box exponentially
        while(arr[end] < target){
            //double the box size
            int newStart = end + 1;
            //get the end element
            //end = previous end + sizeofbox * 2
            end = end + ( end - start + 1) * 2; //ie. we are doing = end - (start - 1); to get the number of element in the box and then multiplying them by 2
            start = newStart;
            System.out.print("start :");
            System.out.println(start);
            System.out.print("end :");
            System.out.println(end);
        }
        System.out.println(binarySearchBox(arr, target, start, end));
    }
    static int binarySearchBox(int[] arr, int target, int start, int end){
        //this method will invoke after the target < arr[end] so this means that the element will exist in the cuurent box
        int mid = 0;
        while (start <= end){
            //find mid element
            mid = start + (end - start) / 2;
            //iterate in array to find the element in either left or right side of the array
            if (target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start; //if element not found
    }
}
