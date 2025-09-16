//Write a program that returns a list containing only the common elements between two lists.
// For example, given the lists [1, 2, 3, 4] and [3, 4, 5, 6], the program should return [3, 4].

package arraylistexercises;

import java.util.ArrayList;
import java.util.List;

public class ListOverLap {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(List.of(3,4,5,6));

        list1.retainAll(list2);
        System.out.println(list1);

    }
}
