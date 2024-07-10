
public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello, World!";

        System.out.println(greeting);
        
        int number = 5;
        int doubled = doubleNumber(number);

        System.out.println("The doubled number is:\t" + doubled);

        return;
    }

    public static int doubleNumber(int num) {
        return num * 2;
    }
}
