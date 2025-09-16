import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {


        bigAndSmall();

    }

    public static void bigAndSmall(){

        int[] arr = {34, 23, 11, 21, 29};

        //largest

        //sort the array first
        Arrays.sort(arr);

        //highest number will be at last place after being sorted
        int large = arr[arr.length - 1];

        System.out.println("Largest number: " + large);

        //smallest
        //using streams
        int small = Arrays.stream(arr).min().getAsInt();
        System.out.println("Smallest number: " + small);
    }
}
