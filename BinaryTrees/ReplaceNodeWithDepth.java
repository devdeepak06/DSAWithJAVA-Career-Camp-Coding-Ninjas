package BinaryTrees;

public class ReplaceNodeWithDepth {
    public static void replaceWithDepthValue(BinaryTreeNode<Integer> root) {
        replaceWithDepthValue(root, 0);
    }

    private static void replaceWithDepthValue(BinaryTreeNode<Integer> root, int depth) {
        if (root == null) {
            return;
        }
        root.data = depth;
        replaceWithDepthValue(root.left, depth + 1);
        replaceWithDepthValue(root.right, depth + 1);
    }
    
}
