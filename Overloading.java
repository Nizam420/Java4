import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        function(44);
        function("Nizam");
        int ans = sum (3, 4);
        System.out.println(ans);
        int ans2 = sum (3, 5, 6);
        System.out.println(ans2);
        demo( 2, 3, 4);
    }
    
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));

    }

    static void demo(String ...v) {
        
    }

    static int sum (int a, int b) {
        return a + b;
    }

    static int sum (int a, int b, int c) {
        return a + b + c;
    }

    static void function(int a) {
        System.out.println("First one");
        System.out.println(a);
    }
    
    static void function(String name) {
        System.out.println("Second one");
        System.out.println(name);
        
    }
}
