package structuralDP.compositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class HRDepartment extends Department{

    //we want to reach out all child class using filed
    List<Department> childDepartment;

    //constructor
    public HRDepartment(List<Department> childDepartment) {
        this.childDepartment = childDepartment;
    }

    @Override
    String getName() {
        return childDepartment.stream(). // finance obj and sales obj
                map(Department::getName). //finance  sales
                collect(Collectors.joining(", ")); //"Finance", "Sales"
    }

    @Override
    List<String> getEmployee() {
        return childDepartment.stream().
                flatMap(d->d.getEmployee().
                        stream()).
                        collect(Collectors.toList());
    }
}
