package BinaryTrees;

public class NodesWithoutSiblings {
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        if(root.left == null && root.right != null){
            System.out.println(root.right.data);
        }
        if(root.left != null && root.right == null){
            System.out.println(root.left.data);
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}
}
