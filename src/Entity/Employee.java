package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс <b>Сотрудник</b> с параметрами: <b>fullName</b>, <b>cash</b>,
 * <b>salary</b> и <b>employeeSkills</b>.
 * @see Entity.Human
 * @author Glukhov K. A.
 * @version 0.0.6
 * @since 0.0.2
*/
public class Employee extends Human {

    /** Параметр <b>Зарплата</b> */
    private volatile int salary;

    /** Список <b>Навыков сотрудника</b> */
    List<Skill> employeeSkills = new ArrayList<>();

    /*--------------------------------------------------------------*/

    /**
     * Конструктор - создание экземпляра класса <b>Сотрудник</b>
     * @param fullName 'Фамилия Имя Отчество'
    */
    public Employee(String fullName) {
        super(fullName);
    }

    /**
     * Функция получения значения параметра {@link Employee#salary}
     * @return размер зарплаты
    */
    public  int getSalary() {
        return salary;
    }

    /**
     * Процедура присваивания значения параметру {@link Employee#salary}
     * @param salary зарплата сотрудника
    */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Процедура добавления нового навыка сотруднику {@link Employee#employeeSkills}
     * @param newSkill новый навык
    */
    public void addSkill(Skill newSkill){
        if (employeeSkills.isEmpty() || !employeeSkills.contains(newSkill)){
            employeeSkills.add(newSkill);
        }
    }

    void goToWork(){

    };

    @Override
    public String toString() {
        return  "Cотрудник " + fullName + ":" + '\n' +
                "Зарплата:" + salary + '\n' +
                "Навыки:" + employeeSkills + '\n' +
                "Деньги:" + cash  + '\n';
    }
}
