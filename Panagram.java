import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Panagram {

    public static void main(String[] args) {

        String sentence = "my girl wove six dozen plaid jackets before she quit";

        System.out.println(check(sentence));
    }

    public static boolean check(String sentence) {
        String replaced = sentence.replaceAll("[^A-Za-z]", "");

        System.out.println("Original sentence: " + sentence);
        System.out.println("Replaced sentence: " + replaced + " " + replaced.length());

        Set<String> letters = new HashSet<>(Arrays.asList(replaced.split("")));

        System.out.println(letters);

         if(letters.size() >= 26) 
            return true;
         else 
            return false;
    }

}
