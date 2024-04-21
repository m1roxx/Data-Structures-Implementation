public class MyMinHeap<T extends Comparable<T>> {

    private static final int DEFAULT_CAPACITY = 10;
    private MyArrayList<T> heap;
    private int size;

    public MyMinHeap() {
        heap = new MyArrayList<>();
        size = 0;
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T getMin() {
        if (empty()) {
            throw new RuntimeException("Heap is empty");
        }
        return heap.get(0);
    }

    public T extractMin() {
        if (empty()) {
            throw new RuntimeException("Heap is empty");
        }
        T min = heap.get(0);
        heap.set(0, heap.get(size - 1));
        size--;
        heapify(0);
        return min;
    }

    public void insert(T item) {
        heap.add(item);
        traverseUp(size);
        size++;
    }

    private void heapify(int index) {
        int leftChild = leftChildOf(index);
        int rightChild = rightChildOf(index);
        int smallest = index;
        if (leftChild < size && heap.get(leftChild).compareTo(heap.get(smallest)) < 0) {
            smallest = leftChild;
        }
        if (rightChild < size && heap.get(rightChild).compareTo(heap.get(smallest)) < 0) {
            smallest = rightChild;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void traverseUp(int index) {
        int parent = parentOf(index);
        while (index > 0 && heap.get(index).compareTo(heap.get(parent)) < 0) {
            swap(index, parent);
            index = parent;
            parent = parentOf(index);
        }
    }

    private int leftChildOf(int index) {
        return 2 * index + 1;
    }

    private int rightChildOf(int index) {
        return 2 * index + 2;
    }

    private int parentOf(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        T temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
}
