public class TrieUse {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("APPLE");
        trie.add("AND");

        System.out.println(trie.search("APPLE"));
        System.out.println(trie.search("AND"));
        System.out.println(trie.countWords());

    }
}
