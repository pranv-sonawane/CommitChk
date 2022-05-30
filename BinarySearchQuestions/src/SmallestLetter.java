public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'e', 'f', 'k'};
        char target = 'h';
        System.out.println(nextGreatestLetter(letters, target));    //returns next smallest letter greater than target
    }
    static char nextGreatestLetter(char[] letters, char target){
        int start =0, end = letters.length -1, mid;
        while (start<=end){
            //find mid
            mid = start + (end - start) /2;
            //if target is greater than mid search right
            if (letters[mid] < target){     //if arr[mid] < target
                start = mid + 1;
            }
            else {   //if arr[mid] > target
                end = mid -1;
            }

        }
        return letters[start % letters.length]; /*let's assume that the target element is not present in the array
        then we will return the first element in the array by doing start % letters.length
        for ex. lets assume letters.length = 4
        if start exceeds letters.length -1 then, starts will be 4
         so start % letters.length = 4 % 4 = 0
         which gives us the 0'th element and if the target element is greater than letters.length -1*/
    }
}
