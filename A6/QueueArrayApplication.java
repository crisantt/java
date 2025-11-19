package QueueArrayApplication;

import java.util.Scanner;

public class QueueArrayApplication {
     public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        QueueArray q = new QueueArray(input.length());
        StackArray stack = new StackArray(input.length());

        System.out.println("String length: " + input.length());
        
        for(int i = 0; i<input.length(); i++)
        {
            q.enqueue(input.charAt(i));
            stack.push(input.charAt(i));
        }
            
        System.out.println("Queue: ");
        for(int i = 0; i < input.length(); i++)
            System.out.print(q.dequeue() + " ");

        System.out.println("\nStack: ");
        for(int i = 0; i < input.length(); i++)
            System.out.print(stack.pop() + " ");
    
     }
}
