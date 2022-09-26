import Entity.Employee;
import Entity.Enums.AccessesLevel;
import Entity.Enums.Position;
import Repository.EmployeeRepository;
import Service.Inplementation.AccessLevelHeight;
import Service.Inplementation.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", 1000000, Position.DIRECTOR, AccessesLevel.HIGH);
        Employee employee2 = new Employee("Yana", 500000, Position.MANAGER, AccessesLevel.MEDIUM);
        Employee employee3 = new Employee("Hope", 300000, Position.ENGINEER, AccessesLevel.LOW);


        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.work(employee1);
        employeeService.work(employee2);
        employeeService.work(employee3);



    }
}