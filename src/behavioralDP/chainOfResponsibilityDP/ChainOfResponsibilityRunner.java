package behavioralDP.chainOfResponsibilityDP;

import behavioralDP.chainOfResponsibilityDP.Approver;
import behavioralDP.chainOfResponsibilityDP.Official;

public class ChainOfResponsibilityRunner {
    public static void main(String[] args) {

        ChainOfResponsibilityRunner runner = new ChainOfResponsibilityRunner();
        runner.chainOfResponsibility();

    }

    void chainOfResponsibility(){

        Approver generalManger= new behavioralDP.chainOfResponsibiltyDP.GeneralManager();

        Approver manager = new behavioralDP.chainOfResponsibiltyDP.Manager(generalManger);

        Approver official = new Official(manager);

        System.out.println("limits for Loan");

        System.out.println("For official ,max limit is : < 100 ");
        System.out.println("For Manager ,max limit is : < 500 ");
        System.out.println("For general Manager ,max limit is : no limit ");
        System.out.println("requested amount is : 50 ");
        official.approveLoan(200);

        System.out.println("registered amount is is : 450 ");
        official.approveLoan(1000);

        System.out.println("requested amount is is : 1050 ");
        official.approveLoan(1050);

    }
}
