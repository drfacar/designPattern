package structuralDP.decoratorDP;

public class Iphone11Pro extends IphoneDecorator{
    public Iphone11Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"11Pro"; //Iphone + 11Pro

    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1; //3 camera

    }
    @Override
    public double getPrice() {
        return super.getPrice()+100; //699.5

    }
}
