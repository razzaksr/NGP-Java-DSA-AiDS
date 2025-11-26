package oops;

public class App extends Products implements Shortlist{
    public static void main(String[] args) {
        App app = new App();
        app.findAll();
        app.findByBoundary(500, 1500);
        app.findMax();
    }

    @Override
    public void findAll() {
        System.out.println("All product prices:");
        for(int price : items){
            System.out.println(price);
        }
    }

    @Override
    public void findMax() {
        int max = items[0];
        for(int price : items){
            if(price > max){
                max = price;
            }
        }
        System.out.println("Maximum product price: " + max);
    }
    
}
interface Shortlist{
    void findMax();
}
abstract class Products{
    int[] items = {1200, 800, 1500, 500, 3000, 700, 400, 600, 2000, 900};
    public abstract void findAll();
    public void findByBoundary(int min, int max){
        System.out.println("Products within price range " + min + " to " + max + ":");
        for(int price : items){
            if(price >= min && price <= max){
                System.out.println(price);
            }
        }
    }
}