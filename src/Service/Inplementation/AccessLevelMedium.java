package Service.Inplementation;

import Service.EmployeeServiceimpl;

public class AccessLevelMedium extends AccessLevelLow implements EmployeeServiceimpl {


    public void work(){
         throwAwayDocuments();
    }

    @Override
    public void goToHome() {
        System.out.println("Go to home in underground");

    }

    protected void throwAwayDocuments() {
        System.out.println("I throwing it away documents");
    }
    }

