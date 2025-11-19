package LinkedListApplication;

public class LinkedQueue {
    private LinkedList list;
    
    public LinkedQueue() {
        list = new LinkedList();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int getSize() {
        return list.getSize();
    }
    public void enqueue(int data) {
        list.insertAtEnd(data);
    }
    public int dequeue() {
        return list.deleteFromStart();
    }
    public int peek() {
        return list.peekAtStart();
    }
    public void dequeueAll() {
        System.out.print("\nDequeuing all items: ");
        while (!isEmpty()) {
            System.out.print(dequeue() + " ");
        }
    }
}
