package creationalDP.singletonDP;

public class SingletonObject {

    String message = "HELLO";

    private static SingletonObject instance = new SingletonObject();

    //by making access modifier of default constructor to private
    //we are making sure that this constructor will not be called from outside
    private SingletonObject() {
    }

    public static SingletonObject getInstance(){
        return instance;
    }
    public String changeMessage(){
        return this.message = this.message + " BATCH 134-135";
    }
}
