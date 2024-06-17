package comp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Alice", 22));
        students.add(new Student1("Bob", 20));

        Collections.sort(students);
        System.out.println(students);
    }
}

