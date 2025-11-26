package oops;

public class ExecuteDifference implements Alpha {
    public static void main(String[] args) {
        Alpha alpha = new ExecuteDifference();// upcasting
        // alpha.email="razzaksr@gmail.com"; // final variable cannot be changed
        alpha.displayDetails();
    }
    @Override
    public void displayDetails() {
        System.out.println("Email: "+email);
        System.out.println("Mobile Number: "+mobileNumbe);
    }
}
// data members of interface are by default public static final
interface Alpha{
    // final variable>> it cannot be modified
    String email="";
    long mobileNumbe=0L;
    // by default methods are public abstract
    public void displayDetails();// abstract method
}