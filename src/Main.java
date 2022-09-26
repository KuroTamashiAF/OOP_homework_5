import Entity.Employee;
import Entity.Enums.AccessesLevel;
import Entity.Enums.Position;
import Service.Inplementation.EmployeeService;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", 1000000, Position.DIRECTOR, AccessesLevel.HIGH);
        Employee employee2 = new Employee("Yana", 500000, Position.MANAGER, AccessesLevel.MEDIUM);
        Employee employee3 = new Employee("Hope", 300000, Position.ENGINEER, AccessesLevel.LOW);








        EmployeeService employeeService = new EmployeeService();
        employeeService.goToHome(employee1);
        employeeService.goToHome(employee2);
        employeeService.goToHome(employee3);




    }
}