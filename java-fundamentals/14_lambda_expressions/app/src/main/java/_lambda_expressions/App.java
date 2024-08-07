/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _lambda_expressions;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Integer myInt = 1;

        IMyInterface1 lambda = () -> Print("m()");
        IMyInterface1 lambda2 = () -> Print("Second lambda");

        lambda.m();
        lambda2.m();

        IMyInterface2<Integer> lambda3 = (Integer x) -> x == 0;

        Print("lambda3.m(22):\t" + lambda3.m(22));
        Print("lambda3.m(0):\t" + lambda3.m(0));

        // Function<Object, void> = System.out::println;
        Consumer<Object> print = System.out::println;
        System.out.println();

        Predicate<String> isName = (String s) -> s.equals("Saad Khan");

        String myName = new String("Alan Walker");

        print.accept(String.format("is %s my Name? isName(%s) = \t %s",
                    myName,
                    myName,
                    isName.test(myName)));

    }

    private static interface IMyInterface2<T> {
        boolean m(T item);
    }

    private static interface IMyInterface1 {
        void m();
    }

    public static void Print(Object obj) {
        System.out.println(obj);
    }
}
