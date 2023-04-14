public class SumOfGreaterNode {
    static int sum = 0;
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root == null){
            return;
        }

        replaceWithLargerNodesSum(root.right);
        // int sum = 0;
        root.data += sum;
        sum = root.data;
        replaceWithLargerNodesSum(root.left);
        

	}
}
