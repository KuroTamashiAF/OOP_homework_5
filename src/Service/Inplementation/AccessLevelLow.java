package Service.Inplementation;

import Service.AccessLevelInt;

public class AccessLevelLow implements AccessLevelInt {

    public void work(){
        workWithDocuments();
    }

    protected void workWithDocuments() {
        System.out.println("I work with documents");
    }

}
