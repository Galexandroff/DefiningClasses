package DefiningClasses1;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name=name;
        this.employees = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public double getAvg(){
        return this.employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }
}
