package queue;

public class CircularViaOpp {
    public static void main(String[] args) {
        ParcelService<String> address = new ParcelService<String>();
        address.enqueue("Salem");
        address.enqueue("Coimbatore");
        address.enqueue("Trichy");
        address.findAll();
        String received = address.dequeue();
        System.out.println("What has removed is "+received);
        received = address.dequeue();
        System.out.println("What has removed is "+received);
        received = address.dequeue();
        System.out.println("What has removed is "+received);
        address.findAll();

    }
}

class ParcelService<T> implements ParcelOperations<T>{
    private Parcel<T> front=null;
    private Parcel<T> rear=null;

    public boolean isEmpty(){
        return front==null;
    }

    @Override
    public void enqueue(T value) {
        Parcel<T> newParcel = new Parcel<T>(value);
        if(isEmpty()){
            System.out.println("Queue is empty data will be added at first");
            front=rear=newParcel;
        }
        else{
            rear.next = newParcel;
            rear=newParcel;
            newParcel.next=front;
            System.out.println("data added at rear");
        }
    }

    @Override
    public void findAll() {
        if(isEmpty()){
            System.out.println("Nothing to display");
            return;
        }
        Parcel<T> traverser = front;
        do{
            System.out.println(traverser.data);
            traverser=traverser.next;
        }while(traverser!=front);
    }

    @Override
    public T dequeue() {
        if(isEmpty())
            return null;
        T removed = null;
        if(front==rear){
            removed = front.data;
            front=rear=null;
            System.out.println("Found single data and its removed");
        }else{
            removed = front.data;
            front= front.next;
            rear.next= front;
            System.out.println("Data removed and circular updated");
        }
        return removed;
    }
}

interface ParcelOperations<T>{
    void enqueue(T value);
    void findAll();
    boolean isEmpty();
    T dequeue();
}

class Parcel<T>{
    T data;
    Parcel<T> next;
    public Parcel(T current){
        this.data = current;
    }
}