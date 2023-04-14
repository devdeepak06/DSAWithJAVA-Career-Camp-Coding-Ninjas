public class Tries {
    private static final int R = 256; // extended ASCII
    private Node root = new Node();

    private static class Node {
        private Object val;
        private Node[] next = new Node[R];
    }

    public Object get(String key) {
        Node x = get(root, key, 0);
        if (x == null)
            return null;
        return x.val;
    }

    private Node get(Node x, String key, int d) {
        if (x == null)
            return null;
        if (d == key.length())
            return x;
        char c = key.charAt(d);
        return get(x.next[c], key, d + 1);
    }

    public void put(String key, Object val) {
        root = put(root, key, val, 0);
    }

    private Node put(Node x, String key, Object val, int d) {
        if (x == null)
            x = new Node();
        if (d == key.length()) {
            x.val = val;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = put(x.next[c], key, val, d + 1);
        return x;
    }

}
