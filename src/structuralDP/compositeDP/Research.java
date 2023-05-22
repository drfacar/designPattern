package structuralDP.compositeDP;

import java.util.Arrays;
import java.util.List;

public class Research extends Department{
    @Override
    String getName() {
        return "Research";
    }

    @Override
    List<String> getEmployee() {
        return Arrays.asList("R1","R2","R3","R4");
    }
}
