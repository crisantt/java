package LinkedListApplication;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);  
        q.enqueue(40); 
        q.enqueue(50); 
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.print("Peek: " + q.peek());
        q.dequeueAll();
        // LinkedList list = new LinkedList();
        // list.insertAtStart(10);
        // list.insertAtStart(20);
        // list.insertAtStart(30);
        // list.insertAtEnd(40);
        // list.insertAtEnd(50);
        // list.insertAtEnd(60);
        // System.out.println("Display List: ");
        // list.displayList();
        // System.out.println("\nDelete from start: " + list.deleteFromStart());
        // System.out.println("Delete from start: " + list.deleteFromStart());
        // System.out.println("Delete from end: " + list.deleteFromEnd());
        // System.out.println("Delete from end: " + list.deleteFromEnd());
    }
}
