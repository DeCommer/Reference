public class Main {


    public static void main(String[] args) {

        DemoClass planet = new DemoClass("Earth", 150_000_000L, 60_000_000_000L, 12756l, 24);
        

        System.out.println("The planet " + planet.getName() + 
        " is approximately " + planet.getDistFromSun() + "km from the Sun");

    }
}