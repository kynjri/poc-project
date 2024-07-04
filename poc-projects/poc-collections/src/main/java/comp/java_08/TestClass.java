package comp.java_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        Comparator<Employee> c = (Employee e1, Employee e2)->{
            if(e1.getSalary()>e2.getSalary())
                return -1;
            else return 1;
        };
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(10,"John", 45000.0));
        list.add(new Employee(2,"Sara", 43000.0));
        list.add(new Employee(13,"Akash", 44000.0));
        list.add(new Employee(4,"alok", 45600.0));
        list.add(new Employee(5,"Kevin", 42000.0));

       for(Employee e:list)
            System.out.println(e);
        /*
        Collections.sort(list,c);
        for(Employee e:list)
            System.out.println(e);*/
        System.out.println("after sort");
        //list.stream().sorted(c).forEach(System.out::println);
/*        List<Employee> list2=list.stream().sorted((e1,e2)->
        (e1.getId()>e2.getId())?1:(e1.getId()< e2.getId())?-1:0).collect(Collectors.toList());
        for(Employee e:list2)*/
        List<Employee> list2=list.stream().sorted(( e1, e2)->
            (e1.getSalary()>e2.getSalary())?1:(e1.getSalary()<e2.getSalary())?-1:0).collect(Collectors.toList());
        for(Employee e:list2)
        System.out.println(e);

    }
}
