package oops;

import java.util.Arrays;

public class ExecuteFaceMultiple extends DataHouse implements Writable, Readable {
    public static void main(String[] args) {
        ExecuteFaceMultiple efm = new ExecuteFaceMultiple();
        System.out.println(efm.documents.length);
        efm.write(1, "passport");
        efm.read();
    }

    @Override
    public void write(int index, String content) {
        if(index >= 0 && index < documents.length) {
            documents[index] = content;
        } else {
            System.out.println("Invalid index");
        }
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        System.out.println("Documents in DataHouse: ");
        System.out.println(Arrays.toString(documents));
    }
}
class DataHouse{
    String[] documents = {"aadhaar","pan"};
}
interface Writable{
    void write(int index, String content);// abstract method
}