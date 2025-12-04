package tree;

import java.util.LinkedList;
import java.util.Queue;

class AVLNode{
    String data;
    int height;
    AVLNode left, right;
    public AVLNode(String value){
        this.data = value; height=1;
        this.left=this.right=null;
    }
}

public class AVLImplementation {
    private AVLNode root;
    
    public int getHeight(AVLNode node){
        return (node==null)?0:node.height;
    }
    public int getBalanceFactor(AVLNode node){
        return (node==null)?0:
        getHeight(node.left)-getHeight(node.right);
    }
    public AVLNode rightRotation(AVLNode alpha){
        AVLNode beta = alpha.left;
        AVLNode cosmo = beta.right;
        //rotate
        beta.right = alpha;
        alpha.left = cosmo;
        // update heights of alpha and beta
        alpha.height = Math.max(getHeight(alpha.left),
        getHeight(alpha.right))+1;
        beta.height = Math.max(getHeight(beta.left), 
        getHeight(beta.right))+1;
        return beta;
    }
    public AVLNode leftRotation(AVLNode alpha){
        AVLNode beta = alpha.right;
        AVLNode cosmo = beta.left;
        //rotate
        beta.left = alpha;
        alpha.right = cosmo;
        // update heights of alpha and beta
        alpha.height = Math.max(getHeight(alpha.left),
        getHeight(alpha.right))+1;
        beta.height = Math.max(getHeight(beta.left), 
        getHeight(beta.right))+1;
        return beta;
    }
    public AVLNode insertInAvl(AVLNode node, String value){
        if(node==null) return new AVLNode(value);
        if(value.compareTo(node.data)<0)
            node.left = insertInAvl(node.left,value);
        else if(value.compareTo(node.data)>0)
            node.right = insertInAvl(node.right,value);
        else 
            return node;// found duplicate
        // update current node height
        node.height = Math.max(getHeight(node.left),getHeight(node.right))+1;
        // get balance factor for the current node
        int factor = getBalanceFactor(node);
        // check whether rotation is required if so find out which rotation
        // perform right rotation if insertion is LeftLeft
        if(factor>1&&value.compareTo(node.left.data)<0)
            return rightRotation(node);
        // perform left rotation if insertion rightright
        if(factor<-1&&value.compareTo(node.right.data)>0)
            return leftRotation(node);
        // perform Left rotation followed by right since insertion leftright
        if(factor>1&&value.compareTo(node.left.data)>0){
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        // perform right and left rotation since right left insertion
        if(factor<-1&&value.compareTo(node.right.data)<0){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    public void buildAvl(String[] arr){
        for(String temp:arr) 
            root = insertInAvl(root, temp);
    }
    // Bredth first traversal
    public void levelOrder(AVLNode root){
        if(root==null) return;
        Queue<AVLNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            AVLNode polled = queue.poll();
            System.out.print(polled.data+" -> ");
            if(polled.left!=null) queue.offer(polled.left);
            if(polled.right!=null) queue.offer(polled.right);
        }
    }
    public static void main(String[] args) {
        // String[] skills = {"Spring","Applet","ActiveMQ"};
        AVLImplementation caller = new AVLImplementation();
        // String[] skills = {"Hibernate","JDBC","JSP"};
        // String[] skills = {"Spring","Applet","Servlet"};
        String[] skills = {"JDBC","JSP","JPQL"};
        caller.buildAvl(skills);
        System.out.println("\nLevel order");
        caller.levelOrder(caller.root); 
    }
}
