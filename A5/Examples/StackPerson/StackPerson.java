package StackPerson;

public class StackPerson {
	private Person[] persons;
	private int top;
	private int maxSize;

	public StackPerson() {
		this.maxSize = 5;
		this.persons = new Person[maxSize];
		this.top = -1;
	}

	public StackPerson(int maxSize) {
		this.maxSize = maxSize;
		this.persons = new Person[maxSize];
		this.top = -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	/*
	 * public void push(String firstName, String lastName, String email) {
	 * if (!isFull()) {
	 * Person person = new Person(firstName, lastName, email);
	 * persons[++top] = person;
	 * } else {
	 * System.out.println("The stack is full!");
	 * }
	 * }
	 * 
	 * public void pop() {
	 * if (!isEmpty()) {
	 * System.out.println(persons[top--].toString());
	 * } else {
	 * System.out.println("Stack is empty!");
	 * }
	 * }
	 * 
	 * public void peek() {
	 * if (!isEmpty()) {
	 * System.out.println(persons[top].toString());
	 * } else {
	 * System.out.println("Stack is empty!.");
	 * }
	 * }
	 */

	public void push(Person person) {
		if (!isFull()) {
			persons[++top] = person;
		} else {
			System.out.println("The stack is full!");
		}
	}

	public Person pop() {
		if (!isEmpty()) {
			return persons[top--];
		} else {
			System.out.println("Stack is empty!");
			return null;
		}
	}

	public Person peek() {
		if (!isEmpty()) {
			return persons[top];
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
				System.out.println(persons[top--].toString());
			}
		} else {
			System.out.println("Stack is empty!");
		}
	}
}
