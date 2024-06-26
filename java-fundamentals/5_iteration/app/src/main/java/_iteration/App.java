/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _iteration;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        MyWhileLoop(6);

        MyDoWhileLoop(5);

        MyForLoop(new int[] { 99, 101, 202, 54 });

    }

    public static void MyForLoop(int[] numsArr) {
        Print("running MyForLoop with:\t" + Arrays.toString(numsArr));

        Print("looping over array by index and length");
        for (int i = 0; i < numsArr.length; i++) {
            Print(numsArr[i]);
        }

        Print("looping over array by for each syntax");
        for (int i : numsArr) {
            Print(i);
        }

    }

    public static void MyDoWhileLoop(int counter) {
        Print("running MyDoWhileLoop with:\t" + counter);

        do {
            Print(counter++);
        } while (counter < 10);
    }

    public static void MyWhileLoop(int counter) {
        Print("running MyWhileLoop with:\t" + counter);
        while (counter >= 2) {
            Print(counter--);
        }
    }

    public static void Print(Object obj) {
        System.out.println(obj);
    }
}