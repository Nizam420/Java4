import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun( 3, 4, 22, 45, 55);
    }

    // static void multiple(int a, inr b, int ...v);

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
