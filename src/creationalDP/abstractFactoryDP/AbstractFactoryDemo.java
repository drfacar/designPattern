package creationalDP.abstractFactoryDP;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory =  FactoryProducer.getFactory("Shape");

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color color1= colorFactory.getColor("Red");
        color1.fill();

        Color color2 = colorFactory.getColor("Blue");
        color2.fill();
    }
}
