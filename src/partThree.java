import java.util.Scanner;
import  java.util.ArrayList;
public class partThree {
    public static void main(String[] args) {
        //Creating a new list is done with the command ArrayList<Type> list = new ArrayList<>(),
        // where Type is the type of the values to be stored in the list (e.g. String).
        Scanner r = new Scanner(System.in);
        // para sa pag create ng list
    /*    ArrayList<String> liString = new ArrayList<>();

        //The exercise contains a base that asks the user for strings and adds them to a list.
        // The program stops reading when the user enters an empty string.
        // The program then prints the third element of the list.
        int list = 0;
        while (true) {
            System.out.print("What is your name? ");
            String n = r.nextLine();

            if (n.isEmpty()) { // or (n.equals(""))
                break;
            }

            liString.add(n);
            list++;
        }
        System.out.println(liString.get(2));


        ArrayList<Integer> listeger = new ArrayList<>();
        int counter = 0;
        while (true) {
            System.out.println("Give me numbers: ");
            int num = Integer.valueOf(r.nextLine());

            if (num == 0) {
                break;
            }
            listeger.add(num);
            counter++;
        }
        System.out.println(listeger.get(1) + listeger.get(2));

        //In the exercise template is a program that reads input from the user.
        // Modify its working so that when the program quits reading,
        // the program prints the number of values on the list.
        ArrayList<String> input = new ArrayList<>();

        while (true) {
            System.out.println("Give me names");
            String names = r.nextLine();

            if (names.equals("finish")) {
                break;
            }
            input.add(names);
        }
        System.out.println("the total number you enter " + input.size());

        *//* The for-loop we inspected earlier used to iterate over a known number of elements is extremely handy here.
        We can convert the loop above to a for-loop, after which the program looks like this.

        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        for (int index = 0; index < teachers.size(); index++) {
            System.out.println(teachers.get(index));
        }
        Sample output
        Simon
        Samuel
        Ann
        Anna *//*

        // In the exercise template there is a program that reads inputs from the user and adds them to a list.
        // Reading is stopped once the user enters an empty string.

        // Your task is to modify the method to print the last read value after it stops reading.
        // Print the value that was read last from the list. Use the method that tells the size of a list to help you.

        // Modify the program to print both the first and the last values after the reading ends.
        // You may suppose that at least two values are read into the list.
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Give me names to stored in a list");
            String name = r.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));


        //The exercise template contains a base that reads numbers from the user and adds them to a list.
        // Reading is stopped once the user enters the number -1.

        //Expand the functionality of the program so that after reading the numbers, it prints all the numbers received from the user.
        // The number used to indicate stopping should not be printed.

        //After this the program shall prints all the numbers in the list that fall in the specified range
        //(between the indices given by the user, inclusive). You may assume that the user gives indices
        // that match some numbers in the list.

        //Continue developing the program so that it finds the greatest number in the list and prints
        // its value after reading all the numbers. The programming should work in the following manner.

        //Expand the program by adding a functionality that asks the user for a number,
        //and reports that number's index in the list. If the number is not found, the program should not print anything.

        ArrayList<Integer> numInput = new ArrayList<>(); // Create an ArrayList to store numbers.
        Scanner scanner = new Scanner(System.in); // Create a Scanner for user input.

        // Input phase: Read numbers from the user until they enter -1.
        while (true) {
            System.out.println("Give me numbers to input");
            int inputNum = scanner.nextInt(); // Read an integer from the user.

            if (inputNum == -1) {
                break; // If the user enters -1, exit the loop.
            }
            numInput.add(inputNum); // Add the input number to the ArrayList.
        }

        // Print the numbers in the ArrayList.
        for (int i : numInput) {
            System.out.println(i); // Print all the numbers that were input into the ArrayList.
        }

        System.out.println("where to start? ");
        int start = scanner.nextInt(); // Read the starting index.
        System.out.println("what is the end? ");
        int end = scanner.nextInt(); // Read the ending index.

        int greatest = numInput.get(0); // Initialize a variable to hold the greatest number.

        // Loop through the numbers in the specified range.
        for (int i = start; i <= end; i++) {
            System.out.println(numInput.get(i)); // Print the number at index i.

            int number = numInput.get(i); // Get the number at index i.

            // Check if the current number is greater than the current greatest number.
            if (greatest < number) {
                greatest = number; // Update the greatest number if needed.
            }
        }

        // Print the greatest number found in the specified range.
        System.out.println("the greatest number was: " + greatest);

        System.out.println("Search for? ");
        int seek = scanner.nextInt(); // Read the number to search for.

        // Loop through the ArrayList to find the index of the searched number.
        for (int i = 0; i < numInput.size(); i++) {
            if (seek == numInput.get(i)) {
                System.out.println(seek + " is at index " + i);
            }
        }


        // Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops.
        // After this the program will print the smallest number in the list, and also the indices where that number is found.
        // Notice: the smallest number can appear multiple times in the list.
        ArrayList<Integer> ios = new ArrayList<>();

        while (true) {
            System.out.println("just give number: ");
            int type = r.nextInt();
            if (type == 9999) {
                break;
            }
            ios.add(type);
        }// end of while loop

        int least = ios.get(0);
        int num = 0;

        for (int i = 0; i < ios.size(); i++) {
            num = ios.get(i);

            if (least < num) {
                num = least;
            }
        }
        System.out.println("Smallest number: " + least);

        for (int i = 0; i < ios.size(); i++) {
            if (least == ios.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

        */

        //The exercise template contains a base that reads numbers from the user and adds them to a list.
        //Reading is stopped once the user enters the number -1.
        //Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.

        ArrayList<Integer> addList = new ArrayList<>();


        while (true) {
            System.out.println("Give me numbers");
            int put = r.nextInt();
            if (put == -1) {
                break;
            }
            addList.add(put);
        }
        int totalSum = 0;
        for (int number : addList) {
            totalSum += number;
        }
        System.out.println("Numbers entered: " + addList);
        System.out.println("Sum of numbers: " + totalSum);
        r.nextLine();// just fix the issue of my code below

        // The exercise template contains a base that reads numbers from the user and adds them to a list.
        // Reading is stopped once the user enters the number -1.
        // When reading ends, calculate the average of the numbers in it, and then print that value
       /* ArrayList<Integer> avgList = new ArrayList<>();
        int countMe = 0;
        while (true) {
            System.out.print("Give me Integers: ");
            int x = r.nextInt();
            if (x==0) {
                break;
            }
            avgList.add(x);
            countMe++;
        }
        int totalInt = 0;
        for (int y : avgList) {
            totalInt = totalInt + y;
        }
        int average = totalInt / countMe;
        System.out.println("NUMBER YOU'VE ENTERED :" + avgList);
        System.out.println("AVERAGE OF INT: " + average);


        // The list's remove method removes the value that is located at the index
        // that's given as the parameter. The parameter is an integer.

        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

        list.remove(1);

        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));

        Sample output
        Index 0 so the first value: First
        Index 1 so the second value: Third

        If the parameter given to remove is the same type as the values in the list, but not an integer,
        (integers are used to remove from a given index), it can be used to remove a value directly from the list.

        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

        list.remove("First");

        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));

        Sample output
        Index 0 so the first value: Second
        Index 1 so the second value: Third */

        /*
        The list method contains can be used to check the existence of a value in the list.
        The method receives the value to be searched as its parameter, and it returns a boolean type value
        (true or false) that indicates whether or not that value is stored in the list.

        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

       System.out.println("Is the first found? " + list.contains("First"));

            boolean found = list.contains("Second");
            if (found) {
                System.out.println("Second was found");
            }

            // or more simply
            if (list.contains("Second")) {
                System.out.println("Second can still be found");
            }

    Sample output
    Is the first found? true
    Second was found
    Second can still be found
         */


        // In the exercise template there is a program that reads inputs
        // from the user until an empty string is entered. Add the following functionality to it:
        // after reading the inputs one more string is requested from the user. The program then tell whether
        // that string was found in the list or not

        ArrayList<String> listName = new ArrayList<>();

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
            System.out.println( sees + " is found");
        } else {
            System.out.println(sees + " was not found");
        }

        // Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
        // in the exercise template. The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit].
        // A few examples of using the method are supplied below.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);



        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(2);
        number.add(6);
        number.add(-1);

        System.out.println(sum(number));

        numbers.add(5);
        numbers.add(1);

        System.out.println(sum(number));

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> strings) {
        if(strings.isEmpty()) {
            return;
        }
        strings.remove(strings.size()-1);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer value : numbers){
            if(value >= lowerLimit && value <= upperLimit){
                System.out.println(value);
            }
        }
    }

    public static int sum(ArrayList<Integer> number) {
        int sum = 0;
        if (number.isEmpty()) {
            return -1;
        }

        for (int i : number) {
             sum += i;
        }

        return sum;
    }
    /* As before, a method can also return a value. The methods that return values have the type of the return value in
     place of the void keyword, and the actual returning of the value is done by the return command.
      The method below returns the size of the list.

            public static int size(ArrayList<String> list) {
                return list.size();
            }


    You can also define own variables for methods. The method below calculates the average of the numbers in the list. If the list is empty, it returns the number -1.

            public static double average(ArrayList<Integer> numbers) {
                if (numbers.size() == 0) {
                    return -1.0;
                }

                int sum = 0;
                for (int number: numbers) {
                    sum = sum + number;
                }

                return 1.0 * sum / numbers.size();

     */


}

