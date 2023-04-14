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

public class PalindromePair {

	private TrieNode root;
	public int count;

	public PalindromePair() {
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

	private boolean search(TrieNode root, String word) {
		if (word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if (child == null) {
			return false;
		}

		return search(child, word.substring(1));

	}

	public boolean search(String word) {
		return search(root, word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}

		if (root.isTerminating) {
			System.out.println(word);
		}

		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}

	public void print() {
		print(this.root, "");
	}

	// Function to check if a string is palindrome or not
	public static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) { // check if string is palindrome
			if (str.charAt(i) != str.charAt(len - i - 1)) { // if not return false
				return false;
			}
		}
		return true;
	}

	// Function to check if a string is palindrome or not
	public boolean isPalindromePair(ArrayList<String> vect) {
		String input1 = "";
		String p = "";
		// Insert all words of dictionary into trie
		for (int i = 0; i < vect.size(); i++) { // for each word
			if (!search(root, vect.get(i))) {
				add(vect.get(i));
			}
		}
		// Now check if any word in the vector is a palindrome
		for (int i = 0; i < vect.size(); i++) { // for each word
			p = "";
			input1 = vect.get(i);
			for (int k = 0; k < input1.length(); k++) { // for each character
				p = input1.charAt(k) + p;
			}
			if (search(root, p)) { // if the reverse of the word is present in the trie
				return true;
			}
		}
		
		for (int i = 0; i < vect.size() - 1; i++) { 
			for (int j = i + 1; j < vect.size(); j++) { 
				String check_str = "";
				check_str = check_str + vect.get(i) + vect.get(j);
				if (isPalindrome(check_str)) { // check if the concatenated string is
					return true;
				}
				check_str = vect.get(j) + vect.get(i);
				// check if the concatenated string is
				if (isPalindrome(check_str)) { // palindrome or not
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		PalindromePair t = new PalindromePair();
		ArrayList<String> input = new ArrayList<>();
		input.add("abc");
		input.add("mcba");
		// input.add("cde");
		// input.add("cddc");
		// input.add("cdc");
		System.out.println(t.isPalindromePair(input));
	}

}
