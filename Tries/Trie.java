import java.util.ArrayList;
class TrieNode{

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

public class Trie {
    private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
    }
    private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));

	}

	public void add(String word){
		add(root, word);
	}
    private boolean searchHelper(TrieNode root, String word){
        if(word.length() == 0){
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return searchHelper(child, word.substring(1));
    }

    public boolean search(String word){
        return searchHelper(root, word);
    }

    public void remove(String word){
        removeHelper(root, word);
    }
    private void removeHelper(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return;
        }
        removeHelper(child, word.substring(1));
        if(!child.isTerminating && child.childCount == 0){
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
    }
    //you need to create one more function (named "countWords" ) which returns the number of words currently present in Trie in O(1) time complexity
    public int countWords(){
        if(root == null)
            return 0;
        count = 0;
        countWordsHelper(root);

        return count;


    }
    private void countWordsHelper(TrieNode root){
        if(root == null)
            return;
        if(root.isTerminating)
            count++;
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null)
                countWordsHelper(root.children[i]);
        }
    }

    //Pattern Matching
    public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here
        for(int i = 0; i < vect.size(); i++){
            add(vect.get(i));
        }
        return search(pattern);
    }
}
