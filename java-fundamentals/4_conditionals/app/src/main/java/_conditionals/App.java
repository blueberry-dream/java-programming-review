package _conditionals;

import java.util.Scanner;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers!");

        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("You entered: " + num);

        System.out.println("Enter another your second number!");

        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("You entered: " + num2);

        System.out.println("Enter another your third number!");
        int num3 = sc.nextInt();
        sc.nextLine();

        System.out.println("You entered: " + num3);

        boolean isMin = num < num2 && num < num3;
        boolean isMax = num > num2 && num > num3;

        if(isMin) {
            System.out.println(String.format("num1: %s is the smallest number!", num));
        }
        else if(isMax) {
            System.out.println(String.format("num1: %s is the biggest number!", num));
        }
        else {
            System.out.println(String.format("num1: %s is the middle number", num));
        }

        System.out.println("OKAY! Let's talk about the alphabet! What is your favourite letter?");


        String nextLine = sc.nextLine();
        char myChar = nextLine.toLowerCase().charAt(0);


        switch(myChar) {
            case 'a':
                System.out.println("Your favourite letter is a!)");
                break;
            default:
                System.out.println("Your favourite letter is not a!");
        }

        System.out.println("Now trying with switch expression");

        String message = switch(myChar) {
            case 'a' -> "Your favourite letter is a!";
                default -> {
                    yield "Your favourite letter is not a!";
                }
        };

        System.out.println(message);


        sc.close();
    }
}
