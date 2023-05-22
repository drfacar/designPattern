package behavioralDP.mediatorDP;

import behavioralDP.mediatorDP.Dispatcher;
import behavioralDP.mediatorDP.Teacher;

import javax.lang.model.element.NestingKind;

public class MessageTeacher implements Teacher {

    String name;//hibernate


    Dispatcher dispatcher;

    public MessageTeacher(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }

    @Override
    public void receiveMessage(String message) {

        System.out.println(name+ "received message :" +message);
    }

    @Override
    public void sendMessage(String topic, String message) {
        //teacher will sent message through dispatcher
        dispatcher.dispatch(topic,message);
    }

}
