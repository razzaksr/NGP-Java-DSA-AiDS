package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    String data;
    Node left;
    Node right;
    public Node(String value){
        this.data = value;
        left=right=null;
    }
}

public class BinarySearchTreeViaArray{
    Node root;
    public Node insert(Node root, String value){
        if(root==null) return new Node(value);
        if(value.compareTo(root.data)<0)
            root.left = insert(root.left,value);
        else if(value.compareTo(root.data)>0)
            root.right = insert(root.right,value);
        return root;
    }
    public void buildBst(String[] arr){
        for(String temp:arr)
            root = insert(root, temp);
    }
    public void inRead(Node root) {
        if(root==null)return;
        inRead(root.left);
        System.out.print(root.data+" -> ");
        inRead(root.right);
    }
    // Bredth first traversal
    public void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node polled = queue.poll();
            System.out.print(polled.data+" -> ");
            if(polled.left!=null) queue.offer(polled.left);
            if(polled.right!=null) queue.offer(polled.right);
        }
    }
    public static void main(String[] args) {
        String[] skills = {"Spring Boot","Applet","Servlet"
        ,"JSP","Hibernate","ActiveMQ","JDBC"};
        BinarySearchTreeViaArray caller = 
        new BinarySearchTreeViaArray();
        caller.buildBst(skills);
        caller.inRead(caller.root);
        System.out.println("\nLevel order");
        caller.levelOrder(caller.root); 
    }
}
