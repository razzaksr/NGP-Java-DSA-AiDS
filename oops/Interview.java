package oops;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Company company1 = new Company("Cognizant Solutions", "Java Developer", 5.5, 0);
        company1.recruite();
        System.out.println(company1.toString());
    }
}

class Company{
    private String companyName;
    private String roleFor;
    private double packageAmount;
    private int recruitedCount;

    public void recruite(){
        Scanner scan = new Scanner(System.in);
        int eligibleCount = 5;
        while(eligibleCount>0){
            System.out.println("Enter the percentage of the candidate ");
            double percentage = scan.nextDouble();
            System.out.println("Enter the skill set ");
            String skillSet = scan.next();
            if(percentage >= 8.0&&skillSet.equalsIgnoreCase(roleFor.split(" ")[0])){
                recruitedCount++;
                System.out.println("Candidate recruited successfully ");
            }
            else{
                System.out.println("Candidate is not eligible ");
            }
            eligibleCount--;
        }
        scan.close();
    }

    public Company(String companyName, String roleFor, double packageAmount, int recruitedCount){
        this.companyName = companyName;
        this.roleFor = roleFor;
        this.packageAmount = packageAmount;
        this.recruitedCount = recruitedCount;
    }
    @Override
    public String toString() {
        return "Company [companyName=" + companyName + ", roleFor=" + roleFor + ", packageAmount=" + packageAmount
                + ", recruitedCount=" + recruitedCount + "]";
    }
    public Company() {
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getRoleFor() {
        return roleFor;
    }
    public void setRoleFor(String roleFor) {
        this.roleFor = roleFor;
    }
    public double getPackageAmount() {
        return packageAmount;
    }
    public void setPackageAmount(double packageAmount) {
        this.packageAmount = packageAmount;
    }
    public int getRecruitedCount() {
        return recruitedCount;
    }
    public void setRecruitedCount(int recruitedCount) {
        this.recruitedCount = recruitedCount;
    }    
}
