package oops;

import java.util.Arrays;

public class ExecuteRide {
    public static void main(String[] args) {
        Filter filter = new Filter();
        filter.showSome();
    }
}
class WareHouse{
    protected String[] products = {"Sony","Phillips","Sandisk","Transcend","Zebronics"};
    public void showSome(){
        System.out.println(Arrays.toString(products));
    }
}
class Filter extends WareHouse{
    // override
    public void showSome(){
        System.out.println("Before Filtering products");
        super.showSome();
        for(String prod : products){
            if(prod.startsWith("S")){
                System.out.println(prod);
            }
        }
    }
}