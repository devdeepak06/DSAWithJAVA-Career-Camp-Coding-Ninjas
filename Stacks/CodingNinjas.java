//Consider the following pseudo-code that uses a Stack:
// declare a stack of characters
// while ( there are more characters in the word to read )
// {
//    read a character
//    push the character on the stack
// }
// while ( the stack is not empty )
// {
//   pop a character off the stack
//   write the character to the screen
// }
//

package Stacks;

public class CodingNinjas {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingLL<Character> stack = new StackUsingLL<>();
        String word = "codingninjas";
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
    
}
