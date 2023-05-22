package behavioralDP.chainOfResponsibilityDP;

import behavioralDP.chainOfResponsibilityDP.Approver;

public class Manager extends Approver{

    //this class is also need a manager
    public Manager(Approver chief) {
        super(chief);
    }


    // suppose this limit of manager is 500;
    @Override
    boolean approveLoan(int amount) {

        if (amount<500){
            System.out.println("Bank Manager can Approve....");
            System.out.println("----------------------");
        } else if (chief!=null) {

            System.out.println("Amount exceeds the limit that Manager can approve . you are direct to  general Manager ");
            return  chief.approveLoan(amount);
        }
        return false;
    }
}
