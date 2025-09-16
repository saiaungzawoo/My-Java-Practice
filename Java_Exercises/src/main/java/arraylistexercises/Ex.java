package arraylistexercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//Write a Java program to store a list of student names in an ArrayList
// and print them in alphabetical order.

public class Ex {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>(List.of("John", "Emma", "Henry", "Peter", "Josh"));

        students.sort(Comparator.naturalOrder());

        System.out.println(students);

    }
}
