//This jazz is going to be deleted

import java.util.Scanner;

public class Basics {
  public static void main(String[] args) {
    // Declare a variable of type int (integer)
    int x;
    // Declare a variable of type double (decimal number)
    double y;
    // Declare a variable of type boolean (true or false)
    boolean b;
    // Declare a variable of type char (single character)
    char c;
    // Declare a variable of type String (sequence of characters)
    String s;

    // Assign values to the variables
    x = 10;
    y = 3.14;
    b = true;
    c = 'A';
    s = "Hello, world!";

    // Print the values of the variables
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("s = " + s);
    
    //next
    // Declare a Scanner object to read input from the keyboard
    Scanner input = new Scanner(System.in);

    // Read an integer from the keyboard
    System.out.print("Enter an integer: ");
    int num = input.nextInt();

    // Read a double from the keyboard
    System.out.print("Enter a decimal number: ");
    double dec = input.nextDouble();

    // Read a boolean from the keyboard
    System.out.print("Enter a boolean value (true or false): ");
    boolean flag = input.nextBoolean();

    // Read a string from the keyboard
    System.out.print("Enter a string: ");
    String str = input.next();

    // Print the values that were read from the keyboard
    System.out.println("num = " + num);
    System.out.println("dec = " + dec);
    System.out.println("flag = " + flag);
    System.out.println("str = " + str);
  }
}
