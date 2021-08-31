import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;

    }
}
