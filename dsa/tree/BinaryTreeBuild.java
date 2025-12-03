package tree;

public class BinaryTreeBuild {
    public static void main(String[] args) {
        TreeNode<Integer> intTree = new TreeNode<Integer>(12);
        intTree.left=new TreeNode<Integer>(90);
        intTree.right=new TreeNode<Integer>(11);
        intTree.left.left=new TreeNode<Integer>(67);
        intTree.left.right=new TreeNode<Integer>(23);
        intTree.right.left=new TreeNode<Integer>(88);

        TreeOperations<Integer> service = new BinaryService<Integer>();
        System.out.println("In Order Traversal");
        service.inRead(intTree);
        System.out.println("\npre Order Traversal");
        service.preRead(intTree);
        System.out.println("\npost Order Traversal");
        service.postRead(intTree);
    }
}

class BinaryService<T> implements TreeOperations<T>{
   
    @Override
    public void inRead(TreeNode<T> root) {
        if(root==null)return;
        inRead(root.left);
        System.out.print(root.data+" -> ");
        inRead(root.right);
    }
    @Override
    public void preRead(TreeNode<T> root) {
        if(root==null)return;
        System.out.print(root.data+" -> ");
        preRead(root.left);
        preRead(root.right);
    }

    @Override
    public void postRead(TreeNode<T> root) {
        if(root==null)return;
        postRead(root.left);
        postRead(root.right);
        System.out.print(root.data+" -> ");
    }
}

interface TreeOperations<T>{
    void inRead(TreeNode<T> root);
    void preRead(TreeNode<T> root);
    void postRead(TreeNode<T> root);
}

class TreeNode<T>{
    T data;
    TreeNode<T> left;
    TreeNode<T> right;
    public TreeNode(T value){
        this.data = value;
        left=right=null;
    }
}
