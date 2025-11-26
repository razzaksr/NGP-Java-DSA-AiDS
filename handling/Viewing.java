package handling;

public class Viewing {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {98,12,45,24,75,23,86,24,78,9};
        for(int temp:numbers){
            System.out.print(temp+"..");
            Thread.sleep(2000);
        }
    }
}
