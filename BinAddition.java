public class BinAddition {
    public static void main(String[] args) {
        int a = 3, b = 9;

        System.out.println(binaryAddition(a, b));
    }

    public static String binaryAddition(int a, int b){
        int addAns =  a + b; // 10
        int remainder = 0;
        String rToStr = "";
        String revStr = "";
        
        while(addAns != 0) { // 10
            int divAns = addAns / 2; // returns 5, then 2, then 1
            remainder = addAns % 2; // returns remainder
            addAns = divAns;

            rToStr = Integer.toString(remainder);
            for(int r = 0; r < rToStr.length() ; r++) {
                revStr = rToStr.charAt(r)  + revStr;
            }
        }    
    return revStr;
  }
}
