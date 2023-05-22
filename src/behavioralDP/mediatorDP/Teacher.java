package behavioralDP.mediatorDP;

public interface Teacher {

    void receiveMessage(String message);

    void sendMessage(String topic,String message);
}
