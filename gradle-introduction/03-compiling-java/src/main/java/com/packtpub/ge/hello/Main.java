package com.packtpub.ge.hello;

public class Main {
    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        System.out.println(service.Greet(args[0]));
    }
}
