import java.util.ArrayList;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class AutoComplete {
    private TrieNode root;
    public int count;

    public AutoComplete() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }

    // public TrieNode findword(TrieNode root, String word) {
    // if (word.length() == 0) {
    // return root;
    // }
    // int childIndex = word.charAt(0) - 'a';
    // TrieNode child = root.children[childIndex];
    // if (child == null) {
    // return null;
    // }
    // return findword(child, word.substring(1));
    // }
    // public void allwords(TrieNode root, String word, String output) {
    // if (root.childCount == 0) {
    // if (output.length() > 0) {
    // System.out.println(word + output);
    // }
    // return;
    // }
    // if (root.isTerminating == true) {
    // System.out.println(word + output);
    // }

    // for (int i = 0; i < root.children.length; i++) {
    // if (root.children[i] != null) {
    // String ans = output + root.children[i].data;
    // allwords(root.children[i], word, ans);
    // }
    // }
    // }

    // public void autoComplete(ArrayList<String> input, String word) {
    // // Write your code here
    // int i = 0;
    // while (i < input.size()) {
    // String w = input.get(i);
    // add(root, w);
    // i++;
    // }
    // if (root == null || root.childCount == 0) {
    // return;
    // }
    // TrieNode w = findword(root, word);
    // String output = "";
    // allwords(w, word, output);
    // }

    
    private TrieNode findPattern(TrieNode root, String word) {
        if (root == null) {
            return null;
        }

        if (word.length() == 0) {
            return root;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        return findPattern(child, word.substring(1));
    }
    // This function prints all the words in the trie which start with the given
    private void print(TrieNode prefix, String word) {
        if (prefix.isTerminating) {
            System.out.println(word);
        }
        if (word.length() == 0) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            TrieNode child = prefix.children[i];
            if (child != null) {
                char c = ((char) ('a' + i));
                String character = Character.toString(c);
                print(child, word + character);
            }
        }
    }

    public void autoComplete(ArrayList<String> input, String word) {
        for (String str : input) {
            add(str);
        }

        TrieNode prefix = findPattern(root, word);
        if (prefix == null) {
            return;
        }
        print(prefix, word);
    }

    public static void main(String[] args) {
        AutoComplete t = new AutoComplete();
        ArrayList<String> input = new ArrayList<>();
        input.add("abc");
        input.add("abcd");
        input.add("ade");
        input.add("akl");
        input.add("def");
        input.add("defg");
        input.add("defgh");
        input.add("defghi");
        input.add("defghij");
        input.add("defghijk");
        input.add("defghijkl");
        input.add("defghijklm");
        input.add("defghijklmn");
        input.add("defghijklmno");
        input.add("defghijklmnop");
        input.add("defghijklmnopq");
        input.add("defghijklmnopqr");

        t.autoComplete(input, "def");

    }
}