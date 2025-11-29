package oops;

import java.util.Arrays;

public class ExecuteAbstraction extends Organization {
    public static void main(String[] args) {
        Organization org = new ExecuteAbstraction();// upcasting
        // org.salary[1] = 6.4;
        org.viewAll();
        org.increment();
        org.viewAll();
    }

    // O(n) since linearly check for the 7.5 to update
    @Override
    public void increment() {
        // TODO Auto-generated method stub
        for(int index=0;index<salary.length;index++){
            if(salary[index]<7.5){
                salary[index] += salary[index]*0.05;
            }
        }
    }
}
abstract class Organization{
    Double[] salary = {4.5,9.2,12.5,7.8};// in lakhs
    // non abstract method
    // O(1)
    public void viewAll(){
        System.out.println(Arrays.toString(salary));
    }
    public abstract void increment();
}