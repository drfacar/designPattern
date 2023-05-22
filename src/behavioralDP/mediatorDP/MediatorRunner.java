package behavioralDP.mediatorDP;

public class MediatorRunner {

    public static void main(String[] args) {

        MediatorRunner runner = new MediatorRunner();
        runner.mediator();

    }
    void mediator(){
        MessageDispatcher dispatcher = new MessageDispatcher();

        //create teacher obj
        Teacher chemistryTeacher = new MessageTeacher("ChemistryTeacher",dispatcher);
        Teacher mathTeacher = new MessageTeacher("MathematicsTeacher",dispatcher);
        Teacher physicsTeacher = new MessageTeacher("PhysicsTeacher",dispatcher);
        Teacher biologyTeacher = new MessageTeacher("BiologyTeacher",dispatcher);

        //register teacher to the dispatcher
        dispatcher.register("chemistry",chemistryTeacher);
        dispatcher.register("mathematics",mathTeacher);
        dispatcher.register("physics",physicsTeacher);
        dispatcher.register("biology",biologyTeacher);

        //one teacher can ask any question from other
        chemistryTeacher.sendMessage("mathematics","message about math");
        chemistryTeacher.sendMessage("physics","message about physics");
        chemistryTeacher.sendMessage("biology","message about biology");

    }

}
