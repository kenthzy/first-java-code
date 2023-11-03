import java.util.Scanner;
import java.util.ArrayList;

public class scratch {
    public static void main(String[]args) {
        Scanner read = new Scanner(System.in);
        /*
        String green = "\u001B[32m";
        System.out.println(green);
        System.out.print("What is yor Name? ");
        String name = read.nextLine();
        System.out.print("What is your Age? ");
        int age = Integer.valueOf(read.nextLine());
        String x = "Your name was: ";
        String y = "and Your age was: ";

        System.out.println("how many times do you want to print it? ");
        int choice = Integer.valueOf(read.nextLine());

        for (int i = 0; i < choice; i++ ) {
            System.out.println(x + name + y + age);

        }
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("watermelon");
        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits.get(2));*/

        // call the public for array int
        /*
        forInt();
        loops();
        store();
        forLoop();*/
        System.out.println("give first");
        int choice = Integer.parseInt(read.nextLine());
        System.out.println("give second");
        int choices = Integer.parseInt(read.nextLine());

        int result = nums(choice,choices);
        System.out.println(result);
    }
    public static void forInt(){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(8);
        number.add(9);
        System.out.println(number.get(1)+number.get(0));
    }
    public static void loops(){
        Scanner r = new Scanner(System.in);
        while (true) {
            System.out.print("kantutan? ilan?");
            int kantot = Integer.valueOf(r.nextLine());
                if (kantot == 0) {
                    break;
                }
            System.out.println("Lakas mo gusto mo " + kantot + " hirap nun");
        }
    }
   public static void store(){
        Scanner x = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("give me a number input: ");
            int numput = Integer.valueOf(x.nextLine());
            if (numput == 0) {
                break;
            }
            if (numput >= 1){
                counter = counter + numput; // if it is not input variable just +1 it only counts ones not sum of all
            }
        }
       System.out.println("the total inputs was " + counter);
   }
   public static void forLoop() {
        //Write a Java program to print the numbers from user input to 100
        Scanner r = new Scanner(System.in);
        int count = 0;
       System.out.println("give me numbers");
       int x = r.nextInt();

       for (int i = 1; i < 100; i++) {
           System.out.println(i);
           count = count + i;
       }
       System.out.println("the total is " + count);
   }
   public static  int nums(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
        return a;
   }
}