package behavioralDP.Observer;

public class ObserverRunner {

    public static void main(String[] args) {

        ObserverRunner observerRunner = new ObserverRunner();
        observerRunner.observerDemo();

    }

    void observerDemo() {

        //create chanel

        Chanel chanel1 = new NewsChanel();
        Chanel chanel2 = new NewsChanel();
        Chanel chanel3 = new NewsChanel();
        //create agency

        NewsAgency agency = new NewsAgency();

        // register channels to agency

        agency.addObserver(chanel1);
        agency.addObserver(chanel2);
        agency.addObserver(chanel3);

        // create post news

        agency.sendNews("Learn java at TechproEducation ");
        agency.sendNews("Batch 134-135 students are about to complete the bootcamp");
        // agency.sendNews("Batch 134-135 students are about to complete the Design pattern");
        System.out.println("News from Chanel 1 : ");

        chanel1.printNews();


        System.out.println("News from Chanel 2 : ");
        chanel2.printNews();
        System.out.println("News from Chanel 3 : ");
        chanel3.printNews();
    }
}
