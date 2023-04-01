public class Main {


    public static void main(String[] args) {

        DemoClass planet = new DemoClass("Earth", 150_000_000L, 60_000_000_000L, 12756l, 24);
        DemoClass planet2 = new DemoClass("Venus", 660_827_000L, 186_000_000_000_000L, 7520, 243);
        

        System.out.println("The planet " + planet.getName() + 
        " is approximately " + planet.getDistFromSun() + "km from the Sun");

        System.out.println("The planet " + planet2.getName() + 
        " is approximately " + planet2.getDistFromSun() + "km from the Sun");

    }
}