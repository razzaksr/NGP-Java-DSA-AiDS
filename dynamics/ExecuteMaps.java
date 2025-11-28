package dynamics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class ExecuteMaps {
    public static void main(String[] args) {
        HashMap<String,Long> mapOne = new HashMap<>();
        mapOne.put("Razak Mohamed S",87654567654L);
        mapOne.put("Vetrikanth",4567898765L);
        mapOne.put("Razak Mohamed S", 111111111L);
        mapOne.put("Sabarinathan", 111111111L);
        TreeMap<String,Long> mapTwo = new TreeMap<>();
        mapTwo.putAll(mapOne);
        System.out.println("Hashmap\n"+mapOne);
        System.out.println("Treemap\n"+mapTwo);
        mapOne.remove("Razak Mohamed S");
        System.out.println(mapOne.containsValue(111111111L));
        System.out.println(mapTwo.containsKey("Razak Mohamed S"));
        System.out.println(mapTwo.get("Dharun"));
        Set<String> names = mapTwo.keySet();
        System.out.println(names);
        Collection<Long> numbers = mapTwo.values();
        System.out.println(numbers);
    }
}
