import java.util.Arrays;

public class ExReturn {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = a;
        b[0] = 99;
        System.out.println(a[0]); // Predict: ?

    }
}
