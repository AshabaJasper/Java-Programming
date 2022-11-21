public class Main {

    //variables can also be declared outside the main method
    static int age_three=35;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //variables
        int age;  //declaring a variable
        age=25;
        int age_two=15; //initializing a variable

        System.out.println("I am "+age+" years old.");
        System.out.println("I am "+age_two+" years old.");
        System.out.println("I am "+age_three+" years old.");



        //********* DataTypes*********
        //interger types
        byte is_a_single_byte=100; // number between -128 and 127
        short is_a_small_number=20000; //number between -32,768 and 32,767
        int is_an_interger=2147483647; //number between -2147483648 and 2147483647
        long is_a_large_number=9223372036854775807L; //number between -9223372036854775807 and 9223372036854775807

        //decimal types
        double is_a_double=1.79769313; //number between 4.9E-324 and 1.7976931348623157E08
        float is_a_float=3.4028F; //number between 1.4E-45 and 3.4028235E38

        //booleans
        boolean is_weekend=false;
        boolean is_workday=true;

        //characters
        char alphabet='a'; //can also be used to store any unicode character
        char copyright_symbol='\u00A9';

        System.out.println("This is  "+is_a_single_byte);
        System.out.println("This is  "+is_an_interger);
        System.out.println("This is  "+is_a_small_number);
        System.out.println("This is  "+is_a_large_number);
        System.out.println("This is  "+is_a_double);
        System.out.println("This is  "+is_a_float);
        System.out.println("This is  "+is_weekend);
        System.out.println("This is  "+is_workday);
        System.out.println("This is  "+alphabet);
        System.out.println("This is  "+copyright_symbol);



//**********type conversion in java******
        int interger_number_in_TC=50;
        double decimal_number_in_TC=interger_number_in_TC; //you cannot convert double to int normally

        System.out.println(interger_number_in_TC+" IS "+decimal_number_in_TC+"in decimal");

        //for you to convert double to int use [(datatype)variable]


//*********operators*******************
        //arithmetic operators
        int number1=10;
        int number2=5;
        System.out.println(number2+number1);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2); //if you divide an int with int you get an int-floor division
        //to get a decimal use the double data type
        System.out.println(number1%number2);

        //conditional operators



    }
}

