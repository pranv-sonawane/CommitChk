public class Pattern1 {
    public static void main(String[] args) {
        pat12(4);
    }
    static void pat1(int n){
//    *
//    * *
//    * * *
//    * * * *
        // the outer loop will run the no. of times the rows are
        for (int rows = 1; rows <= n; rows++) {
            // For every row run the column
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print("* ");
            }
            //when row is printed we need to add a new line
            System.out.println(" ");
        }
    }
    static void pat2(int n){
//        * * * *
//        * * * *
//        * * * *
//        * * * *
        // the outer loop will run the no. of times the rows are
        for (int rows = 1; rows <= n; rows++) {
            // For every row run the column
            for (int cols = 1; cols <= n ; cols++) {
                System.out.print("* ");
            }
            //when row is printed we need to add a new line
            System.out.println(" ");
        }
    }
    static void pat3(int n){
//        * * * *
//        * * *
//        * *
//        *
        // the outer loop will run the no. of times the rows are
        for (int rows = 1; rows <= n; rows++) {
            // For every row run the column
            for (int cols = 1; cols <= n - rows + 1 ; cols++) {
                System.out.print("* ");
            }
            //when row is printed we need to add a new line
            System.out.println(" ");
        }
    }
    static void pat4(int n){
        // the outer loop will run the no. of times the rows are
        for (int rows = 1; rows <= n; rows++) {

            // For every row run the column
            for (int cols = 1; cols <= n - rows + 1 ; cols++) {
                System.out.print(cols);
            }
            //when row is printed we need to add a new line
            System.out.println(" ");
        }
    }
    static void pat5(int n){
        for (int rows = 1; rows < n * 2; rows++) {
            int totalCols = rows > n ? 2 * n -rows : rows;
                int c = n - totalCols;
            for (int spaces = 0; spaces < c; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < totalCols ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println("");
        }
    }
    static void pat12(int n){
        for (int rows = 1; rows <= n * 2; rows++) {
            int totalCols = n < rows ? n * 2 - rows : n- rows;
            for (int cols = 0; cols <= totalCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
