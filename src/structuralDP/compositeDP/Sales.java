package structuralDP.compositeDP;

import java.util.Arrays;
import java.util.List;

public class Sales extends Department{
    @Override
    String getName() {
        return "SAles";
    }

    @Override
    List<String> getEmployee() {
        return Arrays.asList("S1","S2","S3","S4");
    }
}
