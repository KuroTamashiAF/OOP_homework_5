package Service.Inplementation;

import Service.EmployeeServiceimpl;

public class AccessLevelHeight extends AccessLevelMedium {
    
    

    public void work(){
        goToDirector();
    }

    protected void goToDirector() {
        System.out.println("I go to director with this document");
    }

    @Override
    public void goToHome() {
        System.out.println("Go to home in car with driver");
    }
}
