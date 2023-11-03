import java.util.Scanner;

public class partTres {
    public static void main (String[]args) {
        Scanner read = new Scanner(System.in);

        // Creating an Array
        //There are two ways to create an Array. In the first one you have to explicitly define the size upon the creating.
        // This is how you create an Array to hold three integers:
        // int[] numbers = new int[3];

        int[] numbers= new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.println("Give indices to swap: ");
        String swap = read.nextLine();

        int index = 0;
        while (index < numbers.length) {
            System.out.println();
        }
    }
}
