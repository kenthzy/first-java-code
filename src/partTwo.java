import java.util.Scanner;

public class partTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        /*System.out.print("Type any number : ");
        int number = Integer.valueOf(reader.nextLine());
        System.out.println("The square of " + number + " = "+ (number * number));

        System.out.print("Type 1st number : ");
        int numUser = Integer.valueOf(reader.nextLine());
        System.out.print("Type 2nd number : ");
        int userNum = Integer.valueOf(reader.nextLine());

        double squareR = Math.sqrt(numUser + userNum);
        System.out.println("The square root of " + numUser + " + " + userNum + " is : "+ (numUser + userNum)+ " = "+ squareR);

        System.out.println("Give a Number : ");
        int value = Integer.valueOf(reader.nextLine());

        if (value < 0)  {
            System.out.println(value * -1);
        } else {
            System.out.println(value);
        }

        System.out.println("first number : ");
        int first = Integer.valueOf(reader.nextLine());
        System.out.println("second number : ");
        int second = Integer.valueOf(reader.nextLine());

        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else if (first < second) {
            System.out.println(first + " is smaller value than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }*/

       /* while (true) {
            System.out.println("Shall we carry on?");
            String input = reader.nextLine();
                if (input.equals("no")) {
                    break;
                }
        }


        while (true) {
            System.out.println("Input a number, 0 to quit");
            int command = Integer.valueOf(reader.nextLine());
            if (command == 0) {
                break;
            }

            System.out.println("You input " + command);
        }

        System.out.println("Done, thank you!");*/

        /*while (true) {
            System.out.println("Give a number :: ");
            int number = Integer.valueOf(reader.nextLine());
                if (number == 4) {
                    System.out.println("your input was correct");
                    break; *//*is for loop to stop if it's < continue > the program will repeat the loop*//*
                }
                System.out.println("Your input  :: " + number + " is wrong pls try again!");
        }*/


        /*while (true) {
            System.out.println("Insert positive integers");
            int number = Integer.valueOf(reader.nextLine());

            if (number <= 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }

            System.out.println("Your input was " + number);
        }*/

        /*while (true) {
            System.out.println("Input positive numbers.");
            int number = Integer.valueOf(reader.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }

            System.out.println("Your input was " + number);
        }*/

     /*

     // The task is to repeat the block until the block is exited
        while (true) {
            // The task is to ask the user for an input
            System.out.print("Give a number: ");
            // The task is to read a number from the user
            int number = Integer.valueOf(reader.nextLine());

            // The task is to guard and prevent unfit numbers
            // for further processing
            if (number == 0) {
                break;
            }
            // The task is to check if the loop should be exited
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            // The task is to print the square of the number
            System.out.println("your input is: " + number + " to the power of 2 is:" + (number * number));
            }

           // In the example below, the program computes the total of number ones inputted.
           // The task is to keep track of number ones

            int ones = 0;

         // The task is to read an input from the user
            while (true) {
            System.out.println("Give a number (end with 0): ");
         // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

         // The task is to exit the loop if the user
         // has inputted zero
            if (number == 0) {
                break;
              }
                // The task is to increase the amount of ones
                // if the user inputs a number one
                   if (number == 1) {
                       ones = ones + 1;
                     }
                  }
                // The task is to print out the total of ones
                   System.out.println("The total of ones: " + ones); */


        /*int numInput = 0;
        while (true) {
            System.out.println("Give me a number: ");
            int numValue = Integer.valueOf(reader.nextLine());

            if (numValue == 0) {
                break;
            }

            if (numValue >= 1) {
                numInput = numInput + 1;
            }
            System.out.println("The total ones: " + numInput);
    }*/

       /* int numStore = 0;

        while (true) {
            System.out.println("Give me negative numbers: ");
            int numInput = Integer.valueOf(reader.nextLine());

            if (numInput == 0) {
                break;
            }
            if (numInput < 0) {
                numStore = numStore + 1;
            }
        }
         System.out.println("Total of negative that you input: " + numStore);*/

/*
    int store = 0;

    while (true) {
        System.out.println("Give me numbers: ");
        int input = Integer.valueOf(reader.nextLine());

        if (input == 0) {
            break;
        }
            store += input; // sum of all input
    }
        System.out.println("The total sum that you input was: " + store);
*/

        // The += operator is used to collect and accumulate the sum of inputs or values.
        // it's used inside a loop to continuously add the numbers entered by the user to the running total
        // So, as the user enters more numbers, each one is added to the running total,
        // and you end up with the sum of all the inputs when the loop finishes.


        // Sometimes you need to use multiple variables
    /*    // For saving number of numbers
        int numberOfPositives = 0;
        int numberOfNegatives = 0;

        // For repeatedly asking for numbers
        while (true) {
            System.out.println("Give a number (0 to stop): ");
            // For reading user input
            int numberFromUser = Integer.valueOf(reader.nextLine());

            // For breaking the loop when user writes 0
            if (numberFromUser == 0) {
                break;
            }

            // For increasing numberOfPositives by one
            // when user gives a positive number
            if (numberFromUser > 0) {
                numberOfPositives = numberOfPositives + 1;
            }

            // For increasing numberOfNegatives by one
            // when user gives a negative number
            if (numberFromUser < 0) {
                numberOfNegatives = numberOfNegatives + 1;
            }

            // Also, could have used
            // if (numberFromUser > 0) {
            //     numberOfPositives = numberOfPositives + 1;
            // } else {
            //     numberOfNegatives = numberOfNegatives + 1;
            // }

        }

        // For printing the number of positive numbers
        System.out.println("Positive numbers: " + numberOfPositives);
        // For printing the number of negative numbers
        System.out.println("Negative numbers: " + numberOfNegatives);

        // For printing the percentage of positive numbers from all numbers

        if (numberOfPositives + numberOfNegatives > 0) {
            // Print only if user has given numbers
            // to avoid dividing by zero
            double percentageOfPositives = 100.0 * numberOfPositives / (numberOfPositives + numberOfNegatives);
            System.out.println("Percentage of positive numbers: " + percentageOfPositives + "%");
        }*/

      /*
        int numSum = 0;
        int numTotal = 0;

        while (true) {
            System.out.println("Give a number (negative are not counted");
            int userGives = Integer.valueOf(reader.nextLine());

            if (userGives == 0) {
                break;
            }
            if (userGives > 0) {
                numTotal = numTotal + 1;
                numSum = numSum + userGives;

            }
        }
        System.out.println("Total numbers: " + numTotal);
        System.out.println("Sum of numbers: " + numSum);


        int totalSum = 0;
        int totalNum = 0;

        while (true) {
            System.out.println("Give me a number :: ");
            int userNum = Integer.valueOf(reader.nextLine());

            if (userNum == 0) {
                break;
            }
            totalNum = totalNum + 1;
            totalSum = totalSum + userNum;
        }
        double averageGrade = totalSum / totalNum;
        System.out.println("Average of the number: " + averageGrade );*/


        // Write a program that asks the user for input until the user inputs 0. After this,
        // the program prints the average of the positive numbers (numbers that are greater than zero).
        // If no positive number is inputted, the program prints "Cannot calculate the average"

      /*
        int userInput = 0;
        int inputSum = 0;

        while (true) {
            System.out.println("Input number: ");
            int getValue = Integer.valueOf(reader.nextLine());

            if (getValue == 0) {
                break;
            }
            inputSum = inputSum + getValue;
            userInput = userInput + 1;
        }
        if (inputSum > 0) {
            double percentNum = (double) inputSum / userInput;
            System.out.println("The total average was: " + percentNum);
        } else {
            System.out.println("Cannot calculate the average");
        }*/

        // The following code prints the numbers 1,2,...,5. When the value of the variable number is more than 5,
        // the while-condition evaluates to false and the execution of the loop ends for good.

        /*int number = 1;

        while (number < 6) {
            System.out.println(number);
            number++;
        }*/

        //FOR LOOP

        // The same can be achieved with a for loop like so.
        //   for (int i = 0; i < 6; i++) {
        //        System.out.println(i);
        // }
        // for (*introducing a variable*; *condition*; *increasing the counter*) {
        //    // Functionality to be executed
        //}


        // Write a program that reads an integer from the user.
        // Next, the program prints numbers from 0 to the number given by the user.
        System.out.println("type any number: ");
        int typeUser = Integer.valueOf(reader.nextLine());

        for (int i = 0; i <= typeUser; i++) {
            System.out.println(i);
        }

        // Write a program, which reads an integer from the user.
        // Then the program prints numbers from that number to 100.
        System.out.println("Give number below 100: ");
        int numGive = Integer.valueOf(reader.nextLine());

        for (int i = numGive; i <= 100; i++) {
            System.out.println(i);
        }

        // Write a program which prints the integers from 1 to a number given by the user.
        System.out.println("Give me some numbers: ");
        int userPut = Integer.valueOf(reader.nextLine());

        for (int i = 1; i <= userPut; i++) {
            System.out.println(i);
        }

        // Write a program which prints the integers from 1 to a number given by the user.
        System.out.println("Where to? ");
        int where = Integer.valueOf(reader.nextLine());
        System.out.println("Where from?");
        int from = Integer.valueOf(reader.nextLine());

        for (int i = from; i <= where; i++) {
            System.out.println(i);
        }

              /*  int tulos = 0;

                int i = 0;
                while (i < 4) {
                    tulos = tulos + 3;
                    i++;
                }

                System.out.println(tulos);
                tulos	12
                i	     4*/


        // Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
        /*int sums = 0;
        System.out.println("Last number? ");
        int lastNumber = Integer.valueOf(reader.nextLine());

        for (int i = 1; i < lastNumber; i++) {
            sums = sums + i;
        }
        System.out.println("The sum is " + sums );*/


        // Implement a program which calculates the sum of a closed interval, and prints it.
        // Expect the user to write the smaller number first and then the larger number.
        int sums = 0;
        System.out.println("First number: ");
        int fNum = Integer.valueOf(reader.nextLine());
        System.out.println("Second number: ");
        int sNum = Integer.valueOf(reader.nextLine());

        for (int i = fNum; i <= sNum; i++) {
            sums = sums + i;
        }
        System.out.println("The sum is: " + sums);


        //Implement a program which calculates the factorial of a number given by the user.
        //Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n.
        long f = 1;
        System.out.println("Give a number: ");
        int n = Integer.valueOf(reader.nextLine());

        for (int i = 1; i < n; i++) {
            f = f * i;
        }
        System.out.println("Factorial: " + f);


        // Let's stick to the following loop structure:
        // In other words,the program structure is cleaner
        // if the things to be done after the loop ends are placed outside of it.

     /*   System.out.print("Write numbers, negative numbers are invalid: ");
        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;

        while (true) {
            int input = Integer.valueOf(reader.nextLine());

            if (input == 0) {
                break;
            }

            if (input < 0) {
                invalidNumbers++;
                continue;
            }

            sum = sum + input;
            validNumbers++;
        }

        System.out.println("Sum of valid numbers: " + sum);
        System.out.println("Valid numbers: " + validNumbers);
        System.out.println("Invalid numbers: " + invalidNumbers);*/


        System.out.println("More loops final activity");
        int total = 0;
        int xy = 0;
        int odd = 0;
        int even = 0;
        double average = 0;
        while (true) {
            System.out.println("Give me a numbers");
            int y = Integer.valueOf(reader.nextLine());

            if (y == -1) {
                break;
            } else if (y > -1) {
                total = total + y;
                xy = xy + 1;

                if (y % 2 == 1) {
                    odd = odd + 1;
                } else {
                    even = even + 1;
                }
            }
        }
        average = (double) total / xy;
        System.out.println("Thx! Bye!");
        System.out.println("The sum: " + total);
        System.out.println("Numbers: " + xy);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}