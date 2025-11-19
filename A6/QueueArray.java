package QueueArrayApplication;

public class QueueArray {

    private int front, rear, maxSize;
    private char[] q;
    private int numItems;

    public QueueArray() {
        this.maxSize  = 5;
        this.q = new char[maxSize];
        this.front = -1;
        this.rear = -1;
        this.numItems = 0;
    }
    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        this.q = new char[maxSize];
        this.front = -1;
        this.rear = -1;
        this.numItems = 0;
    }
    
    public boolean isFull() {
        //return rear == maxSize-1;
        return numItems == maxSize;
    }
    public boolean isEmpty() {
        return (front == -1 && rear == -1) || (front > rear);
    }
    public int size() {
        return numItems;
    }
    public void enqueue(char value) {
        if (!isFull()) {
            if (isEmpty()) {
                front++;
                rear++; //you can comment this also
            }
            q[rear++] = value; //and use q[++rear] = value;
            numItems++;
        } else {
            System.out.println("The queue is full!");
        }
    }
    public char dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            return '\0';  //null character
        } else {
            numItems--;
            return q[front++];
        }
    }
    public char peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            return '\0'; //null character  
        } else {
            return q[front];
        }
    }
    public void dequeueAllItems()
    {
        if (!isEmpty()) {
            while (!isEmpty()) {
                System.out.print(q[front++] + " ");
            }
        } else {
            System.out.println("Queue is empty!");
        }
    }
}
