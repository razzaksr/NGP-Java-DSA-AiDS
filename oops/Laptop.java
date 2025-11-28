package oops;

public class Laptop implements Comparable<Laptop> {
    private Integer ram;
    private String model; // setModel
    private Integer ssd;// setSsd
    private Double cost;// serCost
    @Override
    public int compareTo(Laptop o) {
        return this.cost.compareTo(o.cost);
    }
    // setter methods
    // public void setMemberName(datatype var){this.member = var;}
    public void setRam(int tempRam){
        this.ram = tempRam;
    }
    // getter method
    // public datatype getMemberName(){ return this.member;}
    public int getRam(){
        return this.ram;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSsd() {
        return ssd;
    }
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    // default constructor
    public Laptop(){
        System.out.println("Laptop to be initlaized manually");
    }
    // parameterized constructor
    public Laptop(int ram, String model, int ssd, double cost){
        this.ram = ram;
        this.model = model;
        this.ssd = ssd;
        this.cost = cost;
    }
    public Laptop(int ssd, double cost, int ram, String model){
        this.ram = ram;
        this.model = model;
        this.ssd = ssd;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Laptop [ram=" + ram + ", model=" 
        + model + ", ssd=" + ssd + ", cost=" + cost + "]";
    }
}

class ShopKeeper{
    public static void main(String[] args) {
        Laptop dell = new Laptop();
        dell.setRam(16);
        dell.setCost(75000.00);
        dell.setModel("Dell Inspiron");
        dell.setSsd(512);
        System.out.println("Laptop 1 Details:"+dell);

        Laptop hp = new Laptop(8, "HP Pavilion", 256, 55000.89);
        System.out.println("\nLaptop 2 Details:");
        System.out.println("Model: " + hp.getModel());
        System.out.println("RAM: " + hp.getRam() + "GB");
        System.out.println("SSD: " + hp.getSsd() + "GB");
        System.out.println("Cost: ₹" + hp.getCost());

        Laptop asus = new Laptop(1024, 120000.50, 32, "ASUS ROG");;
        System.out.println("\nLaptop 3 Details:");
        System.out.println("Model: " + asus.getModel());
        System.out.println("RAM: " + asus.getRam() + "GB");
        System.out.println("SSD: " + asus.getSsd() + "GB");
        System.out.println("Cost: ₹" + asus.getCost());
    }
}