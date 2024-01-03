package _01_tree.heap;

import jdk.internal.util.ArraysSupport;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public non-sealed class ArrayHeap<T> extends AbstractHeap<T> {

    private Object[] data;
    private int size;
    private final Comparator<? super T> comparator;
    private static final int DEFAULT_CAPACITY = 11;

    public ArrayHeap(Comparator<? super T> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public ArrayHeap(int maxSize, Comparator<? super T> comparator) {
        this.data = new Object[maxSize + 1];
        this.size = 0;
        this.comparator = comparator;
    }

    @SuppressWarnings("unchecked")
    public void insert(T val) {
        if(val == null) {
            throw new NullPointerException();
        }

        int current = ++this.size;

        if (current >= data.length)
            grow(current + 1);

        this.data[current] = val;

        while (
                this.data[parent(current)] != null &&
                        comparator.compare((T) this.data[current], (T) this.data[parent(current)]) > 0
        ) {
            Collections.swap(Arrays.asList(this.data), current, parent(current));
            current = parent(current);
        }
    }

    @Override
    public boolean contains(T val) {
        for (int i = 1; i < this.size; i++) {
            if (val.equals(this.data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        T top = (T) this.data[1];//루트 노드 값

        int lastIdx = this.size--;

        if(lastIdx > 1) {
            this.data[1] = this.data[lastIdx];
            heapify(1);
        }

        this.data[lastIdx] = null;
        return top;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if (this.size < 1)
            throw new RuntimeException();
        return (T) this.data[1];
    }

    @Override
    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    private void heapify(int idx) {
        if(isLeaf(idx)) {
            return;
        }

        T current = (T) this.data[idx];
        T left = (T) this.data[leftChild(idx)];
        T right = (T) this.data[rightChild(idx)];

        if (comparator.compare(current, left) < 0 || comparator.compare(current, right) < 0) {
            if (comparator.compare(left, right) > 0) {
                Collections.swap(Arrays.asList(this.data), idx, leftChild(idx));
                heapify(leftChild(idx));
            } else {
                Collections.swap(Arrays.asList(this.data), idx, rightChild(idx));
                heapify(rightChild(idx));
            }
        }
    }

    /**
     * TODO 배열 유동 증가
     * @param minCapacity
     */
    private void grow(int minCapacity) {
        int oldCapacity = this.data.length;
        int newCapacity = ArraysSupport.newLength(oldCapacity,
                                                  minCapacity - oldCapacity,
                                                  oldCapacity < 64 ? oldCapacity + 2 : oldCapacity >> 1);
        this.data = Arrays.copyOf(this.data, newCapacity);
    }
}
