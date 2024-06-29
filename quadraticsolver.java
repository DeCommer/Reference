

public class quadraticsolver {

    public static void main(String[] args) {
        System.out.println(quadSolutions(2, 3, -2));
    }

    public static String quadSolutions(int a, int b, int c) {

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double pos = (-b + Math.sqrt(discriminant)) / (2*a);
        double neg = (-b - Math.sqrt(discriminant)) / (2*a);
        String result = "The result is: " + neg + " and " + pos;

        return result;
    }

}
