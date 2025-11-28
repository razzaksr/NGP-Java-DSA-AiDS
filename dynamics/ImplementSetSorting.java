package dynamics;

import java.util.TreeSet;

import oops.Laptop;

public class ImplementSetSorting {
    public static void main(String[] args) {
        TreeSet<Laptop> myLaptops = new TreeSet<>();
        myLaptops.add(new Laptop(
            4,"HP Pavilion",512,45900));
        myLaptops.add(new Laptop(
            16,"Acer Gamebox",1024,76000));
        myLaptops.add(new Laptop(
            32,"Dell Vostro",1024,91900));
        myLaptops.add(new Laptop(
            16,"Dell Latitude",512,52000));
        for(Laptop temp:myLaptops){
            System.out.println(temp);
        }
    }
}
