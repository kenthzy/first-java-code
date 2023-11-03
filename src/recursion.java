import  java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class recursion {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String green = "\u001B[32m";
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";
        String red = "\u001B[31m";



        System.out.println(yellow);
        System.out.println(" ========================================");
        System.out.println(" ||                                    ||");
        System.out.println(" ||=====> PAYROLL SYSTEM GROUP 4  <====||");
        System.out.println(" ||                                    ||");
        System.out.println(" ========================================");
        System.out.println(reset + green);
        letterDelay();
        System.out.println(reset + red);
        payrollSystem();
    }

    public static void letterDelay() {
        String song = " ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇ ▇";
        for (int i = 0; i < song.length(); i++) {
            System.out.print(song.charAt(i));


            try {
                // Add a delay of 50 milliseconds between each letter
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
    }

    public static void assignmentOne() {
        String name = "Names: kenneth";
        int age = 2023;
        String address = "Address: phase4 b19 l8 e.r san isidro rod, rizal  ";
        String hobbies = "Hobbies: playing basketball";


        // answer yes or no
        String ask = "Did you love your course? ";
        boolean tf = true;


        System.out.println(age - 2002);
        System.out.println(address);
        System.out.println(hobbies);

        System.out.println(ask);
        System.out.println(tf);
    }

    public static void assignmentTwo()  {

        Scanner read = new Scanner(System.in);
        String name = "kenneth";
        double numOne = 7.987;
        char a = 0;
        float b = 78.9F;
        boolean x = true;
        byte g = (byte) 67676;
        short f = (short) 64736437;
        int num = 78;
        int nux = 76;
        long j = 673647;


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("*** Data Types in Java with Numbers ***");


        System.out.println(name + " = string"); //integers
        System.out.println(numOne + " = double"); //converted to double
        System.out.println(a + " = char"); //char;
        System.out.println(b + " = float");
        System.out.println(x + " = boolean");
        System.out.println(g + " = byte");
        System.out.println(f + " = short");
        System.out.println(num + " = integers");
        System.out.println(j + " = integers");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("*** String ***");
        System.out.println("hello mundo hello mundo");
        System.out.println("hello mundo hello mundo");
        System.out.println("hello mundo hello mundo");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("*** Operators ***");
        System.out.println(nux + num + " = addition operators");
        System.out.println(numOne * 8 + " = double with multiplication operator");
        System.out.println(nux / 2 + " = divide operator");


        System.out.println("*** Casting ***");
        int ty = (int) numOne;
        System.out.println(ty + " = conversion of double to int");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        //int o = 0;
        int i = 0;
        while (true) {
            System.out.println("*** looping using while true ****");
            System.out.println(" = give me numbers");
            int op = read.nextInt();
            if (op < 0) {
                i++;
                System.out.println(i);
            }
            if (op == -1) {
                i--;
            }
        }


    }

    public static void switchCase() {
        Scanner r = new Scanner(System.in);

        System.out.println("pick a number: from 1,2,3,none");
        int pick = r.nextInt();
        switch (pick) {
            case 1 -> System.out.println("you enter one");
            case 2 -> System.out.println("you enter two");
            case 3 -> System.out.println("you enter three");
            default -> System.out.println("you're choice is not in 1,2,3");
        }
    }

    public static void javaMath() {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is : " + z);

        //Math.max(value)    -> The Math.max(x,y) method can be used to find the highest value of x and y:
        //Math.min(value)    -> The Math.min(x,y) method can be used to find the lowest value of x and y:
        //Math.abs(value)    -> The Math.abs(x) method returns the absolute (positive) value of x:
        //Math.sqrt(value)   -> The Math.sqrt(x) method returns the square root of x:
        //Math.round(value)  -> The Math.round(X) method used for rounding the x value:
        //Math.random(value) -> Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        //Math.floor(value)  -> round down the value
        //Math.ceil(value)   -> round up the value
    }

    public static void arraylist() {
        ArrayList<String> listName = new ArrayList<>();
        Scanner r = new Scanner(System.in);
        while (true) {
            System.out.println("give me names (checking) :");
            String name = r.nextLine();
            if (name.isEmpty()) {
                break;
            }
            listName.add(name);
        }

        System.out.println("search for? ");
        String sees = r.nextLine();

        if (listName.contains(sees)) {
            System.out.println(sees + " is found");
        } else {
            System.out.println(sees + " was not found");
        }
    }

    public static void printStars(int number) {
        // it prints one star with the command
        for (int via = 0; via <= number; via++) {
            System.out.print(" *");
        }
        System.out.println(" ");
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
    public static void continues() {
        Scanner r = new Scanner(System.in);
        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;

        while (true) {
            System.out.print("Write numbers, negative numbers are invalid: ");
            int input = r.nextInt();

            if (input == 0) {
                break;
            }

            if (input < 0) {
                invalidNumbers++;
                continue;
            }

            sum += input;
            validNumbers++;
        }

        System.out.println("Sum of valid numbers: " + sum);
        System.out.println("Valid numbers: " + validNumbers);
        System.out.println("Invalid numbers: " + invalidNumbers);
    }

    public static void payrollSystem() {
        String green = "\u001B[32m";
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";
        String red = "\u001B[31m";
        System.out.println(yellow);
        Scanner r = new Scanner(System.in);

        System.out.print(" Give Employee Name: ");
        String empName = r.nextLine();
        System.out.print(" Enter the number of hours worked: ");
        int hoursWorked = r.nextInt();
        System.out.println(" " + green);
        letterDelay();
        System.out.println(reset + " " + yellow);

        int overtimeHours = 0; // Initialize overtime hours
        double overtimePay = 0.0; // Initialize overtime pay

        if (hoursWorked <= 0) {
            // Invalid hours
            System.out.println("Employee Name: " + red + empName + yellow);
            System.out.println("Number of Hours worked: " + red + hoursWorked + " (Invalid Hour's)" + yellow);
        } else if (hoursWorked <= 40) {
            // Calculate salary for regular hours
            double regularPay = hoursWorked * 98.64;
            double sss = regularPay * 0.0828; // Social Security System
            double philHealth = regularPay * 0.0915; // Phil Health
            double pagIbig = regularPay * 0.0702; // PAG-IBIG
            double tax = regularPay * 0.12; // Tax

            float totalDeduction = (float) (sss + philHealth + pagIbig + tax);
            float netPay = (float) (regularPay - totalDeduction);

            System.out.println("Employee Name: " + green + empName + yellow);
            System.out.println("Number of Hours worked: " + green + hoursWorked + " (Without Overtime)" + yellow);
            System.out.println("Regular Pay: " + green + "Php " + regularPay + yellow);
            System.out.println("SSS Deduction: " + green + "Php " + sss + yellow);
            System.out.println("Phil Health Deduction: " + green + "Php " + philHealth + yellow);
            System.out.println("PAG-IBIG Deduction: " + green + "Php " + pagIbig + yellow);
            System.out.println("Tax Deduction: " + green + "Php " + tax + yellow);
            System.out.println("Total Deduction: " + green + "Php " + totalDeduction + yellow);
            System.out.println("Net Pay: " + "Php " + green + netPay + yellow);
        } else {
            // Calculate salary for Overtime Hours
            int regularHours = 40;
            overtimeHours = hoursWorked - regularHours;
            overtimePay = overtimeHours * (98.64 * 1.5);

            // Calculate salary for regular hours and overtime hours
            float regularPay = (float) (regularHours * 98.64);
            float totalPay = (float) (regularPay + overtimePay);

            double sss = totalPay * 0.0828; // Social Security System
            double philHealth = totalPay * 0.0915; // Phil Health
            double pagIbig = totalPay * 0.0702; // PAG-IBIG
            double tax = totalPay * 0.12; // Tax

            float totalDeduction = (float) (sss + philHealth + pagIbig + tax);
            float netPay = (float) (totalPay - totalDeduction);

            System.out.println("Employee Name: " + green + empName + yellow);
            System.out.println("Number of Hours worked: " + green + hoursWorked + " (With Overtime)" + yellow);
            System.out.println("Regular Pay: " + green + "Php " + regularPay + yellow);
            System.out.println("Overtime Hours: " + green + overtimeHours + yellow);
            System.out.println("Overtime Pay: " + green + "Php " + overtimePay + yellow);
            System.out.println("Total Deduction: " + green + "Php " + totalDeduction + yellow);
            System.out.println("Net Pay: " + "Php " + green + netPay + yellow);
        }
    }

}




