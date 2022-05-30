public class SqareRoot {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(findSqrt(a));
    }

    static int findSqrt(int x) {
        long start = 0;
        long end = x;
        long mid;
        while (start + 1 < end){
            mid = start + (end - start) / 2;
            if (mid * mid == x){
                return (int) mid;
            }else if (mid * mid > x){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        if (end * end == x){
            return (int) x;
        }
        return (int) start;
    }

}
