//Implement the browser history feature. The browser history is a stack of UR;
package Test6;
import java.util.List;

public class BrowserHistory {
    private String[] history;
    private int top;
    private int size;
    List<String> list;
    int total = 0;
    int curr = 0;

    

    public BrowserHistory(int size) {
        this.size = size;
        history = new String[size];
        top = -1;
    }



    public void push(String url) {
        if (top == size - 1) {
            System.out.println("History is full");
            return;
        }
        history[++top] = url;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("History is empty");
            return null;
        }
        return history[top--];
    }

    public String peek() {
        if (top == -1) {
            System.out.println("History is empty");
            return null;
        }
        return history[top];
    }

    public void printHistory() {
        if (top == -1) {
            System.out.println("History is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(history[i]);
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory(5);
        bh.push("www.google.com");
        bh.push("www.facebook.com");
        bh.push("www.youtube.com");
        bh.push("www.amazon.com");
        bh.push("www.flipkart.com");
        bh.push("www.snapdeal.com");
        bh.printHistory();
        System.out.println("Popped: " + bh.pop());
        System.out.println("Popped: " + bh.pop());
        System.out.println("Popped: " + bh.pop());
        System.out.println("Popped: " + bh.pop());
        System.out.println("Popped: " + bh.pop());
        System.out.println("Popped: " + bh.pop());
        System.out.println("Popped: " + bh.pop());

        bh.printHistory();

        bh.push("www.google.com");
        bh.push("www.facebook.com");

    }
}
