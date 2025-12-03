package tree;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int value){
        this.data = value;
        left=right=null;
    }
}

public class MaxPathSumInBinaryTree {
    private int maxSum;
    public int maximumGain(Node node){
        if(node==null) return 0;
        int leftGaining = Math.max(maximumGain(node.left),  0);
        int rightGaining = Math.max(maximumGain(node.right),  0);
        int currentPath = node.data + leftGaining + rightGaining;
        maxSum = Math.max(maxSum, currentPath);
        return node.data + Math.max(rightGaining, leftGaining);
    }
    public static void main(String[] args) {
        Node intTree = new Node(-10);
        intTree.left=new Node(9);
        intTree.right=new Node(20);
        intTree.left.left=new Node(15);
        intTree.left.right=new Node(7);
        // Node intTree = new Node(1);
        // intTree.left=new Node(2);
        // intTree.right=new Node(3);
        // intTree.left.left=new Node(4);
        // intTree.left.right=new Node(5);
        MaxPathSumInBinaryTree call = new MaxPathSumInBinaryTree();
        call.maximumGain(intTree);
        System.out.println("Maximum Path Sum "+call.maxSum);
    }
}
