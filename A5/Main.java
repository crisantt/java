public class Main {
	public static void main(String[] args) {
		// StackPerson persons = new StackPerson();
		// persons.push("Uno", "one", "uno@gmail.com");
		// persons.push("Dos", "two", "dos@gmail.com");
		// persons.push("Tres", "three", "tres@gmail.com");
		// persons.pop();
		// persons.peek();
		// System.out.println("!!!!!!!!!!!!!!!!!!!!!");
		// persons.push("Quatro", "Four", "quatro@gmail.com");
		// persons.popAllItems();

		Book[] libro = new Book();
		StackBook stack = new StackBook();
		stack.setPersonDetails("Uno", "one", "uno@gmail.com");
		stack.push(libro);
		stack.setPersonDetails("Dos", "two", "dos@gmail.com");
		stack.push(libro);

	}
}
