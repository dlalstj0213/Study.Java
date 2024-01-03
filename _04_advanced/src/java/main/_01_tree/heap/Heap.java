package _01_tree.heap;

public sealed interface Heap<T> permits AbstractHeap {

    void insert(T val);

    boolean contains(T val);

    T pop();

    T peek();

    int size();
}
