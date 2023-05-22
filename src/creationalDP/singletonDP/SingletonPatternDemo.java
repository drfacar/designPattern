package creationalDP.singletonDP;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        //we can create new different object using Constructor
//        SingletonObject obj2 = new SingletonObject();
//        SingletonObject obj3 = new SingletonObject();

        SingletonObject obj1 = SingletonObject.getInstance();
        System.out.println(obj1.message); // HELLO!
        System.out.println(obj1.changeMessage());

        //test if it is singleton or not
        SingletonObject obj4 = SingletonObject.getInstance();
        System.out.println("Message by obj4: " + obj4.message);
    }
}
