package behavioralDP.chainOfResponsibilityDP;

public class Official extends Approver{

    //manager of this class
    public Official(Approver chief) {
        super(chief);
    }

    //official can approve if the limit is less than 100
    @Override
    boolean approveLoan(int amount) {
        if(amount<100){
            System.out.println("Bank officer approved");
            System.out.println("---------------------");
        }else if(chief != null){
            System.out.println("Amount exceeds the limit that officer can approve, you are direct to manager");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
