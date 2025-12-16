package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class AnagramGrouping {
    public static void findAnagram(String[] arr){
        Map<String, List<String>> tab = new Hashtable<>();
        for(String each:arr){
            char[] temp = each.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            tab.putIfAbsent(key, new ArrayList<>());
            tab.get(key).add(each);
        }
        System.out.println(tab.values());
    }
    public static void main(String[] args) {
        String[] strs = 
        {"eat","tea","tan","ate","nat","bat"};
        findAnagram(strs);
    }
}
