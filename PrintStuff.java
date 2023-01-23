public class PrintStuff {


    public static void main(String[] args) {



        //halfPy();
        pascal();

    }

    /* 
       #
       # #
       # # #
       # # # #
       # # # # #
    */
    static void halfPy() {
        int nRows = 5;
        for(int i = 1; i <= nRows; i++) {
            System.out.print("* " + " ");
            for(int j= 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    /* 
     *               1
                   1   1
                 1   2   1
               1   3   3   1
             1   4   6   4   1
        ... 
     */

    static void pascal() {
        int nRows = 10, coeff = 1;
        for(int i = 0; i < nRows; i++){
            System.out.print(i + 1);
            for(int separation = 1; separation < nRows - i; separation++) {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                if(j == 0 || i == 0 ) {
                    coeff = 1;
                }else {
                    coeff = coeff * (i - j + 1) / j;
                }
                System.out.printf("%4d", coeff);
            }
            System.out.println();
        }
    }

}
