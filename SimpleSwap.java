public class SimpleSwap {
    public static void main(String[] args) {
       int x = 1;
        int y = 2;
        int temp;
        System.out.println("Before swap " + x + " " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swap " + x + " " + y);
    }
}
