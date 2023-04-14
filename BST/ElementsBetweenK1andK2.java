public class ElementsBetweenK1andK2 {
    // Binary Tree Node class
    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data > k1) {
            elementsInRangeK1K2(root.left, k1, k2);
        }else if(root.data < k2){
            elementsInRangeK1K2(root.right, k1, k2);
        }
        else{
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.left, k1, k2);
            elementsInRangeK1K2(root.right, k1, k2);
        }
        // if (root.data >= k1 && root.data <= k2) {
        //     System.out.print(root.data + " ");

        // }
        // if (root.data < k2) {
        //     elementsInRangeK1K2(root.right, k1, k2);
        // }
    }

    public static void main(String[] args) {
        ElementsBetweenK1andK2 elementsBetweenK1andK2 = new ElementsBetweenK1andK2();
        BinaryTreeNode<Integer> root = elementsBetweenK1andK2.new BinaryTreeNode<>(8);
        root.left = elementsBetweenK1andK2.new BinaryTreeNode<>(5);
        root.right = elementsBetweenK1andK2.new BinaryTreeNode<>(10);
        root.left.left = elementsBetweenK1andK2.new BinaryTreeNode<>(2);
        root.left.right = elementsBetweenK1andK2.new BinaryTreeNode<>(6);
        root.right.left = elementsBetweenK1andK2.new BinaryTreeNode<>(9);
        root.right.right = elementsBetweenK1andK2.new BinaryTreeNode<>(11);

        elementsInRangeK1K2(root, 6, 10);
    }

}
