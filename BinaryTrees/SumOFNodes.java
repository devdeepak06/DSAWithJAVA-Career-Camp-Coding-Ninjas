package BinaryTrees;

public class SumOFNodes {
    public static int sum(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int sum = root.data;
        sum += sum(root.left);
        sum += sum(root.right);
        return sum;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        BinaryTreeUse.printTreeDetailed(root);
        System.out.println(sum(root));
    }
}
