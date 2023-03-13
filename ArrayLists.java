import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>(); //declaring list
        ArrayList<Integer> numbers = new ArrayList<>(); // declaring list

        //adding elements
        guests.add("Constance");
        guests.add("Joseph");
        guests.add("Spoons");
        guests.add("Dooder");

        guests.remove(String.valueOf("Dooder"));

        System.out.println(guests.toString());
        System.out.println(guests.get(0));
        System.out.println(guests.contains("Spoons"));

        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(0);
        numbers.add(6);
        numbers.add(4);
        numbers.add(1);   

        System.out.println(numbers.size());
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.contains(Integer.valueOf(1)));
        //.isempty(); is another method

        //numbers.remove(3); //removes a value at an index
        //numbers.remove(Integer.valueOf(2)); // removes a specific value
        //numbers.clear(); //clears the entire array
        //numbers.set(2, Integer.valueOf(100)); //replaces value at index with specific value
 
        System.out.println(numbers.toString()); //returns entire list
        //System.out.println(numbers.get(0)); returns a specific index

        guests.forEach(guest -> {
            System.out.println("Hello, " + guest);
        });

        // Are you on the list?
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        if(guests.contains(name)) {
            System.out.println("You are on the list");
        }else {
            System.out.println("Get outta here!");
        }
        input.close();

        //Create an ArrayList from another collection using 
        //ArrayList(collector c) constructor.

        // create array list object
        List<Integer> firstFivePrimes = new ArrayList<>();
        firstFivePrimes.add(2);
        firstFivePrimes.add(3);
        firstFivePrimes.add(5);
        firstFivePrimes.add(7);
        firstFivePrimes.add(11);

        //Add list to another

        List<Integer> firstTenPrimes = new ArrayList<>(firstFivePrimes);

        List<Integer> nextFivePrimes = new ArrayList<>();
        nextFivePrimes.add(13);
        nextFivePrimes.add(17);
        nextFivePrimes.add(19);
        nextFivePrimes.add(23);
        nextFivePrimes.add(29);

        firstTenPrimes.addAll(nextFivePrimes);

        System.out.println(firstTenPrimes);
    }
// List Filtering
    public static List<Object> filterList(final List<Object> list) {
      
        List<Object> output = new ArrayList<Object>();
         for (Object element : list) {
            if (element instanceof Integer) {
                   output.add((Integer) element);
               }
         }
       
       return output;
     }
 
}


  
