/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _operators;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int a = 2 + 3 * 4;
        System.out.println(a);

        int x = 72 / 6 / 3;


        // widening is handled automatically
        byte b = 1; 
        char c = 'a';
        int x1 = c;
        float x2 = x1;
        double x3 = x2;

        // narrowing is explicit
        // recall int is 4 bytes (each bytes is 8 bits)
        // 4 * 8 = 32 bits
        // 1 bit is the sign bit => 31 significant bits
        // int in [-2^31, 2^31 - 1]
        int myInt = 244;
        String myIntBinary = Integer.toBinaryString(myInt);
        b = (byte) myInt; 
        /*
         * 244 in binary: 0b11110100
         * byte is only 8 bits long, narrowing primitive conversion is taking the last 8 bites
         * b = 
         */
        System.out.println("Printing myInt:\t" + myInt);
        System.out.println("Printing myIntBinary:\t" + myIntBinary);
        System.out.println("Printing byte b: " + b);
    }
}
