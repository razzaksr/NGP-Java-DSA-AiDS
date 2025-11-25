package oops;

import java.util.Scanner;

public class Contact {
    private String name;
    private String email;
    private long phoneNumber;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Contact() {
    }
    public Contact(String name, String email, long phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Contact [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
class App{
    public static void main(String[] args) {
        Contact contact1 = new Contact("Alice", "alice@example.com", 1234567890L);
        System.out.println("Contact 1 details: \n");
        System.out.println(contact1.getName());
        System.out.println(contact1.getEmail());
        System.out.println(contact1.getPhoneNumber());

        Scanner scan = new Scanner(System.in);

        Contact contact2 = new Contact();
        System.out.println("Tell us name of the contact ");
        String tempName = scan.nextLine();
        contact2.setName(tempName);
        contact2.setEmail(scan.next());
        contact2.setPhoneNumber(scan.nextLong());
        System.out.println("Contact 2 details: \n");
        System.out.println(contact2);
        scan.close();
    }
}
