package arrays;

import java.util.Arrays;
import java.util.List;

public class Linear {
    public static int search(List<Double> list){
        double firstMax = Double.MIN_VALUE,secondMax = Double.MIN_VALUE;
        int secondMaxPosition = -1;
        for(int index = 0; index < list.size(); index++){
            if(list.get(index)>=firstMax){
                secondMax = firstMax;
                secondMaxPosition = list.indexOf(firstMax);
                firstMax = list.get(index);
            }else if(list.get(index)>=secondMax&&list.get(index)!=firstMax){
                secondMax = list.get(index);
                secondMaxPosition=index;
            }
        }
        return secondMaxPosition;
    }
    public static void main(String[] args) {
        List<Double> salaries = Arrays.asList(
            9.2, 8.9, 5.2, 3.5, 1.55, 19.5, 1.8, 7.5, 21.5, 10.5);
        int found = search(salaries);
        System.out.println(found);
    }
}
