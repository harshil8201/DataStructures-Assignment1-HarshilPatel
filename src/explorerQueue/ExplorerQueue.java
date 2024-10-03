package src.explorerQueue;

public class ExplorerQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize
    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        size = 0;
        rear = capacity - 1;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue new explorer
    public void enqueue(String explorer) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = explorer;
        size++;
    }

    // Dequeue explorer
    public String dequeue() {
        if (isEmpty()) {
            return "Queue is empty.";
        }
        String explorer = queue[front];
        front = (front + 1) % capacity;
        size--;
        return explorer;
    }

    // Display next explorer in line
    public String peek() {
        if (isEmpty()) {
            return "Queue is empty.";
        }
        return queue[front];
    }

    // Example usage
    public static void main(String[] args) {
        ExplorerQueue queue = new ExplorerQueue(3);

        // Enqueue explorers
        queue.enqueue("Explorer A");
        queue.enqueue("Explorer B");
        queue.enqueue("Explorer C");

        // Try to enqueue another explorer
        queue.enqueue("Explorer D"); // This should show "Queue is full."

        // Display the next explorer in line
        System.out.println("Next explorer: " + queue.peek());

        // Dequeue explorers and display them
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Display the next explorer in line after dequeuing
        System.out.println("Next explorer: " + queue.peek());

        // Enqueue another explorer
        queue.enqueue("Explorer D");

        // Dequeue remaining explorers
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue()); // This should show "Queue is empty."
    }
}
