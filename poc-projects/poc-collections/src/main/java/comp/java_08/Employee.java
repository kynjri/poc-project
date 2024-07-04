package comp.java_08;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private Double salary;
}