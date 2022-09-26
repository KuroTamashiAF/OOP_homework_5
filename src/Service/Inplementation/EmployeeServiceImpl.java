package Service.Inplementation;

import Entity.Employee;
import Entity.Enums.AccessesLevel;
import Repository.EmployeeRepository;
import Service.AccessLevelInt;

public class EmployeeServiceImpl {
    private EmployeeRepository employeeRepository;

    public void work(Employee employee) {
        if (employee.getAccessesLevel() == AccessesLevel.LOW) {
            AccessLevelInt accessLevelInt = new AccessLevelLow();

        }
        if (employee.getAccessesLevel() == AccessesLevel.MEDIUM) {
            AccessLevelInt accessLevelInt = new AccessLevelMedium();

        }
        if (employee.getAccessesLevel() == AccessesLevel.HIGH) {
            AccessLevelInt accessLevelInt = new AccessLevelHeight();

        }
    }
}
