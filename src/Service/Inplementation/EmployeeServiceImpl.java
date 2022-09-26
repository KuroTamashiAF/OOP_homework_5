package Service.Inplementation;

import Entity.Employee;
import Entity.Enums.AccessesLevel;
import Repository.EmployeeRepository;
import Service.AccessLevelInt;

public class EmployeeServiceImpl {
    private EmployeeRepository employeeRepository;

    public void work(Employee employee) {
        AccessLevelInt accessLevel =null;
        if (employee.getAccessesLevel() == AccessesLevel.LOW) {
            accessLevel = new AccessLevelLow();
        }
        else if (employee.getAccessesLevel() == AccessesLevel.MEDIUM) {
            accessLevel = new AccessLevelMedium();
        }
        else if (employee.getAccessesLevel() == AccessesLevel.HIGH) {
            accessLevel = new AccessLevelHeight();
        }
        if (accessLevel != null){
            accessLevel.work();
        }

    }
}
