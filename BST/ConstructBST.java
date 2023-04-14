class BinaryTreeNode <T>{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    public BinaryTreeNode(T data){
        this.data = data;
    }
}
public class ConstructBST {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBST(arr, 0, n-1);

    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = SortedArrayToBST(arr, start, mid-1);
        root.right = SortedArrayToBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        BinaryTreeNode<Integer> root = SortedArrayToBST(arr, n);
        System.out.println(root.data);
    }
}
