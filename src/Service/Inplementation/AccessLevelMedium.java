package Service.Inplementation;

import Service.AccessLevelInt;

public class AccessLevelMedium extends AccessLevelLow implements AccessLevelInt {


    public void work(){
         throwAwayDocuments();
    }

    protected void throwAwayDocuments() {
        System.out.println("I throwing it away documents");
    }
    }

