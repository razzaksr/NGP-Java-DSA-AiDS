package dynamics;

import java.util.Arrays;

public class CRUD {
    public static void main(String[] args) {
        Service<String> service1 = new Service<>(5);
        service1.save("Node JS");
        service1.save("React JS");
        service1.save("MongoDB");
        service1.findAll();
        service1.update(3, "Angular JS");
        service1.findAll();
        String deleted = service1.deleteByIndex(1);
        System.out.println("Deleted value: " + deleted);
        service1.findAll();

        Service<Integer> service2 = new Service<>(3);
        service2.save(100);
        service2.save(200);
        service2.findAll();

        Service<Double> service3 = new Service<>();
        service3.save(99.99);
        service3.findAll();

        Service<Long> service4 = new Service<>(2);
        service4.save(9999999999L);
        service4.findAll();
    }
}
class Service<T> implements Operations<T>{
    private T[] storage;
    public Service(){
        storage = (T[]) new Object[10];
    }
    public Service(int size){
        storage = (T[]) new Object[size];
    }
    // O(n) linear check for null
    @Override
    public void save(T value) {
        for(int index = 0; index < storage.length; index++){
            if(storage[index] == null){
                storage[index] = value;
                System.out.println(value + " Saved at index: " + index);
                return;
            }
        }
        System.out.println("Storage is full, cannot save " + value);
    }
    // O(1) since toString called
    // O(n) if read operation would have done by linear/loop
    @Override
    public void findAll() {
        System.out.println(Arrays.toString(storage));
    }
    // O(1) since index not checked via linear/loop
    @Override
    public void update(int index, T newValue) {
        if(index >= 0 && index < storage.length){
            T oldValue = storage[index];
            storage[index] = newValue;
            System.out.println("Updated index " + index + " from " + oldValue + " to " + newValue);
        } else {
            System.out.println("Invalid index: " + index);
        }
    }
    // O(1) since index not checked via loop
    @Override
    public T deleteByIndex(int index) {
        if(index >= 0 && index < storage.length){
            T deletedValue = storage[index];
            storage[index] = null;
            return deletedValue;
        } else {
            System.out.println("Invalid index: " + index);
            return null;
        }
    }
}
interface  Operations<T> {
    void save(T value);
    void findAll();
    void update(int index, T newValue);
    T deleteByIndex(int index);
}