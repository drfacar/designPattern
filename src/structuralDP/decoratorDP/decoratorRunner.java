package structuralDP.decoratorDP;

public class decoratorRunner {
    public static void main(String[] args) {

        Phone iphone11ProMax = new Iphone11(new Iphone());
        System.out.println("name: "+iphone11ProMax.getName());
        System.out.println("number of camera: "+iphone11ProMax.cameraCount());
        System.out.println("price of this phone: "+iphone11ProMax.getPrice());
    }

}
