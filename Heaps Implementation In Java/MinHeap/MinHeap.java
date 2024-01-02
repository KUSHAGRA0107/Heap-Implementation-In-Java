import java.util.ArrayList;
class Heaps {
    ArrayList<Integer> heap;

    Heaps() {
        heap = new ArrayList<>();
    }

    private int Parent(int index) {
        return (int) ((index - 1) / 2);
    }

    private int rightChild(int index) {
        return (2 * index) + 2;
    }

    private int leftChild(int index) {
        return (2 * index) + 1;
    }

    private void heapify(ArrayList<Integer> heap, int index) {
        int size = heap.size();
        int maxIndex = index;
        int lc = leftChild(index);
        int rc = rightChild(index);
        if (lc < size && heap.get(lc) < heap.get(maxIndex)) {
            maxIndex = lc;
        }
        if (rc < size && heap.get(rc) < heap.get(maxIndex)) {
            maxIndex = rc;
        }
        if (index != maxIndex) {
            int temp = heap.get(index);
            heap.set(index, heap.get(maxIndex));
            heap.set(maxIndex, temp);
            this.heapify(heap, maxIndex);
        }
    }

    public void add(int data) {// O(LOG N) as tree height is max log n for complete binary tree

        heap.add(data);// Add data to the end of the queue
        int index = heap.size() - 1;// Index of the element added
        int parent = Parent(index);// Index of immediate parent of added child
        while (parent >= 0 && heap.get(parent) > heap.get(index)) {
            int temp = heap.get(index);
            heap.set(index, heap.get(parent));
            heap.set(parent, temp);
            index = parent;
            parent = Parent(index);
        }
    }

    public void remove() {
        if (heap.size() == 0) {
            System.out.println("Empty Heap");
        } else {
            int max = heap.get(0);// storing the value of maximum priority element in the variable
            heap.set(0, heap.get(heap.size() - 1));// swapping last value with the first value
            heap.remove(heap.size() - 1);
            this.heapify(heap, 0);
            System.out.println(max);
        }
    }

    public int peek() {
        return heap.get(0);
    }

    public void display() {
        System.out.println(heap);
    }
}

public class MinHeap {
    public static void main(String[] args) {
        Heaps heap = new Heaps();

        // Adding value to the heaps
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        heap.add(5);
        heap.add(70);

        System.out.println(heap.peek());
        heap.display();

        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();
        heap.remove();

    }
}