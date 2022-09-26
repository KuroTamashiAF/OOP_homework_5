package Service;

import Service.Inplementation.AccessLevelInt;

public class AccessLevelLow implements AccessLevelInt {

    public void work(){
        workWithDocuments();
    }

    protected void workWithDocuments() {
    }

}
