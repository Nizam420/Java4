// import java.util.Scanner;

public class Stringex {
    public static void main(String[] args) {
        // String sms = greet();

        String smss = myGreet("Nizam");

        System.out.println(smss);
    }

    static String myGreet(String name) {
        String sms = "I am  " + name;
        return sms;
    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
