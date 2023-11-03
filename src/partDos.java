import java.util.Scanner;
public class partDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  yX();
        zxY(3,7);
        xY(5);
        qwerty(5,10);*/
        /*int sum = number(5,10);
        System.out.println(sum);
        String word = vx("you're the one that got away!!!");
        System.out.println(word);

        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
    
        double averageResult = average(first, second, third);

        System.out.print("The average of the numbers: " + averageResult);

        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);*/

        int answer = smallest(10, 200);
        System.out.println("Smallest: " + answer);

        int choice = greatest(2, 7, 11);
        System.out.println("Greatest: " + choice);

        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);

        int begin = 1;
        int end = 5;
        triangle(begin,end);

        printsquare(4);

        printRectangle(3,17);

        printTriangle(5);

        printInverseTriangle(6);

        printXmasTree(10);
    }

    //Expand the previous program so that the main program asks the user for the number of times
    // the phrase will be printed (i.e. how many times the method will be called).
    public static void yX() {
        Scanner r = new Scanner(System.in);
        System.out.println("How many times? ");
        int n = Integer.valueOf(r.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }
    }

    // Expand the previous program so that the main program asks the user for the number of times
    // the phrase will be printed (i.e. how many times the method will be called).
    public static void xY(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    // Write a method public static void division(int numerator, int denominator) that prints the result of the division of the numerator by the denominator.
    // Keep in mind that the result of the division of the integers is an integer — in this case we want the result to be a floating point number.
    public static void zxY(int numerator, int denominator) {
        float n = numerator * denominator;
        System.out.println(n);
    }

    // Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers
    // divisible by three in the given range. The numbers are to be printed in order from the smallest to the greatest.
    public static void qwerty(int begin, int end) {

        for (int i = begin; i <= end; i++) {
            if (i % 3 == 1) {
                System.out.println(i);
            }
        }

    }

    public static int number(int a, int b) {
        return a + b;
    }

    public static String vx(String s) {
        return s.toUpperCase();
    }

    public static double average(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        double avg = sum / 3.0;

        return avg;
    }

    // Expand the method sum in the exercise template so that it calculates and returns the sum
    // of the numbers that are given as the parameters.
    public static int sum(int number1, int number2, int number3, int number4) {
        // write your code here
        // remember to include return (at the end)!
        int total = (number1 + number2 + number3 + number4);
        return total;
    }


    //Define a two-parameter method smallest that returns the smaller of the two numbers passed to it as parameters.
    public static int smallest(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        }
        return number3;
    }

    // Create a method called average that calculates the average of the numbers passed as parameters.
    // The previously created method sum must be used inside this method!
    public static int totalSum(int number1, int number2, int number3, int number4) {
        // you can copy your implementation of the method sum here
        int all = (number1 + number2 + number3 + number4);
        return all;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        // calculate the sum of the elements by calling the method sum
        double divide = totalSum(number1, number2 , number3 , number4);
        double done = divide / 4;
        return done;
    }
    public static void triangle(int begin, int end) {
        while (begin <= end) {
            System.out.println("*");
            begin++;
        }
    }
    public static void printStars(int number) {
        // you can print one star with the command
        for (int via = 0; via <= number; via++) {
            System.out.print(" *");
        }
        System.out.println("");

        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
    }
    public static void printsquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
    }
    public  static void printRectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            printStars(height);
        }
    }
    public static void printTriangle(int size) {
        for (int i = 0; i <= size ; i++) {
            printStars(i);
        }
    }
    public static void printInverseTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i <= size; i++) {
            System.out.println("  ".repeat(size - i) + "* ".repeat(i));
        }
    }
    public static void printXmasTree(int count) {
        for (int x = 1; x <= count; x++) {
            System.out.println(" ".repeat(count - x) + " *".repeat(x));
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("     ");
            printStars(3);
        }

    }
}