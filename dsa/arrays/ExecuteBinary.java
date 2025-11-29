package arrays;

public class ExecuteBinary {
    public static int enquiry(String[] arr, String desired, int beg, int end){
        if(beg<=end){
            int mid = beg+(end-beg)/2;
            if(arr[mid].compareTo(desired)==0)
                return mid;
            else if(arr[mid].compareTo(desired)>0)
                return enquiry(arr, desired, beg, mid);
            else
                return enquiry(arr, desired, mid+1, end);
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] companies = {"Cognizant","accenture","capgemini","techmahindra"};
        String lookingfor = "accenture";
        int found = enquiry(companies, lookingfor, 0, companies.length-1);
        System.out.println(found+" is the day when "+lookingfor);
        lookingfor = "Cognizant";
        found = enquiry(companies, lookingfor, 0, companies.length-1);
        System.out.println(found+" is the day when "+lookingfor);
        lookingfor = "capgemini";
        found = enquiry(companies, lookingfor, 0, companies.length-1);
        System.out.println(found+" is the day when "+lookingfor);
        lookingfor = "techmahindra";
        found = enquiry(companies, lookingfor, 0, companies.length-1);
        System.out.println(found+" is the day when "+lookingfor);
    }
}
