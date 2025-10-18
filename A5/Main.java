public class Main {
	public static void main(String[] args) {
		Stack st = new Stack();
		Book libro = new Book();

		libro.setDetails("Data Analytics", "Jane Doe", "ADNU Press", "6th");
		st.push(libro);
		System.out.println(st.peek());

		libro.setDetails("Differential Equations", "John Doe", "ADNU Press", "10th");
		st.push(libro);
		System.out.println(st.peek());

		libro.setDetails("Basic of Programming", "Karla", "ADNU Press", "10th");
		st.push(libro);
		System.out.println(st.pop());

		// Position of top
		System.out.println("\nPosition of Top: " + st.size());
	}
}
