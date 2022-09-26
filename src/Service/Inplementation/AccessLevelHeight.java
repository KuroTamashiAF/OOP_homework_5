package Service.Inplementation;

import Service.AccessLevelInt;

public class AccessLevelHeight extends AccessLevelMedium implements AccessLevelInt {
    
    

    public void work(){
         goToDirector();
    }

    protected void goToDirector() {
        System.out.println("I go to director with this document");
    }


}
