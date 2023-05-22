package behavioralDP.Observer;


import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    // create a variable to store news
    private String news;

    //this list will store news list

    private List<Chanel> chanelList= new ArrayList<>();

    // register chanel
    public  void addObserver(Chanel chanel){
        chanelList.add(chanel);

    }

    //method should be removed

    public  void removeObserver(Chanel chanel){
        chanelList.remove(chanel);
    }

    //sent/update news to the registered channels
    public void sendNews(String news){
        this.news=news;
        for (Chanel chanel:chanelList){
            chanel.update(this.news);
        }
    }



}