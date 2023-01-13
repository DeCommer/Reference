public class Variables {
    /*
     * To declare first write data type, then name of variable, the semicolon
     * Or after the name an equal sign can be included folowed by a value then
     * closed with a semicolon
     * 
     * 
     */

     static int globalVar = 1000; // This is a global variable available every where   
     public static void main(String[] args) { // start of main

        //variables here are local while inside a method. In this case "main"

        int varOne;
        String varTwo = "A string variable"; // declared and initialized
        String nameVariablesWithCamelCase = "First letter with lovercase and every\n next letter with first letter capitalized";
        
        varOne = 1979; // This is the int variable declared earlier now initialized

        System.out.println(varOne + " is an int,  " + varTwo);
        System.out.println(globalVar);
        System.out.println(nameVariablesWithCamelCase);

        globalExample();

        // cannot assign a variable twice
     } // end of main

     public static void globalExample() {
        globalVar++;
        System.out.println("This is being called outside the main method: " + globalVar);
     }
}
