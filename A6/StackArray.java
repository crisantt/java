package QueueArrayApplication;

public class StackArray {
    private char[] stack;
    private int top;
    private int maxSize;

    public StackArray() {
        this.maxSize = 5;
        this.stack = new char[5];
        this.top = -1;
    }

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new char[maxSize];
        this.top = -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char value) {
        if (!isFull()) {
            stack[++top] = value;
        } else {
            System.out.println("The stack is full!");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty!");
            return '\0';
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty!.");
            return '\0';
        }
    }

    public int size() {
        return top + 1;
    }

    public void popAllItems() {
        if (!isEmpty()) {
            while (!isEmpty()) {
                System.out.println(stack[top--]);
            }
        } else {
            System.out.println("Stack is empty!");
        }
    }
}
