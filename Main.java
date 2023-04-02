public class Main {


    public static void main(String[] args) {

        DemoClass planet = new DemoClass("Earth", 150_000_000L, 12756l, 24);
        DemoClass planet2 = new DemoClass("Mars", 154_000_000L, 4212, 1);
        

        System.out.println("The planet " + planet.getName() + 
        " is approximately " + planet.getDistFromSun() + "km from the Sun");

        System.out.println("The planet " + planet2.getName() + 
        " is approximately " + planet2.getDistFromSun() + "km from the Sun");

    }
}