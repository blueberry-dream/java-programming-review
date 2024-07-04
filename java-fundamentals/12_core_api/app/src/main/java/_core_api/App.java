/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _core_api;

import java.time.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Echoing ints!");
        // while (scanner.hasNextInt()) {
        // // 2147483647 is the limit for int, 2147483648 (= 2147483647 + 1) will return
        // // false
        // int num = scanner.nextInt();

        // System.out.println(num);
        // }

        // System.out.println("Echoing anything!");
        // while (scanner.hasNext()) {
        // var thing = scanner.next();

        // try {
        // if (Integer.parseInt(thing) == 0) {
        // break;
        // }
        // } catch (Exception ex) {
        // }
        // System.out.println(thing);
        // }

        // System.out.println("Changing the delimiter to 1");
        // // scanner.close();

        // // scanner = new Scanner("1a2a3a4a5");
        // scanner.useDelimiter("a");
        // while (scanner.hasNextInt()) {
        // int num = scanner.nextInt();
        // System.out.println(num);
        // }

        // scanner.close();

        // String s1 = "AAAA";
        // String s2 = "BBBB";
        // String s1Copy = "AAAA";

        // if (s1.equals(s2)) {
        //     System.out.println(s1 + "\t is equal to\t" + s2);
        // } else {
        //     System.out.println(s1 + "\t is not equal to\t" + s2);
        // }

        // if (s2.equals(s2)) {
        //     System.out.println(s2 + "\t is equal to\t" + s2);
        // }

        // if (s1.equals(s1Copy)) {
        //     System.out.println(s1 + "\t is equal to\t" + s1Copy);
        // }

        // String s3 = s1.concat(s2);

        // Print("concat s1 and s2\t" + s3);
        // Print("s3 ends with At\t" + s3.endsWith("At"));
        // Print("s3.subtring(4,6)\t" + s3.substring(4,6));

        StringBuilder sb = new StringBuilder("H");
        sb.append("ello");
        sb.append(" World!");

        // custom immutable class
        // List and ArrayList

        for(DayOfWeek day: DayOfWeek.values()) {
            Print(day + String.valueOf(day.ordinal()));
        }

    }

    public static void Print(Object obj) {
        System.out.println(obj);
    }
}