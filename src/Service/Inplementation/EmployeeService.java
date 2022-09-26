package Service.Inplementation;

import Entity.Employee;
import Entity.Enums.AccessesLevel;
import Repository.EmployeeRepository;
import Service.EmployeeServiceimpl;

public class EmployeeService{
    private EmployeeRepository employeeRepository;

    public void work(Employee employee) {
        EmployeeServiceimpl accessLevel =null;
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
    public void goToHome(Employee employee) {
        EmployeeServiceimpl accessLevel = null;

        if (employee.getAccessesLevel() == AccessesLevel.LOW) {
            accessLevel = new AccessLevelLow();
            accessLevel.goToHome();
            return;
        }
        else if (employee.getAccessesLevel() == AccessesLevel.MEDIUM) {
            accessLevel = new AccessLevelMedium();
            accessLevel.goToHome();
            return;

        }
        else if (employee.getAccessesLevel() == AccessesLevel.HIGH) {
            accessLevel = new AccessLevelHeight();
            accessLevel.goToHome();
            return;
        }

    }
}
