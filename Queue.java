public class Queue {
    private Node front;
    private Node rear;
    private int maxSize;
    private int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void insert(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = front.data;
        front = front.next;
        size--;
        if (front == null) {
            rear = null; 
        }
        return data;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(100);
        String input = "1 2 3 4 5 6 7 8 9 10";
        String[] words = input.split(" ");
        for (String word : words) {
            int data = Integer.parseInt(word);
            queue.insert(data);
        }
        queue.display();
    }
}
