package Service.Inplementation;

import Service.EmployeeServiceimpl;

public class AccessLevelLow implements EmployeeServiceimpl {

    public void work(){
        workWithDocuments();
    }

    @Override
    public void goToHome() {
        System.out.println("Go to home in car");

    }

    protected void workWithDocuments() {
        System.out.println("I work with documents");
    }

}
