package Entity;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Human {
    private int Salary;
    List<Skill> employeeSkills = new ArrayList<>();

    public Employee(String fullName) {
        super(fullName);
    }

    public int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        Salary = salary;
    }

    public void addSkill(Skill newSkill){
        if (employeeSkills.isEmpty()){
            employeeSkills.add(newSkill);
        }
    }


}
