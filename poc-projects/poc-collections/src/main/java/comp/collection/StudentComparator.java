package comp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.Data;

public class StudentComparator{

    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("Alice", 22));
        students.add(new Student2("Bob", 20));

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name:");
        students.forEach(System.out::println);

        // Sort by age
        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by age:");
        students.forEach(System.out::println);
    }
}

@Data
class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


class NameComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.getName().compareTo(s2.getName()); // sort by name
    }
}

class AgeComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.getAge() - s2.getAge(); // sort by age
    }
}
