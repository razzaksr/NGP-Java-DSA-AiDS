package lld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service serv=new Service();
        Scanner sc=new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1. Assign Bus\n2. Update Bus\n3. Fetch All Buses\n4. Delete Bus by RegNo\nAny to Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("To assign the bus ");
                    CollegeBus bus1=new CollegeBus();
                    bus1.setRegNo(sc.next());
                    bus1.setDriverName(sc.next());
                    bus1.setContact(sc.nextLong());
                    bus1.setRouteId(sc.nextInt());
                    bus1.getStops().add(sc.next());
                    bus1.getStudents().add(sc.next());
                    serv.assign(bus1);
                    break;
                case 2: System.out.println("Still in progress");
                        break;
                case 3: System.out.println(serv.fetchAll());
                        break;
                case 4: System.out.println("Enter reg no to delete");
                        String regNo = sc.next();
                        serv.deleteByRegNo(regNo);
                        break;
                default: System.out.println("Exiting...");
                        sc.close();
                        return;
            }   
        }while(true);
        
        // serv.deleteByRegNo("TN-09-AB-1234");
        // System.out.println(serv.fetchAll());
    }
}
