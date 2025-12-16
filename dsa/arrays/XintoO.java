package arrays;

public class XintoO {
    public static int discoverCount(String board){
        int count = 0;
        for(int index = 0;index<board.length();){
            if(board.charAt(index)=='X'){
                count++;
                index+=3;
            } else index++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(discoverCount("XXX"));
        System.out.println(discoverCount("XOXX"));
        System.out.println(discoverCount("OOOO"));
    }
}
