class DataTypes { //Class name must have same exact name as file, is case sensitive
  public static void main(String[] args) { //This is the next step of creating a java program

    // Variables
    String varString = "A string of text";
    int varInt = 1234; // Positive and negative numbers
    float varFloat = 1.234F; // Decimal values
    double varDouble = 5.6789101112; //More precise decimal values
   // char varChar = 'j'; // Character variables
    boolean varBool = false; // true or false


    //Data types
    byte oneByte = 127; // values from -128 to 127
    short twoBytes = 32_767; // values from -32,768 to 32,767
    int fourBytes = 2_147_483_647; // Values from -2147483648 to 2147483647;
    long eightBytes = 9_223_372_036_854_775_807L; // Values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float fourBytesF = 99.234567890F; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double eightBytesD = 1.1234567890; // Stores fractional numbers. Sufficient for storing 15 decimal digits
    //boolean oneBit = true; // Holds true of false values only
    char twoBytesC = 'C'; // Stores single character/letter or ASCII value

    //Operators
    System.out.println(oneByte + oneByte); // Addition
    System.out.println(fourBytes - twoBytes); // Subtraction
    System.out.println(oneByte * oneByte);
    System.out.println(fourBytesF / eightBytesD); // Division
    System.out.println(varInt % oneByte); // Modulus, returns remainder
    System.out.println(++varFloat); //Increment
    System.out.println(--eightBytes); //Decrement

    //Concatenation
    System.out.println("Senetences can be joined with variables or values " + "\"" + varString + "\" " + fourBytes);
    
    //Conditionals
    System.out.println(varDouble < varFloat);
    if(varBool == true) {
      System.out.println(twoBytesC);
    }

    


  }
}