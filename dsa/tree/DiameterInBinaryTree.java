package tree;

public class DiameterInBinaryTree<T> {
    private int diameter;
    public int findDepth(TreeNode<T> node){
        if(node==null)return 0;
        int leftDepth = findDepth((node.left));
        int rightDepth = findDepth((node.right));
        diameter = Math.max(diameter, (leftDepth+rightDepth));
        return 1+Math.max(leftDepth, rightDepth);
    }
    public static void main(String[] args) {
        TreeNode<Integer> intTree = new TreeNode<Integer>(12);
        intTree.left=new TreeNode<Integer>(90);
        intTree.right=new TreeNode<Integer>(11);
        intTree.left.left=new TreeNode<Integer>(67);
        intTree.left.right=new TreeNode<Integer>(23);
        intTree.right.left=new TreeNode<Integer>(88);
        DiameterInBinaryTree<Integer> object = new DiameterInBinaryTree<>();
        object.findDepth(intTree);
        System.out.println("Diamter of this tree is "+object.diameter);
    }

}
