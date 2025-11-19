package LinkedListApplication;

public class LinkedList {
    private Node head;
    private Node end;
    private int size;

    public LinkedList() {
        this.head = null;
        this.end = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            end = newNode;
        } else {
            newNode.setLink(head);
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            end = newNode;
        } else {
            end.setLink(newNode);
            end = newNode;
        }
        size++;
    }

    public int deleteFromStart() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
            //System.out.println("List is empty");
            //if this is true, it will return nothing and stop the function here
            
        }
        int data = head.getData();
        head = head.getLink();
        size--;
        if (isEmpty()) {
            end = null;
        }
        return data;
    }

    public int deleteFromEnd() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
            //System.out.println("List is empty");
            //if this is true, it will return nothing and stop the function here
        }
        int tmp = end.getData();
        if (head == end) {
            head = null;
            end = null;
        } else {
            Node ptr = head;
            while (ptr.getLink() != end) {
                ptr = ptr.getLink();
            }
            ptr.setLink(null);
            end = ptr;
        }
        size--;
        return tmp;
    }
    public int peekAtStart() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return head.getData();
    }

    public int peekAtEnd() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return end.getData();
    }


    public void displayList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
    }
}
