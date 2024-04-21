public class MyQueue<T> {

    private MyLinkedList<T> queue;

    public MyQueue() {
        queue = new MyLinkedList<>();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public T peek() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.getFirst();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }
        T item = queue.getFirst();
        queue.removeFirst();
        return item;
    }
}

