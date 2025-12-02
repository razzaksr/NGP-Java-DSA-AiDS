package queue;

import java.util.Deque;
import java.util.Hashtable;
import java.util.LinkedList;

public class LeastRecentlyUsedCache {
    private Deque<String> deque;
    private int capacity;
    private Hashtable<String,Long> contact;
    public LeastRecentlyUsedCache(int cap){
        this.capacity = cap;
        this.deque = new LinkedList<>();
        this.contact = new Hashtable<>();
    }
    public void save(String name, Long number){
        // replace in dequq when exists caontact name inserted
        if(contact.contains(name)){
            deque.remove(name);
            deque.addFirst(name);
            contact.put(name, number);
            System.out.println(name+" has been updated");
            return;
        }
        // cache memory full, remove LeastRecentlyUsedCache
        if(deque.size()==capacity){
            String leastUsed  = deque.removeLast();
            contact.remove(leastUsed);
            System.out.println("Deleted contact "+ leastUsed);
        }
        // new contact simply add
        contact.put(name, number);
        deque.addFirst(name);
        System.out.println(name+" has been saved");
    }
    public void findAll(){
        System.out.println("Cache memory MostRecentlyUsed -> LeastRcentlyUsed");
        for(String name:deque){
            System.out.println(name+" "+contact.get(name));
        }
    }
    public static void main(String[] args) {
        LeastRecentlyUsedCache cache1=new LeastRecentlyUsedCache(3);
        cache1.save("Razak Mohamed S", 98765676563L);
        cache1.save("Sabarinathan", 6787656765334L);
        cache1.save("Murali", 87656787676L);
        cache1.save("Manikandan", 45676545676L);
        cache1.findAll();
    }
}
