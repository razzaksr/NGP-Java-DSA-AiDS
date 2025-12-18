package arrays;

public class ValidateIPV4 {
    public static boolean viaSplit(String ip){
        String[] parts = ip.split("\\.");
        if(parts.length!=4) return false;
        for(String each:parts){
            if(each.length()>3||each.equals("")) return false;
            int numIp = Integer.parseInt(each);
            if(numIp>255||numIp<0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(viaSplit("222.111.111.111"));
        System.out.println(viaSplit("0222.111.111.111"));
        System.out.println(viaSplit("5555..555"));
        System.out.println(viaSplit("0.0.0.255"));
        System.out.println(viaSplit("222.0..12"));
    }
}
