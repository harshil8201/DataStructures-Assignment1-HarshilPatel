package src.scrollstack;

import java.util.Stack;

public class ScrollStack {
    private Stack<String> stack;

    // Constructor to initialize
    public ScrollStack() {
        stack = new Stack<>();
    }

    // Push a scroll onto the stack
    public void pushScroll(String scroll) {
        stack.push(scroll);
    }

    // Pop the top scroll off the stack
    public String popScroll() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return "Stack is empty.";
        }
    }

    // Peek at the top scroll without removing it
    public String peekScroll() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return "Stack is empty.";
        }
    }

    // Check if a specific scroll title exists in the stack
    public boolean containsScroll(String title) {
        return stack.contains(title);
    }

    // Example usage
    public static void main(String[] args) {
        ScrollStack scrollStack = new ScrollStack();

        // Push scrolls onto the stack
        scrollStack.pushScroll("Scroll of Wisdom");
        scrollStack.pushScroll("Scroll of Fire");
        scrollStack.pushScroll("Scroll of Water");

        // Peek at the top scroll
        System.out.println("Top scroll: " + scrollStack.peekScroll());

        // Check if a specific scroll exists
        System.out.println("Contains 'Scroll of Fire'? " + scrollStack.containsScroll("Scroll of Fire"));

        // Pop a scroll off the stack
        System.out.println("Popped scroll: " + scrollStack.popScroll());

        // Peek again at the top scroll
        System.out.println("Top scroll after pop: " + scrollStack.peekScroll());

        // Pop all scrolls
        System.out.println("Popped scroll: " + scrollStack.popScroll());
        System.out.println("Popped scroll: " + scrollStack.popScroll());

        // Try to pop from an empty stack
        System.out.println("Popped scroll: " + scrollStack.popScroll());
    }
}
