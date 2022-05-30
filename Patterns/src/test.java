public class test {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int rows = 0; rows < 2 * n; rows++) {
            int totalCols = rows > n ? rows - n : n - rows;
            int c = n - totalCols;
            for (int i = 0; i < c; i++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < totalCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
