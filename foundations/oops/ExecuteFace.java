package oops;

public class ExecuteFace {
    public static void main(String[] args) {
        Readable readable = new YouTube();// upcasting
        readable.read();
        readable = new Amazon();// upcasting
        readable.read();
    }
}
interface Readable{
    void read();// abstract method
}
class Amazon implements Readable{
    int[] itemPrice = {1500, 2500, 3500, 4500, 5500};
    // non abstract method

    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Item Prices on Amazon: ");
        for(int price : itemPrice){
            System.out.println(price);
        }
    }
    

}
class YouTube implements Readable{
    String[] videoTitles = {"Java Basics", "OOP Concepts", "Data Structures", "Algorithms", "Design Patterns"};
    // non abstract method
    @Override
    public void read() {
        System.out.println("Video Titles on YouTube: ");
        for(String title : videoTitles){
            System.out.println(title);
        }
    }
}