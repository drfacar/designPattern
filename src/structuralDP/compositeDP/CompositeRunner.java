package structuralDP.compositeDP;

import java.util.Arrays;
import java.util.List;

public class CompositeRunner {

    public static void main(String[] args) {

        CompositeRunner compositeRunner = new CompositeRunner();
        compositeRunner.compositeDemo();
    }
    public void compositeDemo(){
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department researchDepartment = new Research();

        Department hrDepartment = new HRDepartment(Arrays.asList(financeDepartment,salesDepartment,researchDepartment));
        System.out.println(hrDepartment.getName());

        System.out.println("--------------------------");

        System.out.println(hrDepartment.getEmployee());
    }
}
