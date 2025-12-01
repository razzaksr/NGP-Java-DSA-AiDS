package stacks;

public class NodeImplementation {
    public static void main(String[] args) {
        StackService<Integer> service = new StackService<Integer>();
        service.push(12);
        service.push(24);
        service.push(78);
        service.push(92);
        // System.out.println(service.peek());
        service.viewAll();
        service.pop();
        service.push(56);
        service.viewAll();
    }
}

class StackService<T> implements Operations<T>{
    private Pack<T> top = null;
    @Override
    public void push(T data) {
        Pack<T> welcomePack = new Pack<T>(data);
        if(isEmpty()){
            System.out.println("Stack is empty");
            top = welcomePack;
        }
        else{
            welcomePack.next = top;  // Point new pack to current top
            top = welcomePack;        // Make new pack the top
            System.out.println("Top has been moved to new "+data);
        }
        System.out.println(data+" has been pushed");
    }

    @Override
    public T pop() {
        if(isEmpty()) return null;
        else{
            T data = top.data;
            top = top.next;
            System.out.println(data + " has been popped");
            return data;
        }
    }

    @Override
    public T peek() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        if(top==null) return true;
        return false;
    }

    @Override
    public void viewAll() {
        System.out.println("View all items in the stack");
        Pack<T> traversal = top;
        while(traversal!=null){
            System.out.println(traversal.data);
            traversal = traversal.next;
        }
    }
    
}

class Pack<T>{
    T data;
    Pack<T> next;
    public Pack(T data){
        this.data = data;
        this.next = null;
    }
}

interface Operations<T>{
    void push(T data);
    T pop();
    T peek();
    boolean isEmpty();
    void viewAll();
}