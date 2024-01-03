package _01_tree.heap;

import org.junit.jupiter.api.Test;

public class MaxHeapTest {

    @Test
    void insert() {
        MaxHeap<Integer> heap = new MaxHeap<>();
        heap.insert(1);
        heap.insert(3);
        heap.insert(2);
        heap.insert(5);
        heap.insert(7);
        heap.insert(11);
        heap.insert(4);
        System.out.println(heap.peek());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println("size: " + heap.size());
    }
}
