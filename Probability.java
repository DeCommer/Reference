import java.util.SplittableRandom;


public class Probability {
    public static void main(String[] blergs) {


        SplittableRandom rand = new SplittableRandom();
        boolean probFalse = rand.nextInt(10) == 1; //10% chance of being true
        boolean unknown = rand.nextInt(1, 100 + 1) <= 50; //50% chance of being true or false, added plus 1 to be explicit
        System.out.print(unknown + " " + probFalse);

    }
}
