package Service;

import Service.Inplementation.AccessLevelInt;

public class AccessLevelMedium extends AccessLevelInt.AccessLevelLow implements AccessLevelInt {


    public void work(){
         throwAwayDocuments();
    }

    protected void throwAwayDocuments() {
    }


}
