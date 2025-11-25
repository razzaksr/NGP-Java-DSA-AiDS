package oops;

public class Calling {
    public static void main(String[] args) {
        BingVideos videos = new BingVideos();
    }
}

class BingVideos extends Bing{
    String[] playlist = {"IoT","Agentic AI"};
    public BingVideos(){
        System.out.println("Welcome to Bing");
    }
}
class Bing{
    public Bing(){
        System.out.println("Welcome to AI enbaled browser");
    }
}