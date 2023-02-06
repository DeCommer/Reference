// import java.util.Scanner;
public class Series {
    public static void main(String[] args) {

        int n = 15;
        System.out.println(sumSeries(n));
        
    }

    //Sum of series
	public static String sumSeries(int n) {
		double sum = 0.0;
		for (int i = 0; i < n; i++)
			sum += 1.0 / (1 + 3 * i);

		return String.format("%.2f", sum);
	}

}
