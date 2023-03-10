import java.util.SplittableRandom;


public class Probability {
    public static void main(String[] blergs) {


        SplittableRandom rand = new SplittableRandom();
        boolean unknown = rand.nextInt(1, 100 + 1) <= 50; //50% chance of being true or false, added plus 1 to be explicit
        boolean probFalse = rand.nextInt(10) == 1; //10% chance of being true
        System.out.print(unknown + " " + probFalse);

    }
}
