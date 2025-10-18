public class Stack {
	private Book[] books;
	private int maxSize;
	private int top;

	public Stack() {
		this.maxSize = 4;
		this.books = new Book[maxSize];
		this.top = -1;
	}

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.books = new Book[maxSize];
		this.top = -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(Book book) {
		if (!isFull()) {
			books[++top] = book;
		} else {
			System.out.println("The stack is full!");
		}
	}

	public Book pop() {
		if (!isEmpty()) {
			return books[top--];
		} else {
			System.out.println("Stack is empty!");
			return null;
		}
	}

	public Book peek() {
		if (!isEmpty()) {
			return books[top];
		} else {
			System.out.println("Stack is empty!.");
			return null;
		}
	}

	public int size() {
		return top + 1;
	}

	public void popAllItems() {
		if (!isEmpty()) {
			while (!isEmpty()) {
				System.out.println(books[top--].toString());
			}
		} else {
			System.out.println("Stack is empty!");
		}
	}
}
