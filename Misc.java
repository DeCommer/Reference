import java.util.Arrays;

public class Misc {

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(digitize(320410)));
    }

    

    public static int[] digitize(long n) {
        String numStr = String.valueOf(n); 
        int digits[] = new int[numStr.length()];
        int counter = 0;
        for(int i = numStr.length() - 1; i >= 0; i--) {
          digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
        }
        return digits;
      }
}
