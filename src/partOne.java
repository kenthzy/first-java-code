// Introduce the scanner tool used for reading user input

import java.util.Scanner;


public class partOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // We can now use the scanner tool.
        // This tool is used to read input

        //for color of console
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";

        // Print colored text
        System.out.println(red);//this is red
        //System.out.println(green + "This is green text" + reset);
        //System.out.println(yellow + "This is yellow text" + reset);

        //KENNETH GONZALES
        System.out.println(" ");
        System.out.println("\t\t\t===================================== ");
        System.out.println("\t\t\t||        Hello and Welcome!       ||");
        System.out.println("\t\t\t||       Programming in Java       ||");
        System.out.println("\t\t\t||         Code by Kenneth         ||");
        System.out.println("\t\t\t=====================================\n");
        System.out.println("\t\t\t<<><><><><><><><<*>><><><><><><><><>>\n");
        System.out.println( reset + green);

        /*
        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        System.out.print("\t\t\t Hi what is your name? ");
        String name = scanner.nextLine();
        System.out.print("\n\t\t\t So what is your favorite color? ");
        String color = scanner.nextLine();
        System.out.print("\n\t\t\t What is your dream destination? ");
        String country = scanner.nextLine();

        // Print the message written by the user
        System.out.println("\n\t\t\t Hello! (" + name + ") Nice to meet you!\n");
        System.out.println("\t\t\t I see your favorite color is (" + color + ") that was awesome color! \n");
        System.out.println("\t\t\t And your dream destination was (" + country + ") be sure to make a companion when you go there.\n");
        */
        // tips sout shortcut for = System.out.println();


        /* String text = "contains text";
         int months = 12; // the variable months is assigned the value 12
         months = 45;
         double floatingPoint = 3.141592653;
         boolean trueOrFalse = true; */

        // A variable's type determines the types of values that can be assigned to it.
        // String types hold text,
        // int types whole numbers,
        // double floating-point numbers
        // boolean types are either true or false.
        /* System.out.println("Text variable: " + text);
         System.out.println("Integer variable: " + months);
         System.out.println("Floating-point variable: " + floatingPoint);
         System.out.println("Boolean: " + trueOrFalse);
         System.out.println(text + months + floatingPoint + trueOrFalse); */

        /* double pi = 3.14;
         double radius = 22.0;
         double surfaceArea = pi * radius * radius;
         System.out.println(surfaceArea); */

        //Java is to use a style known as camelCase. Note! The first letter of a variable name is always lower-cased
        //Numbers can be used within a variable name as long as the name does not begin with a number.
        // Also, a name cannot consist of numbers only.
        //Permissible Variable Names
        //lastDayOfMonth = 20
        //firstYear = 1952
        //name = "Essi"


        // The Integer.valueOf command converts a string to an integer.
        // It takes the string containing the value to be converted as a parameter.
        /* String valueAsString = "42";
        int value = Integer.valueOf(valueAsString);
        System.out.println(value); */


        //When using a Scanner object, the reading of the value is usually inserted directly into the type conversion.
       /* System.out.println("Write a value ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value); */

        //The Double.valueOf command converts a string to a double.
        // It takes the string containing the value to be converted as a parameter.
        /* String valueAsString = "42.42";
        double value = Double.valueOf(valueAsString);
        System.out.println(value); */

        //As with integers, the reading is nested within the conversion. This is done as follows:
        //System.out.println("Write a value ");
        //double value = Double.valueOf(scanner.nextLine());
        //System.out.println("You wrote " + value);
        //It's possible to also read an integer variable into a double,
        // in which case the value is converted automatically to type double.
        // The example below demonstrates how the previous program functions when the user inputs an integer.


        // The Integer.valueOf command converts a string to an integer and
        // the Double.valueOf converts it to a floating-point.
        // The valueOf command also appears when converting a string to a boolean —
        // this is done with the command Boolean.valueOf.

       /* System.out.print("\n\t\t\t Write a boolean ");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("\t\t\t The result was: " + value);

        System.out.print("\n\t\t\t Write a Text ");
        String text = scanner.nextLine();
        System.out.println("\t\t\t You write " + text);

        System.out.print("\n\t\t\t Type a Whole Number  "); 
        int wholeNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("\t\t\t You Type the number " + wholeNumber);

        System.out.print("\n\t\t\t Type a Number with Decimal ");
        double floatingPoint = Double.valueOf(scanner.nextLine());
        System.out.println("\t\t\t The Result was " + floatingPoint);
        // and so on

        // Precedence and Parentheses
        //You can affect the order of operations by using parentheses.
        //Operations within parentheses are performed before those outside them.

         int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
        System.out.println("\n\t\t\t The Result was: "+ calculationWithParentheses); // prints 23
        int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
        System.out.println("\n\t\t\t The Result was: "+ calculationWithoutParentheses); // prints 13

        System.out.print("\n\t\t\t Enter the number of days: ");
        int days = scanner.nextInt();

        int seconds = days * 24 * 60 * 60;
        System.out.println(days + " days is equal to " + seconds + " seconds."); */

        // The precedence introduced earlier also apply here:

        /* System.out.println("Four: " + (2 + 2));
        System.out.println("But! Twenty-two: " + 2 + 2); */

        /*
        System.out.print("\t\t\t1st Subject Grade : ");
        double firstNumber = Double.valueOf(scanner.nextLine());

        System.out.print("\n\t\t\t2nd Subject Grade : ");
        double secondNumber = Double.valueOf(scanner.nextLine());

        System.out.print("\n\t\t\t3rd Subject Grade : ");
        double thirdNumber = Double.valueOf(scanner.nextLine());

        System.out.print("\n\t\t\t4th Subject Grade : ");
        double fourthNumber = Double.valueOf(scanner.nextLine());

        System.out.print("\n\t\t\t"+ firstNumber+ " + " + secondNumber + " + " + thirdNumber + " + " + fourthNumber +" = ");
        System.out.println("\t\t\tThe overall grade average  :: " + (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4 );
         */
        /*
        System.out.print("\n\t\t\t Give a Year :");
        int year = Integer.valueOf(scanner.nextLine());
        if (year < 2014 ) {
                System.out.println("\n\t\t\t Ancient History");
        } else {
                System.out.println("\n\t\t\t Modern");
        }
        */
        /*
        System.out.println("Give the first number: ");
        int choice = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int choices = Integer.valueOf(scanner.nextLine());


        if (choice > choices) {
            System.out.println("First number is Greater " + choice);
        } else if (choice < choices) {
            System.out.println("Second number is Greater" + choices);
        } else {
            System.out.println("The number is equal" +choice);
        }
    */

//Comparison Operators
//> greater than
//>= greater than or equal to
//< less than
//<= less than or equal to
//== equal to
//!= not equal to

        System.out.print("Check the Grade Equivalent: ");
        int choice = Integer.valueOf(scanner.nextLine());
        String up = "Grade :";
        if (choice == 0) {
            System.out.println( up + " Impossible");
        } else if (choice <= 49) {
            System.out.println(up + "failed");
        } else if (choice <= 59) {
            System.out.println(up + "1");
        } else if (choice <= 69) {
            System.out.println(up + "2");
        } else if (choice <= 79) {
            System.out.println(up + "3");
        } else if (choice <= 89) {
            System.out.println(up + "4");
        } else if (choice <= 99) {
            System.out.println(up + "5");
        } else if (choice == 100) {
            System.out.println("Incredible");
        } else {
            System.out.println("Invalid");
        }
        /*
        int first = 1;
        int second = 3;
        boolean isLessThan = first < second;

        if (isLessThan) {
            System.out.println("1 is less than 3!");
        }
        */
        /*
         if (number % 400 == 0) {
            System.out.println("The number " + number + " is divisible by four hundred.");
        } else {
            System.out.println("The number " + number + " is not divisible by four hundred.");
        }
        */

        /*
        System.out.println("type a number : ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        */

        /*
        System.out.println("Enter the first string");
        String first = scanner.nextLine();
        System.out.println("Enter the second string");
        String second = scanner.nextLine();

        if (first == second) {
            System.out.println("The strings were the same!");
        } else {
            System.out.println("The strings were different!");
        */

        /*
        System.out.println("Enter a string");
        String input = reader.nextLine();

        if (input.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        } else {
            System.out.println("Missed the mark!");
        }
         */
        /*
        System.out.println("Input two strings");
            String first = reader.nextLine();
            String second = reader.nextLine();

                if (first.equals(second)) {
                    System.out.println("The strings were the same!");
                } else {
                    System.out.println("The strings were different!");
                }

                if (first.equals("two strings")) {
                    System.out.println("Clever!");
                }

                if (second.equals("two strings")) {
                    System.out.println("Sneaky!");
                }
         */
        //Write a program that prompts the user for a password.
        // If the password is "draco" the program prints "Welcome!". Otherwise, the program prints "Off with you!"

        System.out.println("What is the secret password ? ");
        String password = scanner.nextLine();

        if (password.equals("draco")) {
            System.out.println("Welcome Master");
        } else {
            System.out.println("Your Imposter");
        }

            //Logical Operators
        // OR = || (both conditions need to be true so program can run)
        // AND = && (either conditions needs to be true)
        // NOT = ! (inverts the current conditions)

        /*
        System.out.println("Is the number within the range 5-10: ");
            int number = 7;

            if (number >= 5 && number <= 10) {
                System.out.println("It is! :)");
            } else {
                System.out.println("It is not :(")
            }
            Sample output
                Is the number within the range 5-10:
                It is! :)
         */

        /*
        System.out.println("Is the number less than 0 or greater than 100");
                int number = 145;

                if (number < 0 || number > 100) {
                    System.out.println("It is! :)");
                } else {
                    System.out.println("It is not :(")
                }
                Sample output
                Is the number less than 0 or greater than 100
                It is! :)
         */
        /*
        int number = 7;

            if (!(number > 4)) {
                System.out.println("The number is not greater than 4.");
            } else {
                System.out.println("The number is greater than 4.")
            }
         */
        //always apply the concept of true or false
        System.out.println(reset + yellow);
        System.out.println("How Old are You? ");
        int age = Integer.valueOf(scanner.nextLine());

        if (age <= 120 && age >= 0) {
            System.out.println("Good");
        } else {
            System.out.println("Impossible");
        }


        System.out.println("Give me a number 1 - 100 : ");
        int num = Integer.valueOf(scanner.nextLine());

        if (num % 3 == 0 && num % 5 == 0 ) {
            System.out.println("FIZZBUZZ!");
        } else if (num % 5 == 0) {
            System.out.println("Buzz!");
        } else if (num % 3 == 0) {
            System.out.println("Fizz!");
        }


        // year % 4 == 0 checks if the year is evenly divisible by 4. If it is, this condition is true.
        // year % 100 != 0 checks if the year is not evenly divisible by 100. If it is not, this condition is true.
        // year % 400 == 0 checks if the year is evenly divisible by 400. If it is, this condition is true.
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }


        System.out.println("Value of Gift ? ");
        int giftValue = Integer.valueOf(scanner.nextLine());

        if (giftValue < 5000) {
            System.out.println("No Tax");
        } else if (giftValue < 25000) {
            System.out.println("Amount of Tax: " + (100 + (giftValue - 5000) * 0.08) + " euros");
        } else if (giftValue < 55000) {
            System.out.println("Amount of Tax: " + (1700 + (giftValue - 25000) * 0.10) + " euros");
        } else if (giftValue < 200000) {
            System.out.println("Amount of Tax: " + (4700 + (giftValue - 55000) * 0.12) + " euros");
        } else if (giftValue < 1000000) {
            System.out.println("Amount of Tax: " + (22100 + (giftValue - 200000) * 0.15) + " euros");
        } else {
            System.out.println("Amount of Tax: " + (142100 + (giftValue - 1000000) * 0.17) + " euros");
        }
        //If the giftValue is less than 5000, it means there is no tax to pay, and it prints "No Tax."
        //
        //If the giftValue is between 5000 and 25000, it calculates the tax as 8% of the amount exceeding 5000 and adds 100 euros.
        // For example, if the gift value is 8000, the tax would be (8000 - 5000) * 0.08 + 100 = 340 euros.
        //
        //If the giftValue is between 25000 and 55000, it calculates the tax as 10% of the amount exceeding 25000 and adds 1700 euros.
        //
        //If the giftValue is between 55000 and 200000, it calculates the tax as 12% of the amount exceeding 55000 and adds 4700 euros.
        //
        //If the giftValue is between 200000 and 1000000, it calculates the tax as 15% of the amount exceeding 200000 and adds 22100 euros.
        //
        //If the giftValue is 1000000 or more, it calculates the tax as 17% of the amount exceeding 1000000 and adds 142100 euros.

    }
    }
