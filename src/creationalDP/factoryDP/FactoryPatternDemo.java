package creationalDP.factoryDP;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.draw();

        Square square1 = new Square();
        square1.draw();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.draw();

        System.out.println("************ Shape factory *************");

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();
    }
}
